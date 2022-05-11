package com.modbd.modbd.repository;

import com.modbd.modbd.model.Ticket;
import com.modbd.modbd.model.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketTypeRepository extends JpaRepository<TicketType, Integer> {

    @Query(value = "SELECT type_name FROM ticket_types", nativeQuery = true)
    List<String> getAllTicketTypes();
}
