package com.example.testcat.models;

import com.example.testcat.enums.AnimalGroups;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Cat extends AnimalAbstract {


    //TODO 1.1 Добавить остальные отличные свойства

    @Enumerated(EnumType.STRING)
    private AnimalGroups animalGroups = AnimalGroups.MAMMALS;

    @Override
    public String
    say() {
        return "Мяу кусок шерсти";
    }

}
