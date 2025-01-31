package com.parkingmanagement.repository;

import com.parkingmanagement.model.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository pour gérer les opérations CRUD sur l'entité ParkingSpot.
 */
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Long> {

    /**
     * Trouve toutes les places de parking disponibles ou non disponibles.
     * @param isAvailable true pour les places disponibles, false pour les places réservées.
     * @return Une liste de places de parking correspondant au statut de disponibilité.
     */
    List<ParkingSpot> findByIsAvailable(Boolean isAvailable);
}
