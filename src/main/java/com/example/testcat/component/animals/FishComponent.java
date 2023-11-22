package com.example.testcat.component.animals;

import com.example.testcat.enums.AnimalGroups;
import com.example.testcat.model.Animal;
import com.example.testcat.model.Fish;
import org.springframework.stereotype.Component;

@Component
public class FishComponent implements AnimalComponent {
    @Override
    public Animal getAnimal() {
        return new Fish();
    }

    @Override
    public AnimalGroups getAnimalGroup() {
        return AnimalGroups.FISH;
    }
}
