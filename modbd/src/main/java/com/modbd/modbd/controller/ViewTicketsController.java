package com.modbd.modbd.controller;

import com.modbd.modbd.model.Ticket;
import com.modbd.modbd.service.TicketService;
import com.modbd.modbd.service.TicketStatusService;
import com.modbd.modbd.service.TicketTypeService;
import com.modbd.modbd.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ViewTicketsController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private TicketTypeService ticketTypeService;

    @Autowired
    private TicketStatusService ticketStatusService;

    @GetMapping("/viewTickets")
    public ModelAndView viewTickets()
    {
        //return findPaginated(1, "id_ticket", "asc");
        ModelAndView model = new ModelAndView("view_tickets");
        List<Ticket> listTickets = ticketService.getAllParkingTickets();
        model.addObject("listTickets", listTickets);
        return model;
    }

    @GetMapping("/page/{pageNo}")
    public ModelAndView findPaginated( @PathVariable(value = "pageNo") int pageNo,
                                 @RequestParam("sortField") String sortField,
                                 @RequestParam("sortDir") String sortDir) {
        int pageSize = 6;

        ModelAndView model = new ModelAndView("view_tickets");

        Page<Ticket> page = ticketService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<Ticket> listTickets = page.getContent();

        model.addObject("currentPage", pageNo);
        model.addObject("totalPages", page.getTotalPages());
        model.addObject("totalItems", page.getTotalElements());

        model.addObject("sortField", sortField);
        model.addObject("sortDir", sortDir);
        model.addObject("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addObject("listTickets", listTickets);

        return model;
    }

}
