package com.example.testcat.component.filters.strategy;

import com.example.testcat.model.AnimalAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class CustomFilterStrategy implements AnimalFilterStrategy {
    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animals, Predicate<AnimalAbstract> filterPredicate) {
        List<AnimalAbstract> filterAnimals = new ArrayList<>();

        for (AnimalAbstract animalAbstract : animals) {

            if (filterPredicate.test(animalAbstract)) {
                filterAnimals.add(animalAbstract);
            }

        }
        return filterAnimals;
    }
}
