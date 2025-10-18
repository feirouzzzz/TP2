package com.example.presentation;

import com.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("unused")
@Configuration // Indique que cette classe contient des configurations Spring
@ComponentScan(basePackages = { "com.example.dao", "com.example.metier" }) // Indique à Spring de scanner ces packages
                                                                           // pour trouver des beans
public class presentation2 {
    public static void main(String[] args) {
        // Création du contexte Spring basé sur les annotations
        ApplicationContext context = new AnnotationConfigApplicationContext(presentation2.class);

        // Récupération du bean IMetier depuis le conteneur Spring
        com.example.metier.IMetier metier = context.getBean(com.example.metier.IMetier.class);

        // Exécution de la méthode calcul() et affichage du résultat
        System.out.println("Résultat = " + metier.calcul());
    }
}