package com.example.testcat.component.animals;

import com.example.testcat.enums.AnimalGroups;
import com.example.testcat.model.Animal;
import com.example.testcat.model.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogComponent implements AnimalComponent {
    @Override
    public Animal getAnimal() {
        return new Dog();
    }

    @Override
    public AnimalGroups getAnimalGroup() {
        return AnimalGroups.MAMMALS;
    }
}
