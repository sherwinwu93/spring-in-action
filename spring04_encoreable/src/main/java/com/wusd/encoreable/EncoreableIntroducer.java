package com.wusd.encoreable;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "com.wusd.encoreable.Performance++", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
