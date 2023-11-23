package com.example.testcat.component.filters;

import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;

import java.util.List;

public interface FilterComponent {

    List<AnimalAbstract> filtrate(List<AnimalAbstract> animals,AnimalFilter animalFilter);
}
