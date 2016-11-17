/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.PresupuestoEquipoDAO;

/**
 *
 * @author Grupo 2
 */
public class PresupuestoEquipoDAOFactory {
    
    private PresupuestoEquipoDAOFactory() {
    }
    
    public static PresupuestoEquipoDAOFactory instance = null;
    
    public static PresupuestoEquipoDAOFactory getInstance() {
        if (instance == null) {
            instance = new PresupuestoEquipoDAOFactory();
        }
        return instance;
    }
    
    public PresupuestoEquipoDAO createPresupuestoEquipoDAO() {
        return new PresupuestoEquipoDAO();
    }
    
}
