package com.parkingmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Classe qui repesente un utilisateur du systeme de gestion de parking
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {

    /**
     * Identifiant unique de l'utilisateur.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nom d'utilisateur unique.
     */

    @Column(unique = true, nullable = false, length = 50)
    private String username;


    /**
     * Adresse email d'utilisateur unique.
     */
    @Column(unique = true, nullable = false, length = 100)
    private String email;

    /**
     * Mot de passe hashé de l'utilisateur
     */
    @Column( name = "user_password", nullable = false, length = 255)
    private String userPassword;

    /**
     * Role de l'utilisateur (gestionnaire, agent, employe)
     */
    @Column(name = "user_role", nullable = false, length = 20)
    private String role;

    /**
     * Date d'enregistrement de l'utilisateur
     */
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
