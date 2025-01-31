package com.parkingmanagement.repository;

import com.parkingmanagement.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository pour gérer les opérations CRUD sur l'entité véhicule.
 */
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    /**
     * Trouve tous les véhicules appartenant à utilisateur spécifique
     * @param ownerId L'identifiant de l'utilisateur propriétaire
     * @return Une liste de véhicules appartenant à l'utilisateur
     */
    List<Vehicle>findByOwnerId(Long ownerId);

}
