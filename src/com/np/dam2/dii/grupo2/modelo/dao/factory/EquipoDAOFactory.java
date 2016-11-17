/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.EquipoDAO;

/**
 *
 * @author Grupo 2
 */
public class EquipoDAOFactory {

    private EquipoDAOFactory() {
    }

    public static EquipoDAOFactory instance = null;

    public static EquipoDAOFactory getInstance() {
        if (instance == null) {
            instance = new EquipoDAOFactory();
        }
        return instance;
    }

    public EquipoDAO createEquipoDAO() {
        return new EquipoDAO();
    }

}
