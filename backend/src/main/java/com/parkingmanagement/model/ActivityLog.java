package com.parkingmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Représente un enregistrment d'activité (entrée ou sortie d'un véhicule)
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "activity_log")
public class ActivityLog {

    /**
     * Identifiant unique de l'enregistrement d'activité
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Véhicule associé à cette activité
     */
    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    /**
     * Place de parking associée à cette activité
     */
    @ManyToOne
    @JoinColumn(name = "spot_id", nullable = false)
    private ParkingSpot spot;

    /**
     * Heure d'entrée du véhicule
     */
    @Column(nullable = false)
    private LocalDate entryTime;

    /**
     * Heure de sortie du véhicule (peut être null si le véhicule est encore dans le parking
     *
     */
    @Column(nullable = false)
    private LocalDateTime exitTime;

    /**
     * Date de création de l'enregistrement d'activité
     */
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createAt = LocalDateTime.now();



}
