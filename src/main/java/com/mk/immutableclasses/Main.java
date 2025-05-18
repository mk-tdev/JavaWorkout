package com.mk.immutableclasses;

public class Main {
    public static void main(String[] args) {
//        Person jane = new Person();
//        jane.setName("Jane");
//        Person john = new Person();
//        john.setName("John");
//        Person joe = new Person();
//        joe.setName("Joe");
//
//        Person mike = new Person();
//        mike.setName("Mike");
//        mike.setDob("01/01/1999");
//        mike.setKids(new Person[]{jane, john, joe});
//        System.out.println(mike);

        Person jane = new Person("Jane", "01/01/1979");
        Person jim = new Person("Jim", "01/01/1982");
        Person joe = new Person("Joe", "01/01/1986");

        Person[] johnsKids = new Person[]{jane, jim, joe};
        Person john = new Person("John", "01/01/1979", johnsKids);

        System.out.println(john);

        john.setKids(new Person[]{new Person("Ann", "01/01/1987")});
        System.out.println(john);

        Person[] kids = john.getKids();
        kids[0] = jim;
        System.out.println(john);

        // this wont impact
        kids = null;
        System.out.println(john);

        // this will have impact
        john.setKids(kids);
        System.out.println(john);
    }
}
