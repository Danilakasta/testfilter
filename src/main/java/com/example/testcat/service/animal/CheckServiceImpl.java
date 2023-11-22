package com.example.testcat.service.animal;

import com.example.testcat.component.animals.AnimalComponent;
import com.example.testcat.model.Animal;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log
public class CheckServiceImpl implements CheckService {
    private final List<AnimalComponent> animalComponentList;
    @Autowired
    public CheckServiceImpl(List<AnimalComponent> animalComponentList) {
        this.animalComponentList = animalComponentList;
    }

    @Override
    public List<Animal> getAllAnimals() {
        return animalComponentList.stream()
                .map(AnimalComponent::getAnimal)
                .toList();
    }

    @Override
    public List<String> check() {

        List<String> listCheck = new ArrayList<>();

        animalComponentList.forEach(animalComponent -> {
            //TODO 1. добавить  имя на русском языке вместо вывлда всего животного animalComponent.getAnimal()
            listCheck.add(" Животное - " + animalComponent.getAnimal() +
                    " ; издает - " + animalComponent.say());
        });

        log.info(listCheck.toString());

        return listCheck;
    }
}
