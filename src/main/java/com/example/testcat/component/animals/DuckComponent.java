package com.example.testcat.component.animals;

import com.example.testcat.enums.AnimalGroups;
import com.example.testcat.model.Animal;
import com.example.testcat.model.Duck;
import org.springframework.stereotype.Component;

@Component
public class DuckComponent implements AnimalComponent{
    @Override
    public Animal getAnimal() {
        return new Duck();
    }

    @Override
    public AnimalGroups getAnimalGroup() {
        return AnimalGroups.BIRDS;
    }

}
