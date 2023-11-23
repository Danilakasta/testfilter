package com.example.testcat.components.hendlers;

import com.example.testcat.components.strategies.DefaultFilterStrategy;
import com.example.testcat.components.strategies.FilterStrategy;
import com.example.testcat.models.AnimalAbstract;
import com.example.testcat.models.filters.AnimalFilter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component("filterByLegs")
public class FilterByLegs implements AnimalFilterDef<AnimalAbstract,AnimalFilter> {
    @Override
    public FilterStrategy getfilterStrategy() {
        return new DefaultFilterStrategy();
    }

    @Override
    public boolean check(AnimalAbstract filter) {
        return filter.getLegsCount() != null;
    }

    @Override
    public Predicate<AnimalAbstract> condition(AnimalFilter filter) {
        return animalAbstract -> animalAbstract.getLegsCount().equals(filter.getLegsCount());
    }

    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animals, AnimalFilter filter) {
        return getfilterStrategy().filter(animals, this.condition(filter));
    }
}
