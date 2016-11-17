/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.UsuarioDAO;

/**
 *
 * @author Fabregas
 */
public class UsuarioDAOFactory {

    private UsuarioDAOFactory() {
    }

    public static UsuarioDAOFactory instance = null;

    public static UsuarioDAOFactory getInstance() {
        if (instance == null) {
            instance = new UsuarioDAOFactory();
        }
        return instance;
    }

    public UsuarioDAO createUsuarioDAO() {
        return new UsuarioDAO();
    }

}
