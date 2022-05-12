package com.modbd.modbd.service;

import com.modbd.modbd.model.Zone;
import com.modbd.modbd.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService{

    @Autowired
    private ZoneRepository zoneRepository;


    @Override
    public List<Zone> getAllZones() {
        return zoneRepository.findAll();
    }
}
