package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogsHandlerTest {

    private DogsRepository itsDogRepo = new DogsRepositoryStub();

    @BeforeEach
    public void makeSureRepoIsEmpty(){
        itsDogRepo.deleteAll();
    }
    @Test
    @DisplayName("Check count")
    public void add_a_dog_return_number_of_dogs_in_repo_is_one(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );
        int expectedResult = 1;
        long actualResult = cut.getNoOfDogs();
        assertEquals(expectedResult, actualResult);
    }




    @Test
    @DisplayName("Check if Name of Dog Exists")
    public void getDogByName(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        String name = "Bruno";
        theDog.setName(name);
        theDog.setId(1);
        cut.addDog( theDog );

        Dog dog=cut.getDogByName("Bruno");
        assertEquals(theDog,dog);


    }
    @Test
    @DisplayName("Check removing dog by id")
    public void testRemoveDog(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        String name = "Bruno";
        theDog.setName(name);
        theDog.setId(1);
        cut.addDog( theDog );

        Boolean result=cut.removeDog(1);
        assertEquals(result,true);


    }
    @Test
    @DisplayName("GetDogById")
    public void getDogById(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setId(1);
        cut.addDog( theDog );

        Dog dog = cut.getDogById(1);
        assertEquals(theDog, dog);
    }
}

