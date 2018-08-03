package com.company.RevisionTopics;

public class VodkaBottle extends Bottle {

    private int strength;

    public VodkaBottle(String name, int strength){
        super(name);

        this.strength = strength;
    }

    @Override
    public String getName(){
        return "VODKA!" + super.getName();
    }
}
