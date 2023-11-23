package com.example.testcat.component.filters.strategy;

import com.example.testcat.model.AnimalAbstract;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamFilterStrategy implements AnimalFilterStrategy{
    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animals, Predicate<AnimalAbstract> filterPredicate) {
        return animals.stream()
                .filter(filterPredicate)
                .collect(Collectors.toList());
    }
}
