/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.PaisDAO;

/**
 *
 * @author Grupo 2
 */
public class PaisDAOFactory {
    
    private PaisDAOFactory() {
    }
    
    public static PaisDAOFactory instance = null;
    
    public static PaisDAOFactory getInstance() {
        if (instance == null) {
            instance = new PaisDAOFactory();
        }
        return instance;
    }
    
    public PaisDAO createPaisDAO() {
        return new PaisDAO();
    }
    
}
