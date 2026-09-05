package com.example.QuickFixersBackend.model;

import com.example.QuickFixersBackend.enums.Statut;
import jakarta.persistence.*;

import java.time.LocalDate;

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  titre;
    private String description;

    @Enumerated(EnumType.STRING)
    private Statut statut;
    private LocalDate dateCreation;
    private User assignedTo;
    private double prix;

}
