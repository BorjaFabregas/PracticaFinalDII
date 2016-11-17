/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.IvaDAO;

/**
 *
 * @author Grupo 2
 */
public class IvaDAOFactory {
    
    private IvaDAOFactory() {
    }
    
    public static IvaDAOFactory instance = null;
    
    public static IvaDAOFactory getInstance() {
        if (instance == null) {
            instance = new IvaDAOFactory();
        }
        return instance;
    }
    
    public IvaDAO createIvaDAO() {
        return new IvaDAO();
    }
    
}
