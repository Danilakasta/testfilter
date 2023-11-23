package com.example.testcat.component.strategies;

import com.example.testcat.model.AnimalAbstract;

import java.util.List;
import java.util.function.Predicate;

public interface FilterStrategy {

    List<AnimalAbstract> filtrate(List<AnimalAbstract> animals, Predicate<AnimalAbstract> animalAbstractPredicate);
 }
