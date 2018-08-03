package com.company.RevisionTopics;

public class Bottle {
    private String name;
    private int volume;
    public static final int PRICE = 5;

    private static int count = 0;

    public Bottle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int getNumber(){
        return 111;
    }
}
