package com.example.testcat.component.filters.handlers;


import com.example.testcat.component.filters.strategy.AnimalFilterStrategy;
import com.example.testcat.component.filters.strategy.StreamFilterStrategy;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class AnimalNameFilterHandler implements FilterHandler {
    @Override
    public AnimalFilterStrategy getStrategy() {
        return new StreamFilterStrategy();
    }

    @Override
    public boolean check(AnimalAbstract animalAbstract) {
        return animalAbstract.getName() != null;
    }

    @Override
    public Predicate<AnimalAbstract> condition(AnimalFilter filter) {
        return animal -> animal.getName().equals(filter.getName());
    }

    /**
     * Стратегия
     * Strategy
     * @param animals
     * @param filter
     * @return
     */
    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animals, AnimalFilter filter) {
        return getStrategy().filter(animals, this.condition(filter));
    }

}
