package com.parkingmanagement.repository;

import com.parkingmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository pour gérer les opérations CRUD sur l'entité User.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Trouve un utilisateur par son nom d'utilisateur
     * @param username Le nom d'utilisateur à rechercher
     * @return Un optional contenant l'utilisateur trouvé, ou un Optional vide.
     */
    Optional<User> findByUsername(String username);

    /**
     * Trouve un utilisateur par son adresse email
     * @param email L'adresse email à rechercher
     * @return Un optional contenant l'utilisateur trouvé, ou un Optional vide.
     */
    Optional<User>findByEmail(String email);
}
