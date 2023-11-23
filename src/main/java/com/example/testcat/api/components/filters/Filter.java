package com.example.testcat.api.components.filters;

import com.example.testcat.components.strategies.FilterStrategy;
import com.example.testcat.models.filters.AnimalFilter;

import java.util.List;
import java.util.function.Predicate;

public interface Filter<T,V> {

    FilterStrategy getfilterStrategy();

    boolean check(T  filter);

    Predicate<T > condition (AnimalFilter filter);

    List<T> filter(List<T> animalFilters , V animalFilter);
}
