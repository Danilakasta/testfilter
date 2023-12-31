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
public class Fish extends AnimalAbstract {

    //Кол плавников
    private Integer finCount;
    @Enumerated(EnumType.STRING)
    private AnimalGroups animalGroups = AnimalGroups.FISH;

    //TODO 1.1 Добавить остальные отличные свойства рыб

    @Override
    public String say() {
        return null;
    }

}
