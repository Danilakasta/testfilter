package com.example.testcat.api.components.filters;

import com.example.testcat.models.AnimalAbstract;
import com.example.testcat.models.filters.AnimalFilter;

import java.util.List;

public interface FilterComponent {

    List<AnimalAbstract> filter(List<AnimalAbstract>  animalAbstracts, AnimalFilter filter);
}
