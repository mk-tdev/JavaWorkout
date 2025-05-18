package com.mk.immutableclasses;

public class MainRecord {
    public static void main(String[] args) {
        PersonRecord jane = new PersonRecord("Jane", "01/01/1979");
        PersonRecord jim = new PersonRecord("Jim", "01/01/1982");
        PersonRecord joe = new PersonRecord("Joe", "01/01/1986");

        PersonRecord[] johnsKids = new PersonRecord[]{jane, jim, joe};
        PersonRecord john = new PersonRecord("John", "01/01/1979", johnsKids);

        System.out.println(john);

        PersonRecord john2 = new PersonRecord("John", "01/01/1979");
        System.out.println(john2);

        PersonRecord[] kids = john2.kids();
        kids[0] = jim;
        kids[1] = new PersonRecord("Ann", "01/01/1987");

        System.out.println(john2);

        johnsKids[0] = new PersonRecord("Min", "01/01/1988");
        System.out.println(john);
    }
}
