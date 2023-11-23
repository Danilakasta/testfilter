package com.example.testcat.component.strategies;

import com.example.testcat.model.AnimalAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DefaultFilterStrategy implements FilterStrategy {
    @Override
    public List<AnimalAbstract> filtrate(List<AnimalAbstract> animals, Predicate<AnimalAbstract> animalAbstractPredicate) {

        List<AnimalAbstract> filterAnimals = new ArrayList<>();

        for (AnimalAbstract animalAbstract : animals) {
            if (animalAbstractPredicate.test(animalAbstract)) {
                filterAnimals.add(animalAbstract);
            }
        }

        return filterAnimals;
    }
}
