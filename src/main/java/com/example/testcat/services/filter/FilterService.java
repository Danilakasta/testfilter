package com.example.testcat.services.filter;

import com.example.testcat.models.AnimalAbstract;
import com.example.testcat.models.filters.AnimalFilter;

import java.util.List;

public interface FilterService {
    List<AnimalAbstract> getAnimalsByFilter(AnimalFilter filter);
}
