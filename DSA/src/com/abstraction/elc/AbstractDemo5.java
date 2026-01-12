package com.abstraction.elc;

import com.abstraction.blc.Animal;
import com.abstraction.blc.Elephant;
import com.abstraction.blc.Lion;

public class AbstractDemo5 {

    public static void main(String[] args) {

        Lion[] lions = {
                new Lion("Simba"),
                new Lion("Mufasa"),
                new Lion("Raja")
        };
        healthCheckupCamp(lions);
        System.out.println("---------------------------");

        Elephant[] elephants = {
                new Elephant("Haathi"),
                new Elephant("Gaja")
        };
        healthCheckupCamp(elephants);
    }

    public static void healthCheckupCamp(Animal... animals) {
        for (Animal animal : animals) {
            animal.healthCheckUp();   // ✅ fixed
        }
    }
}
