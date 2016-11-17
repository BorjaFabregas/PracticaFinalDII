/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.RecepcionDAO;

/**
 *
 * @author Grupo 2
 */
public class RecepcionDAOFactory {
    
    private RecepcionDAOFactory() {
    }
    
    public static RecepcionDAOFactory instance = null;
    
    public static RecepcionDAOFactory getInstance() {
        if (instance == null) {
            instance = new RecepcionDAOFactory();
        }
        return instance;
    }
    
    public RecepcionDAO createRecepcionDAO() {
        return new RecepcionDAO();
    }
    
}
