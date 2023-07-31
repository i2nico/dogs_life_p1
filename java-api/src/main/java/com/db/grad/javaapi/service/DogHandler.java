package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;

@Service
public class DogHandler {

    @Autowired
    private DogRepository itsDogRepo;

//    public DogHandler(DogRepository repo) {
//        itsDogRepo = repo;
//    }
//
//    public long addDog(Dog dog) {
//        return itsDogRepo.save(dog);
//    }
//
//    public long getNoOfDogs() {
//        return itsDogRepo.count();
//    }

    public Dog getDogByName(String name) {
        List<Dog> dogs = itsDogRepo.findDogsByName(name);

        int size = dogs.size();
        if (size == 1) {
            return dogs.get(0);
        } else {
            return null;
        }
    }
}
        //   public boolean removeDog(long id){
//       if(this.itsDogRepo.existsById(id)){
//              Dog DogToBeRemoved = this.itsDogRepo.findById(id);
//            return this.itsDogRepo.delete(DogToBeRemoved);}
//        return false;}
//
//
//    public Dog getDogById( long id ) {
//        return itsDogRepo.findById(id);
//    }
//}
