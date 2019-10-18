# Dubbo-Repository
my Dubbo Learning

（一）学习Dubbo的一个小Demo
1、定义Dubbo-interface 存放各种entity以及公用接口
2、user-service-provider1作为提供者
3、order-service-consumer1作为消费者
4、无论是提供者还是消费者都必须在启动类加上dubbo注解@EnableDubbo(scanBasePackages = "com.hqj.dubbo")
5、使用之前需安装zookeeper作为中间件，开放默认zookeeper端口2181
6、另外也可以上官网下载DubboAdmin管理中心和Monitor监控中心对服务更加具体的掌控

（二）provider端
1、在provider端显示三种配置方式：硬编码、application.yml和dubbo.properties(需配合@ImportResource注解)
2、在provider端还设置了两个version供消费者选择，分别由连个实现类实现
3、提供服务注解dubbo的@Service

（三）consumer端

