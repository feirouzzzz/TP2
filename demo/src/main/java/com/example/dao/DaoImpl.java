package com.example.dao;

import org.springframework.stereotype.Component;

@Component("dao") // Déclare cette classe comme un bean Spring avec l'identifiant "dao"
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        // Cette implémentation retourne une valeur fixe de 100.0
        return 100.0;
    }
}