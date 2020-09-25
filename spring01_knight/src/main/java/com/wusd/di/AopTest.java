package com.wusd.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("minstrel.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
        //期望sing
    }
}
