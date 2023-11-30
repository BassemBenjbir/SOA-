// Package définissant l'emplacement de la classe dans la structure du projet

        package org.example.org.example.DialloAbdoullah_LSI3_SOA_TP6;

// Import des classes de Spring Boot nécessaires
import org.example.entities.Compte;
import org.example.entities.EtaCompte;
import org.example.entities.TypeCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repositories.CompteRepository;

import java.util.Date;

// Annotation indiquant que cette classe est une classe principale de l'application Spring Boot
@SpringBootApplication
//@ComponentScan({"com.delivery.request"})
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("repositories")
public class DialloAbdoullahLsi3SoaTp6Application /*extends SpringBootServletInitializer */{

    // Méthode principale appelée lors du lancement de l'application
    public static void main(String[] args) {
        // Lancement de l'application Spring Boot en utilisant la classe principale et les arguments fournis
        SpringApplication.run(DialloAbdoullahLsi3SoaTp6Application.class, args);
    }

    @Bean
     CommandLineRunner runner(CompteRepository cmp) {
        return args -> {

        //Sauvegarde d'un nouveau compte avec des valeurs par défaut dans le repository
        cmp.save(new Compte(null, 299, new Date(), TypeCompte.COURANT, EtaCompte.CREE));
        cmp.save(new Compte(null,70,new Date() , TypeCompte.EPARGNE, EtaCompte.CREE));
        cmp.save(new Compte(null , 58, new Date(),TypeCompte.EPARGNE, EtaCompte.CREE));

        cmp.findAll().forEach(c -> {
            System.out.println(c);
            });

     };
         }



}
