// Package définissant l'emplacement de la classe dans la structure du projet
package org.example.entities;
// Annotations utilisées pour la persistance JPA (Java Persistence API)
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// Annotation Lombok pour générer automatiquement les méthodes Getter, Setter, NoArgsConstructor, AllArgsConstructor et ToString
import lombok.*;
// Import de la classe Date du package java.util
import java.util.Date;
// Annotations Lombok pour générer automatiquement les méthodes Getter, Setter, NoArgsConstructor, AllArgsConstructor et ToString
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
// Annotation JPA indiquant que cette classe est une entité à persister en base de données
@Entity
public class Compte {
    // Annotation JPA indiquant que cet attribut est la clé primaire générée automatiquement
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Déclaration de l'attribut représentant l'identifiant du compte
    public Long id;
    // Déclaration de l'attribut représentant le solde du compte
    public double solde;
    // Déclaration de l'attribut représentant la date associée au compte
    public Date date;
    // Déclaration de l'attribut représentant le type de compte (non défini dans le code fourni)
    public TypeCompte Type;  public EtaCompte etat;
    // Déclaration de l'attribut représentant l'état du compte (non défini dans le code fourni)

    
}