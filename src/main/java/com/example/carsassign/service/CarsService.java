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
        
//        // READ BY ID
//        public Optional<Cars> getCarsDetails(Long carId) {
//            return carRepository.findById(carId);
//        }
        
        // READ BY NAME
        public List<Cars> getCarsDetailsbyName(String name) {
            return carRepository.findByName(name);
//            Optional<Cars> byCarname = carRepository.findByCarname(name);
//            return Optional.ofNullable(byCarname.orElseThrow(() -> new RuntimeException("User not found")));
        }

//        // DELETE
//        public void deleteCars(Long carId) {
//        	carRepository.deleteById(carId);
//        }
//
//     // UPDATE
//        public Cars updateCars(Long carId, Cars carDetails) {
//        	Cars car = carRepository.findById(carId).get();
//                car.setCarName(carDetails.getCarName());
//                car.setAccleration(carDetails.getAccleration());
//                car.setCylinders(carDetails.getCylinders());
//                car.setDisplacement(carDetails.getCylinders());
//                car.setHorsePwr(carDetails.getHorsePwr());
//                car.setMilespGallon(carDetails.getMilespGallon());
//                car.setOrigin(carDetails.getOrigin());
//                car.setWgtInlbs(carDetails.getWgtInlbs());
//                car.setYear(carDetails.getYear());
//
//                return carRepository.save(car);                                
//        }
}
