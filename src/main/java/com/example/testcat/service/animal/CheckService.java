package com.example.testcat.service.animal;

import com.example.testcat.model.Animal;

import java.util.List;

public interface CheckService {
    List<Animal> getAllAnimals();

    List<String> check();
}
