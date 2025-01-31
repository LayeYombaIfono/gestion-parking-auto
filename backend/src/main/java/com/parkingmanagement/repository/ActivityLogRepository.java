package com.parkingmanagement.repository;

import com.parkingmanagement.model.ActivityLog;
import com.parkingmanagement.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository pour gérer les opérations CRUD sur l'entité ActivityLog.
 */
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {

    /**
     * Trouve tous les enregistrements d'activité pour un véhicule spécifique.
     *
     * @param vehicleId L'identifiant du véhicule.
     * @return Une liste d'enregistrements d'activité pour le véhicule.
     */
    List<ActivityLog> findByVehicleId(Long vehicleId);


    /**
     * Trouve tous les enregistrements d'activité pour une place de parking spécifique.
     *
     * @param spotId L'identifiant de la place de parking.
     * @return Une liste d'enregistrements d'activité pour la place de parking.
     */
    List<ActivityLog> findBySpotId(Long spotId);
}
