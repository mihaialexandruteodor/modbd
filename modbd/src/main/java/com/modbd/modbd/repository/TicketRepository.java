package com.modbd.modbd.repository;

import com.modbd.modbd.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Query(value = "SELECT MAX(id_ticket) FROM parking_tickets", nativeQuery = true)
    int getLastIdVal();
;}
