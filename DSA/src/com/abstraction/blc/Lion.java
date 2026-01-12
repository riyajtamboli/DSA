package com.abstraction.blc;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void healthCheckUp() {
        System.out.println(this.name + " Lion goes for regular health check-up");
    }

    public void roar() {
        System.out.println("Roar");
    }
}
