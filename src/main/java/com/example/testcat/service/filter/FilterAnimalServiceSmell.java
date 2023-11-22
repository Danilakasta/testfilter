package com.example.testcat.service.filter;

import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;
import com.example.testcat.service.animal.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilterAnimalServiceSmell {

    private final AnimalService animalService;

    @Autowired
    public FilterAnimalServiceSmell(AnimalService animalService) {
        this.animalService = animalService;
    }

    public List<AnimalAbstract> getFilterAnimal(AnimalFilter filter) {
        List<AnimalAbstract> animals = animalService.getAnimals();

        if (filter.getName() != null) {
            animals = filterByName(animals, filter);
        }

        if (filter.getLegsCount() != null) {
            animals = filterByLegs(animals, filter);
        }

        if (filter.getId() != null) {
            animals = filterById(animals, filter);
        }

        return animals;
    }

    private List<AnimalAbstract> filterByName(List<AnimalAbstract> animals, AnimalFilter filter) {

        return animals.stream()
                .filter(animalAbstract -> animalAbstract.getName().equals(filter.getName()))
                .collect(Collectors.toList());
    }

    private List<AnimalAbstract> filterByLegs(List<AnimalAbstract> animals, AnimalFilter filter) {

        return animals.stream()
                .filter(animalAbstract -> animalAbstract.getLegsCount().equals(filter.getLegsCount()))
                .collect(Collectors.toList());
    }

    private List<AnimalAbstract> filterById(List<AnimalAbstract> animals, AnimalFilter filter) {

        return animals.stream()
                .filter(animalAbstract -> animalAbstract.getLegsCount().equals(filter.getLegsCount()))
                .collect(Collectors.toList());
    }
}
