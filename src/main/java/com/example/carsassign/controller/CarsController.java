package com.example.carsassign.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.carsassign.model.Cars;
import com.example.carsassign.service.CarsService;


@RestController
@RequestMapping("/api")
public class CarsController {
        @Autowired
        CarsService carService;
        
        @RequestMapping(value="/cars", method=RequestMethod.POST)
        public Cars createCars(@RequestBody Cars car) {
            return carService.createCars(car);
        }
        
        @RequestMapping(value="/cars", method=RequestMethod.GET)
        public List<Cars> readCars() {
            return carService.getCars();
        }
       
        
        @RequestMapping(value="/cars/{carName}", method=RequestMethod.GET)
        public List<Cars> readCarsbyName(@PathVariable(value = "carName") String name) {
        	return carService.getCarsDetailsbyName(name);
        }


}
