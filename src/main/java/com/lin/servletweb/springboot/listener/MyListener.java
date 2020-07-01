package com.lin.servletweb.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        //第四步
        System.out.println("contextInitialized...web应用启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //先执行filter的的story方法再执行这个监听
        System.out.println("contextDestroyed...当前web项目销毁");
    }
}
