package com.example.testcat.services.filter;

import com.example.testcat.models.AnimalAbstract;
import com.example.testcat.models.filters.AnimalFilter;
import com.example.testcat.services.animal.AnimalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilterAnimalService {

    private final AnimalService animalService;


    public FilterAnimalService(AnimalService animalService) {
        this.animalService = animalService;
    }


    public List<AnimalAbstract> getAnimalsByFilter(AnimalFilter filter) {
        List<AnimalAbstract> animals = animalService.getAnimals();

        if (filter.getName() != null) {
            animals = filterByName(animals, filter);
        }

        return animals;
    }

    private List<AnimalAbstract> filterByName(List<AnimalAbstract> animals, AnimalFilter filter) {
        return animals.stream()
                .filter(animalAbstract -> animalAbstract.getName().equals(filter.getName()))
                .collect(Collectors.toList());
    }

}
