/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.OperacionCompraDAO;

/**
 *
 * @author Grupo 2
 */
public class OperacionCompraDAOFactory {

    private OperacionCompraDAOFactory() {
    }

    public static OperacionCompraDAOFactory instance = null;

    public static OperacionCompraDAOFactory getInstance() {
        if (instance == null) {
            instance = new OperacionCompraDAOFactory();
        }
        return instance;
    }

    public OperacionCompraDAO createOperacionCompraDAO() {
        return new OperacionCompraDAO();
    }

}
