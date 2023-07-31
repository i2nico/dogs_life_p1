package com.db.grad.javaapi.repository;


import com.db.grad.javaapi.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {
    @Query(nativeQuery = true, value = "select * from dogs where name = :name")
    List<Dog> findDogsByName(String name);
}