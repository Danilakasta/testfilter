package com.example.testcat.component.handlers;

import com.example.testcat.component.strategies.FilterStrategy;
import com.example.testcat.component.strategies.StreamFilterStrategy;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class AnimalLegsFilter implements Filter<AnimalAbstract,AnimalFilter> {
    @Override
    public FilterStrategy getFilterStrategy() {
        return new StreamFilterStrategy();
    }

    @Override
    public boolean check(AnimalFilter filter) {
        return filter.getLegsCount() != null;
    }

    @Override
    public Predicate<AnimalAbstract> condition(AnimalFilter animalFilter) {
        return animal -> animal.getLegsCount().equals(animalFilter.getLegsCount());
    }

    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animals, AnimalFilter filter) {
        return getFilterStrategy().filtrate(animals, this.condition(filter));
    }
}
