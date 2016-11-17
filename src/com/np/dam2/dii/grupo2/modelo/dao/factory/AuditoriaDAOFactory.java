/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.AuditoriaDAO;

/**
 *
 * @author Grupo 2
 */
public class AuditoriaDAOFactory {
    
    private AuditoriaDAOFactory() {
    }
    
    public static AuditoriaDAOFactory instance = null;
    
    public static AuditoriaDAOFactory getInstance() {
        if (instance == null) {
            instance = new AuditoriaDAOFactory();
        }
        return instance;
    }
    
    public AuditoriaDAO createAuditoriaDAO() {
        return new AuditoriaDAO();
    }
    
}
