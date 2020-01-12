package com.example.ticketservice;

import com.example.ticketservice.Model.Ticket;
import com.example.ticketservice.Repository.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TicketserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(TicketRepository ticketRepository){
        return args->{
            Stream.of("FC","SC","FC").forEach(dp->{
                ticketRepository.save(new Ticket((long)0, (long) 300,dp,dp,dp,dp,100020));
            });

            ticketRepository.findAll().forEach(System.out::println);

        };
    }
}
