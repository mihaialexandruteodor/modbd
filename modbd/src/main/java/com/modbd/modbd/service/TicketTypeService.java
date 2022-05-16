package com.modbd.modbd.service;

import com.modbd.modbd.model.Ticket;
import com.modbd.modbd.model.TicketType;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TicketTypeService {
    List<TicketType> getAllTicketTypes();

}
