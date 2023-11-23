package com.example.testcat.service.filter;

import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;

import java.util.List;

public interface FilterService {
    List<AnimalAbstract> getFilterAnimal(AnimalFilter filter);
}
