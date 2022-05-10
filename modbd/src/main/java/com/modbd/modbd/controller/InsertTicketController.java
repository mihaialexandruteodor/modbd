package com.modbd.modbd.controller;


import com.modbd.modbd.model.Ticket;
import com.modbd.modbd.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class InsertTicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/newTicket")
    public String newTicket(Model model)
    {
        Ticket ticket = new Ticket();
        model.addAttribute("ticket",ticket);
        return "insert_ticket";
    }

    @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("ticket") Ticket ticket, Model model) {
        ticketService.saveTicket(ticket);
        return "index";
    }

    @GetMapping("/cp/page/{pageNo}")
    public String findPaginated( @PathVariable(value = "pageNo") int pageNo,
                                 @RequestParam("sortField") String sortField,
                                 @RequestParam("sortDir") String sortDir,
                                ModelAndView model) {
        int pageSize = 6;

        Page<Ticket> page = ticketService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<Ticket> listTickets = page.getContent();

        model.addObject("currentPage", pageNo);
        model.addObject("totalPages", page.getTotalPages());
        model.addObject("totalItems", page.getTotalElements());

        model.addObject("sortField", sortField);
        model.addObject("sortDir", sortDir);
        model.addObject("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addObject("listTickets", listTickets);

        return "index";
    }
}
