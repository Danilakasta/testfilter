package com.example.testcat.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnimalGroups {

    MAMMALS("Млекопитающие"),
    MOLLUSKS("Моллюски"),
    FISH("Рыбы"),
    BIRDS("Птицы"),
    REPTILES("Пресмыкающиеся"),
    AMPHIBIANS("Земноводные"),
    ARTHROPODS("Членистоногие.");

    private final String type;
}
