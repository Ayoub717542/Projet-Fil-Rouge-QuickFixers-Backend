package com.example.QuickFixersBackend.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class RegisterRequoestDTO {
    private String nom;
    private String prenom;
    private String email;
    private String password;
}

