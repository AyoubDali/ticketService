package com.example.ticketservice.Service;


import com.example.ticketservice.Model.Ticket;
import com.example.ticketservice.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/TicketService")

public class TicketService {

        @Autowired
        TicketRepository ticketRepository;

        @GetMapping(value = "/findAllTickets")
        public List findTicket(){
            List ticketList = ticketRepository.findAll();
            return ticketList;
        }

        @PostMapping(value= "/ticketReservation")
        public Ticket newTicket(@RequestBody Ticket newTicket) {
            //  System.out.println(newTicket.getFlight().getId());
            ticketRepository.save(newTicket);
            return newTicket;
        }


    @DeleteMapping(value = "/deleteTicket/{id}")
    public String deleteTicket(@PathVariable Long id){

        ticketRepository.deleteById(id);
        return "OK!" ;
    }

    @PutMapping(value = "/editTicket/{id}")
    public Ticket editFlight(@RequestBody Ticket ticketInfo, @PathVariable long id){

        Ticket ticket = ticketRepository.findById(id);
        ticket.setPrice(ticketInfo.getPrice());
        ticketRepository.save(ticket);
        return ticket;
    }

}
