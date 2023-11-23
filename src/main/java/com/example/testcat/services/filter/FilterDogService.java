package com.example.testcat.services.filter;

import com.example.testcat.components.concreate.AnimalFilterComponent;
import com.example.testcat.models.AnimalAbstract;
import com.example.testcat.models.filters.AnimalFilter;
import com.example.testcat.services.animal.AnimalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterDogService implements FilterService {

    private final AnimalService animalService;
    private final AnimalFilterComponent filterComponent;

    public FilterDogService(AnimalService animalService, AnimalFilterComponent filterComponent) {
        this.animalService = animalService;
        this.filterComponent = filterComponent;
    }

    @Override
    public List<AnimalAbstract> getAnimalsByFilter(AnimalFilter filter) {
        List<AnimalAbstract> animals = animalService.getAnimals();
        animals = filterComponent.filter(animals, filter);

        return animals;
    }
}
