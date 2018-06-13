# xcloud
  Xcloud开发平台基于Spring Cloud微服务开发,一个统一授权、认证的后台管理系统，其中包含用户管理、角色权限管理、菜单管理、机构和岗位管理、日志管理等多个模块
# 环境依赖
- JDK 1.8 以上
- IDE 请安装对应IDE的lombok插件
- Nginx 
- 数据库 Mysql 5.1 及以上
- 缓存 Redis 3.2以上
- 消息中间件 RabbitMQ 
# 应用架构
- xcloud-eureka 服务注册与发现中心
- xcloud-config 统一配置中心
- xcloud-auth 基于Spring OAuth2实现的OAuth2认证服务端，其它服务需要依赖此服务进行认证
- xcloud-user 用户中心
- xcloud-basic基础服务
- xcloud-gate基于Spring cloud zuul 实现的api网关 
- xcloud-upload 文件上传中心。
- xcloud-zipkin  数据链路跟踪监控
- xcloud-monitor 基于 Spring boot admin 实现系统监控
## 其他模块：
- xcloud-generate 代码生成器服务
- xcloud-common 项目通用类


