# xcloud
  Xcloud开发平台基于Spring Cloud微服务开发,一个统一授权、认证的后台管理系统，其中包含用户管理、角色权限管理、菜单管理、机构和岗位管理、日志管理等多个模块
# 环境依赖
- JDK 1.8 以上
- IDEA 请安装对应IDE的lombok插件
- Nginx 
- 数据库 Mysql 5.1 及以上
- 缓存 Redis 3.2以上
- 消息中间件 RabbitMQ 
# 应用架构
- xcloud-eureka SpringCloud服务注册与发现中心
- xcloud-config SpringCloud统一配置中心
- xcloud-auth 基于Spring OAuth2实现认证服务端
- xcloud-user 用户中心服务
- xcloud-basic 基础服务，提供基础功能
- xcloud-gate 基于SpringCloud Zuul 实现的网关 
- xcloud-upload 文件上传中心
- xcloud-zipkin  数据链路跟踪监控
- xcloud-monitor 基于 SpringBoot Admin 实现系统级监控
## 其他模块：
- xcloud-generate 代码生成器服务
- xcloud-common 项目通用类

# 技术栈
## 后端
-	Spring Cloud
-	Spring Boot
-	Mybatis
-	MybatisPlus
-	Redis
-	RabbitMQ
-	OAuth2
-	JWT Token
-	…
## 前端
-	Node
-	Angular4
-	…

# 主要功能
-	用户管理：用户是系统操作者，主要对系统用户进行管理。
-	机构管理：配置系统组织机构（公司、部门、小组），树结构展现 
-	岗位管理：机构的岗位设置，可根据岗位进行数据权限过滤
-	区域管理： 对系统提供国家地区支持
-	菜单管理：配置系统菜单，操作权限，按钮权限标识等。
-	角色管理：角色菜单权限分配
-	字典管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否、男女、类别、级别等。
-	系统日志：系统正常操作日志记录和查询，登录日志的查询。

