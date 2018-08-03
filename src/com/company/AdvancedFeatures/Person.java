package com.company.AdvancedFeatures;

public class Person {

    private String firstName;

    private String surName;



    public Person(String firstName, String surName) {
        setFirstName(firstName);
        this.surName = surName;
    }

    public Person(String fullName) {
        if(fullName != null){
            String[] nameParts = fullName.split(" ");
            // this.firstName = nameParts[0];
            setFirstName(nameParts[0]);
            if(nameParts.length > 1){
                surName = nameParts[1];
            }
        }
    }

    public String getFullName() {
        return this.firstName + " " + this.surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
//        this.firstName = firstName.replaceFirst("[a-z], [A-Z]");
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
