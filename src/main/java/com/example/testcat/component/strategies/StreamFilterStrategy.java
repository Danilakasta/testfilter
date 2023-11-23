package com.example.testcat.component.strategies;

import com.example.testcat.model.AnimalAbstract;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterStrategy implements FilterStrategy{
    @Override
    public List<AnimalAbstract> filtrate(List<AnimalAbstract> animals, Predicate<AnimalAbstract> animalAbstractPredicate) {
        return animals.stream()
                .filter(animalAbstractPredicate)
                .collect(Collectors.toList());
    }
}
