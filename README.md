[toc]
# SpringCloudDemo
```
  Spring Cloud 微服务相关项目的搭建及学习
```

## Eureka Demo
 ### Eureka Server
```
  1.Eureka服务搭建和服务集群搭建：EurekaDemo、EurekaDemo2、EurekaDemo
  2.配置：
    eureka:
      server:
        enable-self-preservation: false  #关闭自我保护机制
        eviction-interval-timer-in-ms: 4000 #设置清理间隔（单位：毫秒 默认是60*1000）
      instance:
        hostname: eurekaDemo3000 #eurekaDemo3001、eurekaDemo3002

    client:
      registerWithEureka: false #不把自己作为一个客户端注册到自己身上
      fetchRegistry: false  #不需要从服务端获取注册信息（因为在这里自己就是服务端，而且已经禁用自己注册了）
      serviceUrl:
        defaultZone: http://eurekaDemo3002:3002/eureka,http://eurekaDemo3001:3001/eureka
```
## 分支
```
  Eureka 增加用户登录校验
```
