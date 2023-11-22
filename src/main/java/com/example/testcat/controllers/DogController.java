package com.example.testcat.controllers;


import com.example.testcat.model.Animal;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.Dog;
import com.example.testcat.service.animal.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dog")
public class DogController {

    private final AnimalService animalService;

    @Autowired
    public DogController(AnimalService animalService) {
        this.animalService = animalService;
    }


    @PostMapping("save")
    public Animal getSave(Dog animal) {

        return animalService.save(animal);
    }


    @GetMapping("all")
    public List<AnimalAbstract> getAnimal() {

        //TODO 4. В этом месте нужно вернуть только собак) сейчас вернутся все животные, в контроллерах для друхих животных тоже самое сделать
        return animalService.getAnimals();
    }

    //TODO 2. Добавить метод delete (На вход получает ID с ним уже идеш в метод delete сервиса animalService)

    //TODO 3. Написать контроллеры для остальных типов животных, в данном контроллере создаются только собаки)))))


    //TODO 5. Попытаться написать Unit тест контроллера который будет тестировать REST методы контроллера смотри CheckServiceImplTest


}
