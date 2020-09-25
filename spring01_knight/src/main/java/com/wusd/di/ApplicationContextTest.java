package com.wusd.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.PrintStream;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext context;
        context = new FileSystemXmlApplicationContext("D://spring-in-action/spring01_di/src/main/resources/knight.xml");
        testApplicationContext(context);
        context = new ClassPathXmlApplicationContext("knight.xml");
        testApplicationContext(context);
        context = new AnnotationConfigApplicationContext(BraveKnight.class, SlayDragonQuest.class);
//        testApplicationContext(context);
        System.out.println();
    }

    public static void testApplicationContext(ApplicationContext context) {
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
