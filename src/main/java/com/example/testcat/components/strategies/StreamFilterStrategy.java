package com.example.testcat.components.strategies;

import com.example.testcat.models.AnimalAbstract;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterStrategy implements FilterStrategy{
    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animalAbstracts, Predicate<AnimalAbstract> animalAbstractPredicate) {
      return   animalAbstracts.stream()
                .filter(animalAbstractPredicate)
                .collect(Collectors.toList());
    }
}
