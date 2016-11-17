/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.factory;

import com.np.dam2.dii.grupo2.modelo.dao.EmpresaDAO;

/**
 *
 * @author Grupo 2
 */
public class EmpresaDAOFactory {

    private EmpresaDAOFactory() {
    }

    public static EmpresaDAOFactory instance = null;

    public static EmpresaDAOFactory getInstance() {
        if (instance == null) {
            instance = new EmpresaDAOFactory();
        }
        return instance;
    }

    public EmpresaDAO createEmpresaDAO() {
        return new EmpresaDAO();
    }

}
