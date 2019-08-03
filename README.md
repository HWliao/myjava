# coa-zc 目前的配置只适用于spring web starter
  云办公-资产线项目,包括模块:
  * coa-zc
    > 根模块,用于管理所有模块,项目构建先关
  * coa-zc-_parent
    > 所有模块父项目,主要用于管理依赖.
  * coa-zc-client
    > 远程接口/数据模型
  * coa-zc-common
    > 通用工具模块,包含一些常用工具类,常用常量,常用pojo类,辅助编码工具类
  * coa-zc-core
    > 通用核心服务模块,包含一些统一拦截器/统一切面/统一异常处理/通用组件配置/统一规范先关配置. 对项目/应用的启动基础支撑
  * coa-zc-mall
    > 商城项目 业务相对独立. 前端/后端项目混搭
# coa-zc-mall 目录结构说明
````
├── bin                                         # 项目在各个环境中的启动脚本
│   ├── spring-boot-start-online.sh             # 线上环境启动脚本,目前是直接配置在k8s的配置文件中
│   └── spring-boot-start-test.sh               # 
├── src
│   ├── java
│   │   └── com.leyoujia.coa.zc.xxx
│   │       ├── app_api                         # 移动端接口 相当于 controller           
│   │       ├── controller                      # 控制层 请求入口
│   │       ├── provider                        # 远程调用接口提供者 相当于 controller
│   │       ├── config                          # 应用配置
│   │       ├── service                         # 业务服务层
│   │       ├── manager                         # 资源管理层 对于外部接口的调用/缓存资源使用/数据库资源使用进行管理
│   │       ├── domain                          # 领域模型层 包含各个业务模型抽象 不包括Entity
│   │       ├── dao                             # 数据访问层 目前特指数据库访问
│   │       │   ├── xxx.auto                    # 由mybatis generator 生成,可以满足基本单表操作/不是特别复杂的查询 不可修改
│   │       │   ├── xxx.entity                  # 由mybatis generator 生成,数据库表对应的实体类 不可修改
│   │       │   ├── xxx.mapper                  # mybatis mapper文件目录
│   │       │   └── xxx.xxxDAO                  # dao接口 自动生成的dao接口无法满足时使用
│   │       └── XxxApplication                  # !!应用入口!!
│   ├── resources                               # 资源目录
│   │   ├── config                              # 配置文件目录
│   │   │   ├── application.yml                 # 默认配置文件
│   │   │   ├── application-test.yml            # 测试环境配置文件
│   │   │   ├── application-onlinetest.yml      # 线上测试环境配置文件
│   │   │   └── application-online.yml          # 线上配置文件
│   │   ├── static                              # 静态资源目录
│   │   │   ├── js                              
│   │   │   ├── style                           
│   │   │   ├── images                          
│   │   │   └── plugins                         # 独立插件
│   │   ├── tempaltes                           # 后台页面模板目录
│   │   └── generatorConfig.xml                 # mybatis generator 配置文件
````
#项目构建
    为了对自动构建/持续集成(CI/CD)友好支持,项目使用了maven wrapper,并指定maven版本为3.6.0
    1.maven 3.6.0开始支持parent.version的动态配置,使用了全局属性revision进行配置,可以通过命令进行覆盖,从而动态变更整个项目模块的version
    2.使用maven wrapper指定项目所使用maven版本,主要为了测试人员自动打包/部署时因maven版本不一致打包失败的问题
    注意:若本地安装有maven 3.6.0版本,可以直接使用
````
// 清理
nvmw clean
// 打包
nvmw clean package
// 部署到私服
nvmw clean deploy
````
#### 遗留问题
    1.自定义配置属性注释在.yml中乱码
    2.全局事务不起作用

