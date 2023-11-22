package com.example.testcat.service.animal;

import com.example.testcat.model.Animal;
import com.example.testcat.model.AnimalAbstract;

import java.util.List;

public interface AnimalService {

    List<AnimalAbstract> getAnimals();

    Animal save(AnimalAbstract animal);

    //TODO 2. добавить метод delete (На вход получает ID с ним уже идеш в метод delete репозитория animalRepository)
}
