package com.modbd.modbd.controller;
import com.modbd.modbd.model.*;
import com.modbd.modbd.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @Autowired
    private ZoneService zoneService;
    @GetMapping("/newTicket")
    public String newTicket(Model model)
    {
        Ticket ticket = new Ticket();
        ticket.setDate_ticket_issued(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        ticket.setDate_ticket_finished(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        List<TicketType> tickettypes = ticketTypeService.getAllTicketTypes();
        List<TicketStatus> ticketstatuses = ticketStatusService.getAllTicketStatuses();
        List<Zone> zones = zoneService.getAllZones();
        model.addAttribute("ticket",ticket);
        model.addAttribute("vehicles",vehicles);
        model.addAttribute("tickettypes",tickettypes);
        model.addAttribute("ticketstatuses",ticketstatuses);
        model.addAttribute("zones",zones);
        return "insert_ticket";
    }
    @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("ticket") Ticket ticket) {
        ticket.setId_ticket(ticketService.getLastIdVal()+1);
        ticketService.saveTicket(ticket);

        return "redirect:/viewTickets";
    }

    @PostMapping("/UpdateTicketValue")
    public String UpdateTicketValue(@ModelAttribute("ticket") Ticket ticket) {

        ticketService.saveTicket(ticket);

        return "redirect:/viewTickets";
    }
    @GetMapping("/updateTicket/{id}")
    public String updateTicket(@PathVariable ( value = "id") int id, Model model) {
        Ticket ticket = ticketService.getTicketById(id);
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        List<TicketType> tickettypes = ticketTypeService.getAllTicketTypes();
        List<TicketStatus> ticketstatuses = ticketStatusService.getAllTicketStatuses();
        List<Zone> zones = zoneService.getAllZones();
        model.addAttribute("ticket",ticket);
        model.addAttribute("vehicles",vehicles);
        model.addAttribute("tickettypes",tickettypes);
        model.addAttribute("ticketstatuses",ticketstatuses);
        model.addAttribute("zones",zones);
        return "update_ticket";
    }
    @GetMapping("/deleteTicket/{id}")
    public String deleteCharacterProfile(@PathVariable (value = "id") int id) {
        ticketService.deleteTicketById(id);
        return "redirect:/viewTickets";
    }
}