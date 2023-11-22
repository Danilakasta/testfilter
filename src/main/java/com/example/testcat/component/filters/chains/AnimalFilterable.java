package com.example.testcat.component.filters.chains;

import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;

import java.util.List;

public interface AnimalFilterable {
    List<AnimalAbstract> filtrate(List<AnimalAbstract> animalAbstracts, AnimalFilter animalFilter);
}
