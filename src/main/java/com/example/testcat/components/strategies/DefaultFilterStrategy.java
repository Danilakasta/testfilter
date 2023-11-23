package com.example.testcat.components.strategies;

import com.example.testcat.models.AnimalAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DefaultFilterStrategy implements FilterStrategy{
    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animalAbstracts, Predicate<AnimalAbstract> animalAbstractPredicate) {

        List<AnimalAbstract> animalAbstractList = new ArrayList<>();

        for (AnimalAbstract animalAbstract:animalAbstracts ){
            if(animalAbstractPredicate.test(animalAbstract)) {
                animalAbstractList.add(animalAbstract);
            }
        }

        return animalAbstractList;

    }
}
