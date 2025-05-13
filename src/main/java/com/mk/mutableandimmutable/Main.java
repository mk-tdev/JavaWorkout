package com.mk.mutableandimmutable;

import com.mk.mutableandimmutable.external.util.Logger;
import com.mk.mutableandimmutable.generic.BaseClass;
import com.mk.mutableandimmutable.specific.ChildClass;

public class Main {
    public static void main(String[] args) {

        BaseClass baseClass = new BaseClass();
        ChildClass childClass = new ChildClass();
        BaseClass childBaseClass = new ChildClass();

        baseClass.recommendedMethod();
        System.out.println("--".repeat(10));
        childClass.recommendedMethod();
        System.out.println("--".repeat(10));
        childBaseClass.recommendedMethod();
        System.out.println("--".repeat(10));

        baseClass.recommendedStaticMethod();
        System.out.println("--".repeat(10));
        childClass.recommendedStaticMethod();
        System.out.println("--".repeat(10));
        childBaseClass.recommendedStaticMethod();

        System.out.println("--".repeat(10));
        BaseClass.recommendedStaticMethod();
        System.out.println("--".repeat(10));
        ChildClass.recommendedStaticMethod();
        System.out.println("--".repeat(10));

        String xArgument = "This is x: ";
        StringBuilder zArgument = new StringBuilder(xArgument);
        doXYZ(xArgument, 10, zArgument);
        System.out.println(zArgument);

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is def");
        Logger.logToConsole(tracker.toString());
        System.out.println("after logging, tracker: " + tracker);
    }

    private static void doXYZ(String x, int y, final StringBuilder sb) {
        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        sb.append("x = " + x + "\n");
//        sb = new StringBuilder("")
    }
}
