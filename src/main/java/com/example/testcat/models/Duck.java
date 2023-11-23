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
public class Duck extends AnimalAbstract {

    @Enumerated(EnumType.STRING)
    private AnimalGroups animalGroups = AnimalGroups.BIRDS;
    @Override
    public String say() {
        return "Кря";
    }

}
