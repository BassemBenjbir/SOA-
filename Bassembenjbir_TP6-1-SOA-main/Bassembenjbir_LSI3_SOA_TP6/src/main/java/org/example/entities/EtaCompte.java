// Package définissant l'emplacement de la classe dans la structure du projet
package org.example.entities;

// Déclaration d'une énumération représentant les différents états d'un compte
public enum EtaCompte {
    

// Les différents états possibles d'un compte, chaque état étant une valeur de l'énumération
    CREE,        // État lorsqu'un compte vient d'être créé
    ACTIVE,      // État lorsqu'un compte est actif et opérationnel
    SUSPENDU,
    // État lorsqu'un compte est suspendu, c'est-à-dire temporairement inactif
    BLOQUE,

// État lorsqu'un compte est bloqué, c'est-à-dire qu'il ne peut pas être utilisé pour des opérations
}