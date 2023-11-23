package com.example.testcat.components.hendlers;

import com.example.testcat.components.strategies.FilterStrategy;
import com.example.testcat.components.strategies.StreamFilterStrategy;
import com.example.testcat.models.AnimalAbstract;
import com.example.testcat.models.filters.AnimalFilter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class FilterByName implements AnimalFilterDef<AnimalAbstract,AnimalFilter> {
    @Override
    public FilterStrategy getfilterStrategy() {
        return new StreamFilterStrategy();
    }

    @Override
    public boolean check(AnimalAbstract  filter) {
        return filter.getName() != null;
    }

    @Override
    public Predicate<AnimalAbstract> condition(AnimalFilter filter) {
        return animalAbstract -> animalAbstract.getName().equals(filter.getName());
    }

    @Override
    public List<AnimalAbstract > filter(List<AnimalAbstract > animals, AnimalFilter filter) {
        return animals.stream()
                .filter(this.condition(filter))
                .collect(Collectors.toList());
    }
}
