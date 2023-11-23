package com.example.testcat.models;

import com.example.testcat.enums.AnimalGroups;

public interface Animal {

    //TODO 1. добавить метод который вернет имя на русском языке
    String say();

    AnimalGroups getAnimalGroups();
}
