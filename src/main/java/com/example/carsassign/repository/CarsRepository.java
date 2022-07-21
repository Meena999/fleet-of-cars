package com.example.carsassign.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.example.carsassign.model.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, String>, QueryByExampleExecutor<Cars>{

     @Query(value = "SELECT * FROM cars where Name = ?", nativeQuery = true)
    List<Cars> findByName(String name);
}
