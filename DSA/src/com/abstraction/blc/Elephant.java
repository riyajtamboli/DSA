package com.abstraction.blc;

public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void healthCheckUp() {
        System.out.println(name + " goes for regular check-up");
    }

    public void trumpet() {
        System.out.println(name + " is trumpeting");
    }
}
