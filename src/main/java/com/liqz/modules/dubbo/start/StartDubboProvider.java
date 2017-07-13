package com.liqz.modules.dubbo.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartDubboProvider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"spring-context-dubbo-provider.xml" });
        context.start();
        System.out.println("---服务启动成功！！！---");
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
