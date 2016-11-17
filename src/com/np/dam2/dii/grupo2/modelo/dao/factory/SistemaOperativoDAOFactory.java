/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.SistemaOperativoDAO;

/**
 *
 * @author Grupo 2
 */
public class SistemaOperativoDAOFactory {

    private SistemaOperativoDAOFactory() {
    }

    public static SistemaOperativoDAOFactory instance = null;

    public static SistemaOperativoDAOFactory getInstance() {
        if (instance == null) {
            instance = new SistemaOperativoDAOFactory();
        }
        return instance;
    }

    public SistemaOperativoDAO createSistemaOperativoDAO() {
        return new SistemaOperativoDAO();
    }

}
