package com.example.testcat.components.strategies;

import com.example.testcat.models.AnimalAbstract;

import java.util.List;
import java.util.function.Predicate;

public interface FilterStrategy {

    List<AnimalAbstract> filter(List<AnimalAbstract>  animalAbstracts, Predicate<AnimalAbstract> animalAbstractPredicate);
}
