package com.modbd.modbd.service;
import com.modbd.modbd.model.Vehicle;
import com.modbd.modbd.repository.VehiclesRepository;
import com.modbd.modbd.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehiclesRepository vehiclesRepository;
    @Override
    public List<Vehicle> getAllVehicles() {
        return vehiclesRepository.findAll();
    }
}
