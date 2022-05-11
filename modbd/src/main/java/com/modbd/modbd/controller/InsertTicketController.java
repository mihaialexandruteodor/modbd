package com.modbd.modbd.controller;


import com.modbd.modbd.model.Ticket;
import com.modbd.modbd.model.TicketStatus;
import com.modbd.modbd.model.TicketType;
import com.modbd.modbd.service.TicketService;
import com.modbd.modbd.service.TicketStatusService;
import com.modbd.modbd.service.TicketTypeService;
import com.modbd.modbd.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
import java.util.List;

@Controller
public class InsertTicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private TicketTypeService ticketTypeService;

    @Autowired
    private TicketStatusService ticketStatusService;

    @GetMapping("/newTicket")
    public String newTicket(Model model)
    {
        Ticket ticket = new Ticket();
        ticket.setDate_ticket_issued(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        ticket.setDate_ticket_finished(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        List<Integer> vehicleids = vehicleService.getAllVehicleIds();
        List<TicketType> tickettypes = ticketTypeService.getAllTicketTypes();
        List<TicketStatus> ticketstatuses = ticketStatusService.getAllTicketStatuses();
        model.addAttribute("ticket",ticket);
        model.addAttribute("vehicleids",vehicleids);
        model.addAttribute("tickettypes",tickettypes);
        model.addAttribute("ticketstatuses",ticketstatuses);
        return "insert_ticket";
    }

    @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("ticket") Ticket ticket) {
        ticketService.saveTicket(ticket);
        return "index";
    }

    @GetMapping("/updateTicket/{id}")
    public String updateTicket(@PathVariable ( value = "id") int id, Model model) {

        Ticket ticket = ticketService.getTicketById(id);
        List<Integer> vehicleids = vehicleService.getAllVehicleIds();
        List<TicketType> tickettypes = ticketTypeService.getAllTicketTypes();
        List<TicketStatus> ticketstatuses = ticketStatusService.getAllTicketStatuses();
        model.addAttribute("ticket",ticket);
        model.addAttribute("vehicleids",vehicleids);
        model.addAttribute("tickettypes",tickettypes);
        model.addAttribute("ticketstatuses",ticketstatuses);
        return "update_ticket";
    }

    @GetMapping("/deleteTicket/{id}")
    public String deleteCharacterProfile(@PathVariable (value = "id") int id) {
        ticketService.deleteTicketById(id);
        return "redirect:/viewTickets";
    }

}
