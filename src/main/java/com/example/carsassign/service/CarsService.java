package com.example.carsassign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carsassign.model.Cars;
import com.example.carsassign.repository.CarsRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CarsService {

        @Autowired
            CarsRepository carRepository;     
        
     // CREATE 
        public Cars createCars(Cars car) {
            return carRepository.save(car);
        }

        // READ
        public List<Cars> getCars() {
            return carRepository.findAll();
        }

        
        // READ BY NAME
        public List<Cars> getCarsDetailsbyName(String name) {
            return carRepository.findByName(name);
        }

}
