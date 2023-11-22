package com.example.testcat.model;

import com.example.testcat.enums.AnimalGroups;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "animal")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
//TODO 6. Добавить клас человек, динозавр, растение, инопланетянил
// подумать будут ли они наслединками Animal и как все таки организовать наследование коректно
// подумать сколько под это нужно таблиц для хранения даных
public class AnimalAbstract implements Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    private String name;

    private Integer legsCount;


    //TODO 1. добавить свойство которое будет хранить имя на русском языке

    //TODO 1.1 Добавить общие для всех животных свойства типо имени к примеру и тд.

    @Override
    public String say() {
        return null;
    }

    @Override
    public AnimalGroups getAnimalGroups() {
        return null;
    }


//    public static boolean check(AnimalAbstract animalAbstract) {
//        return animalAbstract != null;
//    }

}
