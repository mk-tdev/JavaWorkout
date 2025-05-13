package com.mk.mutableandimmutable.specific;

import com.mk.mutableandimmutable.generic.BaseClass;

public class ChildClass extends BaseClass {
//    @Override
//    public void recommendedMethod() {
//        System.out.println("[ChildClass] recommendedMethod");
//        optionalMethod();
//    }

    @Override
    protected void optionalMethod() {
        System.out.println("[ChildClass] optionalMethod");
        super.optionalMethod();
    }

    // this won't work
    private void mandatoryMethod() {
        System.out.println("[ChildClass]: mandatory method");
    }

    public static void recommendedStaticMethod() {
        System.out.println("[ChildClass]: recommended static method");
        optionalStaticMethod();
//        mandatoryStaticMethod();
    }
}
