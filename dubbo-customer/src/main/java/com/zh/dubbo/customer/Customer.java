package com.zh.dubbo.customer;

import com.zh.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: DubboDemo
 * @Package: com.zh.dubbo.customer
 * @ClassName: Customer
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/28 16:32
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/28 16:32
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class Customer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("customer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
