package com.example.testcat.model;

import com.example.testcat.enums.AnimalGroups;
import jakarta.persistence.*;
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
