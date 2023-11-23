package com.example.testcat.components.concreate;

import com.example.testcat.api.components.filters.FilterComponent;
import com.example.testcat.components.hendlers.AnimalFilterDef;
import com.example.testcat.models.AnimalAbstract;
import com.example.testcat.models.filters.AnimalFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class AnimalFilterComponent implements FilterComponent {

    private final List<AnimalFilterDef> filters;

    @Autowired
    public AnimalFilterComponent(List<AnimalFilterDef>  filters) {
        this.filters = filters;
    }

    @Override
    public List<AnimalAbstract> filter(List<AnimalAbstract> animalAbstracts, AnimalFilter animalFilterter) {
        List<AnimalAbstract> animalAbstractList = new ArrayList<>();

        for (AnimalFilterDef filter : filters) {

            if (filter.check(animalFilterter)) {

                animalAbstractList.addAll(filter.filter(animalAbstracts, animalFilterter));
            }

        }

        return animalAbstractList;
    }
}
