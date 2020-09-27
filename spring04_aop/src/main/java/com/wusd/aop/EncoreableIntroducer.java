package com.wusd.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    //value 那种类型的bean要引入该接口
    //defaultImpl 引入功能提供实现的类
    //DeclareParents
    @DeclareParents(value = "com.wusd.aop.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
