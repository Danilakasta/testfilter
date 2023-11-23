package com.example.testcat.component.handlers;

import com.example.testcat.component.strategies.FilterStrategy;
import com.example.testcat.model.filters.AnimalFilter;

import java.util.List;
import java.util.function.Predicate;

public interface Filter<T,V> {

    FilterStrategy getFilterStrategy();

    boolean check (AnimalFilter filter);

    Predicate<T> condition (V animalFilter);

    List<T> filter (List<T> animals, V filter );

}
