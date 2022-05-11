package com.modbd.modbd.repository;

import com.modbd.modbd.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehiclesRepository extends JpaRepository<Vehicle, Integer> {

    @Query(value = "SELECT id_vehicle FROM vehicles", nativeQuery = true)
    List<Integer> getAllVehicleIds();
}
