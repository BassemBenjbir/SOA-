// Package définissant l'emplacement de l'interface dans la structure du projet
package repositories;

// Import des classes nécessaires
import org.example.entities.EtaCompte;
import org.example.entities.TypeCompte;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

// Déclaration de l'interface CompteRepository, étendant JpaRepository pour la gestion des opérations CRUD sur l'entité Compte
@Repository
public interface CompteRepository <Compte> extends JpaRepository<Compte, Long> {



    }