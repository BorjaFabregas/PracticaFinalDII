/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.ContactoDAO;

/**
 *
 * @author Grupo 2
 */
public class ContactoDAOFactory {
    
    private ContactoDAOFactory() {
    }

    public static ContactoDAOFactory instance = null;

    public static ContactoDAOFactory getInstance() {
        if (instance == null) {
            instance = new ContactoDAOFactory();
        }
        return instance;
    }

    public ContactoDAO createContactoDAO() {
        return new ContactoDAO();
    }
    
}
