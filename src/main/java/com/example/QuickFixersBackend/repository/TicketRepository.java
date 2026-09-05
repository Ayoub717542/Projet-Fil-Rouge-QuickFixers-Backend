package com.example.QuickFixersBackend.repository;

import com.example.QuickFixersBackend.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
