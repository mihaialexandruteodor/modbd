package com.modbd.modbd.repository;

import com.modbd.modbd.model.TicketStatus;
import com.modbd.modbd.model.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketStatusRepository extends JpaRepository<TicketStatus, Integer> {

}
