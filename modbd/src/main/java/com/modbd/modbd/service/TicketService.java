package com.modbd.modbd.service;

import com.modbd.modbd.model.Ticket;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllParkingTickets();
    void saveTicket(Ticket ticket);
    Ticket getTicketById(Integer id);
    void deleteTicketById(Integer id);
    Page<Ticket> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
