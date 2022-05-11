package com.modbd.modbd.service;

import com.modbd.modbd.model.TicketType;
import com.modbd.modbd.repository.TicketTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketTypeServiceImpl implements TicketTypeService{

    @Autowired
    private TicketTypeRepository ticketTypeRepository;

    @Override
    public List<TicketType> getAllTicketTypes() {
        return ticketTypeRepository.findAll();
    }

    @Override
    public List<String> getAllTicketTypesNames() {
        return ticketTypeRepository.getAllTicketTypes();
    }
}
