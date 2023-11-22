package com.example.testcat.service.animal;

import com.example.testcat.model.Animal;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public List<AnimalAbstract > getAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal save(AnimalAbstract animal) {
        animal = animalRepository.save(animal);

        return animal;
    }


    //TODO 2. добавить метод delete (На вход получает ID с ним уже идеш в метод delete репозитория animalRepository)


}
