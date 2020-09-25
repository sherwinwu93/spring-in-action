package com.wusd.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
