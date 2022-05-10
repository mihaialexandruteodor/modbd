package com.modbd.modbd.service;

import com.modbd.modbd.model.Ticket;
import com.modbd.modbd.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TicketServiceImpl implements TicketService{

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllParkingTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public void saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public Ticket getTicketById(Integer id) {
        return ticketRepository.getById(id);
    }

    @Override
    public void deleteTicketById(Integer id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public Page<Ticket> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return ticketRepository.findAll(pageable);
    }
}
