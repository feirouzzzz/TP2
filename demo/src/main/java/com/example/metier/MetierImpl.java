package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.IDao;

@Component // <- obligatoire pour que Spring gère ce bean
public class MetierImpl {

    @Autowired
    private IDao dao; // injection automatique du DAO

    public double calcul() {
        return dao.getValue() * 2;
    }

    public void setDao(IDao dao2) {
        throw new UnsupportedOperationException("Unimplemented method 'setDao'");
    }
}
