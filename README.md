### 项目目的
    需要新建多个项目,此项目目的在于提供一个脚手架
    1.统一项目结构
    2.统一一些常用组件的配置
    3.为项目快速启动提供基础参考
    4.得到一个maven的模板工程
#### 项目结构说明
```
// maven版本统一,用自动化构建
.mvn
mvnw
mvnw.cmd

bin // 项目启动运行的一些额外配置/脚本

demo-core // 应用核心配置,支持应用运行需要的技术支持
  -- config
  -- component
  -- auto configuration
  -- customer properties
  -- customer component
  -- aop
  -- interceptor

demo-common // 工具类/常量/辅助类/内部共享接口
  -- util
  -- common class
  -- constant
  -- enmu
  // 在应用程序分层上core在service之上, 即service需要在core之下工作
  // 因此service需要依赖core功能来完成工作时,只能依赖接口,通过DI注入真正实现,达到隔离
  // 各个service模块之间的依赖请走远程调用
  -- core-api

demo-api // 外部使用api, 远程调用接口
  -- module
    -- dto
    -- service application

demo-integration // 调用集成外部接口
  -- remote service
    -- dto/vo
    -- encapsulation remote service // 封装外部的远程接口,异常处理等

demo-service // 业务服务
  -- module // 业务模块 DDD中上下文划分, 上下文具有绝对的隔离性
    -- application service // 上下文应用服务,组织领域服务完成业务 此外这里有可能需要完成复杂查询的调用以及组装值对象
    -- domain // 聚合 一个独立业务的合体
      -- domain class vo entity // 聚合中涉及到聚合根/实体/值对象等
      -- domain service // 单个实体业务服务
      -- repository // 仓储层 
        -- dao // 仓储服务
        -- po // 持久化对象
        -- mapper // mapper接口 mybatis
        -- resource xml // mapper接口对应 xml资源

demo-application // 这个应用程序的入口
  -- assembler // 适配器
  -- dto // 传输对象
  -- web // web api
  -- dubbo // 远程调用
  -- application entry/main class // 启动类
```
#### 模块依赖关系说明
```
demo-common --|
demo-api -----|
        demo-integration --|
                    demo-service --|
                            demo-core
	    					demo-application
```
#### 对象名词解释
```
entity 实体 完成业务的基本单元,具备业务动作 服务层中参与业务的主要对象,其他对象需要转化为实体参与业务
vo Value Object 值对象,仅代表值本身不具备动作/方法,一般会依附与实体,参与实体方法完成业务/或者作为返回值在内部传输

po/do Persistent Object/Data Object 持久化对象,对应数据库表 持久层与服务层之间

dto Data Transfer Object 数据传输对象,对外数据传输 出现dubbo远程调用/rest http api, 一般需要通过assembler适配处理(隔离内部外部)

以上几类主要是对应业务编码中涉及到DDD对象,其他的依据实际需要建立
关于对象命名,po/do/dto/vo以对应后缀命名外,其它依据实际意义命名.
```
### 功能
```
[*] 项目基本结构
[*] maven module依赖关系
[*] maven 全局依赖管理
[*] guava/common lang/spring boot 依赖引入
[*] lombok 引入
[*] banner.tx 更换
[*] 多环境多用途配置管理
[*] log4j2集成
[*] spring mvc 集成
[*] swagger集成/YApi集成/Postman集成
[ ] spring mvc 登录拦截器(spring security) 部分项目用到
[ ] spring mvc 统一异常处理
[ ] spring mvc 业务处理上下文 lang/local/timezone/user/org_code/oc..
[ ] spring mvc 自定义CORS过滤器
[ ] 时区转换工具类
[ ] 数据字典转换工具类
[-] 国际化message集成
[-] spring mybatis mybatis plus 集成
[ ] spring sharding jdbc 集成
[-] spring dubbo 集成
[ ] spring dubbo 业务处理上下文传递 lang/local/timezone/user/org_code/oc..
[-] srping redis 集成
[-] spring rabbitmq 集成
[-] spring rocketmq 集成
[ ] spring kafka 集成
[-] spring mongodb 集成
[ ] spring elasticsearch 集成
[*] spring apollo 集成
[-] spring quartz 集成/扩张管理功能
[ ] 线程池上下文传递
```
#### 功能描述
##### log4j2说明
```
在classpath路径下提供了log4j2-spring.xml和log4j2-local-spring.xml,分别用于服务器环境和本地开发环境,
主要区别在于本地开发环境只会将log打印在控制台
启用本地开发环境需要在启动时设置spring.profil.active=local,激活配置文件application-local.yml
在log4j2-spring.xml中使用了到了一些系统属性,这些系统是spring-boot在启动的时候将applicaiton.yml中logging先关写入到系统属性的,
否则log42-spring.xml读取不到, 也就是说log4j2是无法直接读取application.yml中的属性的
```
##### swagger集成说明
```
1.swagger 目前使用了第三个版本
2.swagger 集成未对postman进行测试
```
