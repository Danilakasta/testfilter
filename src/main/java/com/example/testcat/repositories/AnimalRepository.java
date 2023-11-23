package com.example.testcat.repositories;

import com.example.testcat.models.AnimalAbstract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalAbstract,Long> {
}
