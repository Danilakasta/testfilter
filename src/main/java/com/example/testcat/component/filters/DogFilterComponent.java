package com.example.testcat.component.filters;

import com.example.testcat.component.handlers.Filter;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DogFilterComponent implements FilterComponent {

    private final List<Filter> filters;

    public DogFilterComponent(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public List<AnimalAbstract> filtrate(List<AnimalAbstract> animals, AnimalFilter animalFilter) {
        List<AnimalAbstract> animalAbstracts = new ArrayList<>();
        for (Filter filter : filters) {
            if (filter.check(animalFilter)) {
                animalAbstracts.addAll(filter.filter(animals, animalFilter));
            }
        }

        return animalAbstracts;
    }
}
