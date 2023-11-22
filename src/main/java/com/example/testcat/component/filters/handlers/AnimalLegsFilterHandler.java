package com.example.testcat.component.filters.handlers;


import com.example.testcat.component.filters.strategy.AnimalFilterStrategy;
import com.example.testcat.component.filters.strategy.CustomFilterStrategy;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class AnimalLegsFilterHandler implements FilterHandler {
    @Override
    public AnimalFilterStrategy getStrategy() {
        return new CustomFilterStrategy();
    }

    @Override
    public boolean check(AnimalAbstract animalAbstract) {
        return animalAbstract.getName() != null;
    }

    @Override
    public Predicate<AnimalAbstract> condition(AnimalFilter filter) {
        return animal -> animal.getLegsCount().equals(filter.getLegsCount());
    }



    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animals, AnimalFilter filter) {
        return getStrategy().filter(animals, this.condition(filter));
    }
}
