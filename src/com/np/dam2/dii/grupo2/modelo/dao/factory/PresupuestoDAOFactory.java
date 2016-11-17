/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.PresupuestoDAO;

/**
 *
 * @author Grupo 2
 */
public class PresupuestoDAOFactory {
    
    private PresupuestoDAOFactory() {
    }

    public static PresupuestoDAOFactory instance = null;

    public static PresupuestoDAOFactory getInstance() {
        if (instance == null) {
            instance = new PresupuestoDAOFactory();
        }
        return instance;
    }

    public PresupuestoDAO createPresupuestoDAO() {
        return new PresupuestoDAO();
    }
    
}
