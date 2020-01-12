package com.example.ticketservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long price;
    private String classType;
    private String date;
    private String passengerFirstName;
    private String passengerLastName;
    private long cin;
}
