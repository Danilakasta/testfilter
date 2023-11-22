package com.example.testcat.controllers;

import com.example.testcat.component.filters.chains.AnimalFilterable;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;
import com.example.testcat.service.animal.AnimalService;
import com.example.testcat.service.filter.FilterAnimalServiceSmell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AnimalController {
    private final AnimalService animalService;
    private final FilterAnimalServiceSmell filterAnimalService;

    private final AnimalFilterable animalFilterable;

    @Autowired
    public AnimalController(AnimalService animalService, FilterAnimalServiceSmell filterAnimalService, AnimalFilterable animalFilterable) {
        this.animalService = animalService;
        this.filterAnimalService = filterAnimalService;
        this.animalFilterable = animalFilterable;
    }

    @GetMapping("animals")
    public List<AnimalAbstract> getAllAnimals() {

        return animalService.getAnimals();
    }

    @GetMapping("smell/filter/animals")
    public List<AnimalAbstract> smellFilterAnimals(AnimalFilter filter) {

        return filterAnimalService.getFilterAnimal(filter);
    }

    @GetMapping("filter/animals")
    public List<AnimalAbstract> filterAnimals(AnimalFilter filter) {

        return animalFilterable.filtrate(animalService.getAnimals(), filter);
    }
}
