package com.example.testcat.component.filters.strategy;

import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;

import java.util.List;
import java.util.function.Predicate;

public interface AnimalFilterStrategy {
    List<AnimalAbstract> filter(List<AnimalAbstract> animals, Predicate<AnimalAbstract> filterPredicate);
}
