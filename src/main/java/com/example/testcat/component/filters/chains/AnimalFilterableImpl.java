package com.example.testcat.component.filters.chains;

import com.example.testcat.component.filters.handlers.FilterHandler;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalFilterableImpl implements AnimalFilterable {
    /**
     * DI dependency injection
     */
    private final List<FilterHandler> animalFilterChain;

    @Autowired
    public AnimalFilterableImpl(List<FilterHandler> filterComponents) {
        this.animalFilterChain = filterComponents;

    }

    /**
     * Цепочка обязанностей
     * CoR, Chain of Command, Chain of Responsibility
     *
     * @param animals
     * @param filter
     * @return
     */
    @Override
    public List<AnimalAbstract> filtrate(List<AnimalAbstract> animals, AnimalFilter filter) {
        for (FilterHandler filterHandler : animalFilterChain) {
            if (filterHandler.check(filter)) {
                animals = filterHandler.filter(animals, filter);
            }
        }

        return animals;
    }
}
