package com.parkingmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Représente un véhicule enregistré dans le système.
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "vehicle")
public class Vehicle {

    /**
     * Identifiant unique du véhicule
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Numéro d'immatriculation unique du véhicule
     */
    @Column(unique = true, nullable = false, length = 10)
    private String plateNumber;

    /**
     * Marque du véhicule.
     */
    @Column(nullable = false, length = 100)
    private String brand;

    /**
     * Modèle du véhicule
     */
    @Column(nullable = false, length = 50)
    private String model;

    /**
     * Propriétaire du véhicule (référence à l'utilisateur)
     */
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    /**
     * Date de création de l'enregistrement du véhicule.
     */
    @Column(name = "create_at", nullable = false, updatable = false)
    private LocalDateTime createAt = LocalDateTime.now();


}
