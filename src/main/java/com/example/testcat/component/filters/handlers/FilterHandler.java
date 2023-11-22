package com.example.testcat.component.filters.handlers;

import com.example.testcat.component.filters.strategy.AnimalFilterStrategy;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;

import java.util.List;
import java.util.function.Predicate;

public interface FilterHandler {
    /**
     * Стратегия Strategy
     *
     * @return
     */
    AnimalFilterStrategy getStrategy();

    boolean check(AnimalAbstract animalAbstract);

    List<AnimalAbstract> filter(List<AnimalAbstract> animals, AnimalFilter animalFilter);

    Predicate<AnimalAbstract> condition(AnimalFilter filter);
}
