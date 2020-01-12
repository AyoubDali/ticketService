package com.example.ticketservice.Repository;

import com.example.ticketservice.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    Ticket findById(long id);
}
