package com.company.AdvancedFeatures;

public class Main {
    public static void main(String[] args) {

        Person johnSmith = new Person("John Smith");
        Person sarahConnor = new Person("Sarah Connor");

        System.out.println(johnSmith.getFullName());
        System.out.println(sarahConnor.getFullName());

        johnSmith.setFirstName("patrick");
        System.out.println(johnSmith.getFullName());

    }
}
