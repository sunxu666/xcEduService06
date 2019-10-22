# xc-framework
学成在线教育项目
##test-fastdfs
FastDFS_文件上传_文件下载
##test-freemarker
网页静态化freemarker
##test-rabbitmq
springboot整合rabbitMQ
##xc-framework-common
公共部分
##xc-framework-model 
实体类等   
##xc-framework-parent
总父类  
##xc-framework-utils 
工具包  
##xc-govern-center
eureka注册中心 
##xc-govern-gateway
zuul网关 
##xc-service-api
接口 
##xc-service-base-filesystem
客户端负载均衡ribbon与feign
##xc-service-learning
学习-视频点播 
##xc-service-manage-cms
课程管理
    mq的生产方-通知cms对应的服务下载GridFS上静态化文件
    页面静态化方法
    页面发布--》向mq 发送消息
##xc-service-manage-cms-client
课程管理
    mq的消费方-监听cms对应的服务并下载GridFS上静态化文件
    页面发布_GridFS
    比xc-service-manage-cms先启动监听
##xc-service-manage-course
课程
+权限Spring oauth2

##xc-service-manage-media
媒资管理_课程计划 
##xc-service-manage-media-processor
媒资管理_课程计划
##xc-service-manage-order
订单服务
##xc-service-search
搜索 
##xc-service-ucenter
用户 
##xc-service-ucenter-auth
整合 
#####TestClient
    远程请求spring security获取令牌
#####TestJwt
    1、创建jwt令牌；
    2、校验jwt令牌；（可以根据jwt令牌查看令牌内容）
#####TestRedis
    1、存储jwt令牌到redis中（并获取redis对象）
    
##登录
###用户授权\视频\09-动态查询用户的权限-认证服务查询用户权限
1、POST：
http://ucenter.xuecheng.com/openapi/auth/userlogin
username    itcast
password    111111    

2、获取令牌--里面有course中course_pic_list权限-就可以操作该方法
http://localhost:31200/course/coursepic/list/4028e58161bd22e60161bd23672a0001
获取headers中
Authorization
Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOiIxIiwidXNlcnBpYyI6bnVsbCwidXNlcl9uYW1lIjoiaXRjYXN0Iiwic2NvcGUiOlsiYXBwIl0sIm5hbWUiOiJ0ZXN0MDIiLCJ1dHlwZSI6IjEwMTAwMiIsImlkIjoiNDkiLCJleHAiOjE1Njc1MzU3NDIsImF1dGhvcml0aWVzIjpbInhjX3RlYWNobWFuYWdlcl9jb3Vyc2VfYmFzZSIsInhjX3RlYWNobWFuYWdlcl9jb3Vyc2VfZGVsIiwieGNfdGVhY2htYW5hZ2VyX2NvdXJzZV9saXN0IiwieGNfdGVhY2htYW5hZ2VyX2NvdXJzZV9wbGFuIiwieGNfdGVhY2htYW5hZ2VyX2NvdXJzZSIsImNvdXJzZV9maW5kX2xpc3QiLCJ4Y190ZWFjaG1hbmFnZXIiLCJ4Y190ZWFjaG1hbmFnZXJfY291cnNlX21hcmtldCIsInhjX3RlYWNobWFuYWdlcl9jb3Vyc2VfcHVibGlzaCIsImNvdXJzZV9waWNfbGlzdCIsInhjX3RlYWNobWFuYWdlcl9jb3Vyc2VfYWRkIl0sImp0aSI6ImFmNTM4NGU2LTFiN2MtNGE0ZC04NDE0LWM2ZmUzNzhlYWZhYyIsImNsaWVudF9pZCI6IlhjV2ViQXBwIn0.GKEa-qRD45o0OSwtFW19LxUiZpxbr8br961NQ1TFXDvHRk5g4aromu3Q9PPRLBUgUasQQp6oALEDcgvit_acLHKR8dGdxNksIYpSV4XsR846TVdEWEnxpaks7d_85UnsujZDnkg8SyVV99CfIbH3axDMyc_TpuXUiVFdtDWBUAhd6GgORou5C_ktwwYT7ooJKoTVEZ3t742SgwXSZbfU2xB5kvqkGb0Qs_NvYK-tJXnoUWkeF7envnuYLWOADIx-h4hPHZxnIbAmqJsKP_MjNtyod62pZmuB7FvY4iHJPjDiwOQQv_0gWVhJWXhCbrSKqZv9fqarbwMAkCVHeWS1GQ


##前端：教学管理中心、系统管理中心、学习管理中心 三个都需要jwt实现身份校验

### ResponseEntity<Map> exchange = restTemplate.exchange(authUrl, HttpMethod.POST, httpEntity, Map.class);这种请求的参考
xcEduService06\xc-service-ucenter-auth\src\main\java\com\xuecheng\auth\service\AuthService.java
com.xuecheng.auth.service.AuthService