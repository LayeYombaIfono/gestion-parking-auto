package com.parkingmanagement.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Représente une place de parking dans le système
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "parking_spots")
public class ParkingSpot {

    /**
     * Identifiant unique de la place de parking
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Numéro unique de la place de parking
     */
    @Column(unique = true, nullable = false, length = 15)
    private String spotNumber;

    /**
     * Indique si la place est disponible ou réservée.
     */
    @Column(nullable = false)
    private Boolean isAvailable = true;

    /**
     * Utilisateur qui a réservé la place (peut être null si la place est disponible
     */
    @ManyToOne
    @JoinColumn(name = "reserved_by")
    private User reservedBy;

    /**
     * Date de création de l'enregistrement de la place de parking.
     */
    @Column(name = "create_at", nullable = false, updatable = false)
    private LocalDateTime createAt = LocalDateTime.now();
}
