package com.modbd.modbd.service;

import com.modbd.modbd.model.TicketStatus;
import com.modbd.modbd.repository.TicketStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketStatusServiceImpl implements TicketStatusService{

    @Autowired
    private TicketStatusRepository ticketStatusRepository;

    @Override
    public List<TicketStatus> getAllTicketStatuses() {
        return ticketStatusRepository.findAll();
    }
}
