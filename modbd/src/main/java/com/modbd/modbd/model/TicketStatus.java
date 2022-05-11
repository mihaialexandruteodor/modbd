package com.modbd.modbd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_status")
public class TicketStatus {

    @Id
    @Column(name = "id_ticket_status")
    private Integer id_ticket_status;

    @Column(name = "ticket_status_name")
    private String ticket_status_name;

    public Integer getId_ticket_status() {
        return id_ticket_status;
    }

    public void setId_ticket_status(Integer id_ticket_status) {
        this.id_ticket_status = id_ticket_status;
    }

    public String getTicket_status_name() {
        return ticket_status_name;
    }

    public void setTicket_status_name(String ticket_status_name) {
        this.ticket_status_name = ticket_status_name;
    }
}
