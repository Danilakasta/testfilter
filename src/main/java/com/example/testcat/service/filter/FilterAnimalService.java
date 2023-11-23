package com.example.testcat.service.filter;

import com.example.testcat.component.filters.FilterComponent;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.filters.AnimalFilter;
import com.example.testcat.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterAnimalService implements FilterService {

    private final FilterComponent animalFilterComponent;
    private final AnimalRepository animalRepository;

    @Autowired
    public FilterAnimalService(FilterComponent animalFilterComponent, AnimalRepository animalRepository) {
        this.animalFilterComponent = animalFilterComponent;
        this.animalRepository = animalRepository;
    }


    @Override
    public List<AnimalAbstract> getFilterAnimal(AnimalFilter filter) {
        return animalFilterComponent.filtrate(animalRepository.findAll(), filter);
    }
}
