package com.example.testcat.component.animals;

import com.example.testcat.enums.AnimalGroups;
import com.example.testcat.model.Animal;

public interface AnimalComponent {

    Animal getAnimal();

    AnimalGroups getAnimalGroup();
    default boolean checkSay() {
        return getAnimal().say() == null;
    }

    default String say() {
        return getAnimal().say();
    }


}
