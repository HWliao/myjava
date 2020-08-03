### 项目目的
    需要新建多个项目,此项目目的在于提供一个脚手架
    1.统一项目结构
    2.统一一些常用组件的配置
    3.为项目快速启动提供基础参考
    4.得到一个maven的模板工程
#### 项目结构说明
```
demo-core // 应用核心配置,支持应用运行需要的技术支持
  -- config
  -- component
  -- auto configuration
  -- customer properties
  -- customer component
  -- aop
  -- interceptor

demo-common // 工具类/常量/辅助类
  -- util
  -- common class
  -- constant
  -- enmu

demo-api // 外部使用api, 远程调用接口
  -- module
    -- dto
    -- service application

demo-integration // 调用集成外部接口
  -- remote service
    -- dto
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

demo-application
  -- assembler
  -- dto
  -- web
  -- dubbo
  -- application entry/main class
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
[ ] spring mvc 集成
[ ] swagger集成/YApi集成/Postman集成
[ ] spring mvc 登录拦截器(spring security) 部分项目用到
[ ] spring mvc 统一异常处理
[ ] spring mvc 业务处理上下文 lang/local/timezone/user/org_code/oc..
[ ] 时区转换工具类
[ ] 数据字典转换工具类
[ ] 国际化message集成
[ ] spring mybatis mybatis plus 集成
[ ] spring sharding jdbc 集成
[ ] spring dubbo 集成
[ ] spring dubbo 业务处理上下文传递 lang/local/timezone/user/org_code/oc..
[ ] srping redis 集成
[ ] spring rabbitmq 集成
[ ] spring rocketmq 集成
[ ] spring kafka 集成
[ ] spring mongodb 集成
[ ] spring elasticsearch 集成
[ ] spring apollo 集成
[ ] spring quartz 集成/扩张管理功能
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
