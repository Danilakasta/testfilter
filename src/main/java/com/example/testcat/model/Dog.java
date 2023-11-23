package com.example.testcat.model;

import com.example.testcat.enums.AnimalGroups;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Dog extends AnimalAbstract {


    //TODO 1.1 Добавить остальные отличные свойства собак

    @Enumerated(EnumType.STRING)
    private AnimalGroups animalGroups = AnimalGroups.MAMMALS;

    @Override
    public String
    say() {
        return "Гав";
    }

}
