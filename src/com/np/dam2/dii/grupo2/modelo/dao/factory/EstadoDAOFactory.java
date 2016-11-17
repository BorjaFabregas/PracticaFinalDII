/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.EstadoDAO;

/**
 *
 * @author Grupo 2
 */
public class EstadoDAOFactory {

    private EstadoDAOFactory() {
    }

    public static EstadoDAOFactory instance = null;

    public static EstadoDAOFactory getInstance() {
        if (instance == null) {
            instance = new EstadoDAOFactory();
        }
        return instance;
    }

    public EstadoDAO createEstadoDAO() {
        return new EstadoDAO();
    }

}
