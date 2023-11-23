package com.example.testcat.controllers;

import com.example.testcat.models.AnimalAbstract;
import com.example.testcat.models.filters.AnimalFilter;
import com.example.testcat.services.animal.AnimalService;
import com.example.testcat.services.filter.FilterAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AnimalController {
    private final AnimalService animalService;
    private final FilterAnimalService filterAnimalService;

    @Autowired
    public AnimalController(AnimalService animalService, FilterAnimalService filterAnimalService) {
        this.animalService = animalService;
        this.filterAnimalService = filterAnimalService;
    }

    @GetMapping("animals")
    public List<AnimalAbstract> getAllAnimals() {

        return animalService.getAnimals();
    }

    @GetMapping("smell/filter/animals")
    public List<AnimalAbstract> smellFilterAnimals(AnimalFilter filter) {

        return filterAnimalService.getAnimalsByFilter(filter);
    }

    @GetMapping("filter/animals")
    public List<AnimalAbstract> filterAnimals(AnimalFilter filter) {

        return filterAnimalService.getAnimalsByFilter(filter);
    }
}
