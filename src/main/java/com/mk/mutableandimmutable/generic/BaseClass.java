package com.mk.mutableandimmutable.generic;

public class BaseClass {

    public final void recommendedMethod() {
        System.out.println("[Baseclass]: recommended method");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod() {
        System.out.println("[Baseclass]: optional method");
    }

    private void mandatoryMethod() {
        System.out.println("[Baseclass]: mandatory method");
    }

    public static void recommendedStaticMethod() {
        System.out.println("[Baseclass]: recommended static method");
        optionalStaticMethod();
        mandatoryStaticMethod();
    }

    protected static void optionalStaticMethod() {
        System.out.println("[Baseclass]: optional static method");
    }

    private static void mandatoryStaticMethod() {
        System.out.println("[Baseclass]: mandatory static method");
    }
}
