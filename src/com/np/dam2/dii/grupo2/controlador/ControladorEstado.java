/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.EstadoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.EstadoDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EstadoDTO;
import com.np.dam2.dii.grupo2.vista.EstadoUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Fabregas
 */
public class ControladorEstado implements ActionListener{

    public EstadoUI estado  = new EstadoUI();
    public EstadoDTO dto;
    public EstadoDAO dao;

    public ControladorEstado() {
        estado.guardar.addActionListener(this);
        estado.paises.addActionListener(this);
        dao = EstadoDAOFactory.getInstance().createEstadoDAO();
        dto = new EstadoDTO();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando = e.getActionCommand();
        
        switch (comando){
            case "Guardar":
                dto.setNombre(estado.textField.getText());
                dao.guardar(dto);
                break;
        }
        
    }
    
}
