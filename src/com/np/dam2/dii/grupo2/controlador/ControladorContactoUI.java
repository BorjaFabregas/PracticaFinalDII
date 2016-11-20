/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.ContactoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.ContactoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.ContactoDAOFactory;
import com.np.dam2.dii.grupo2.vista.ContactoUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabregas
 */
public class ControladorContactoUI implements ActionListener {

    ContactoUI ui;
    ContactoDAO dao;
    ContactoDTO dto;
    
    public ControladorContactoUI(String accion) {
        ui = new ContactoUI(accion);
        ui.btnAccion.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        dao = ContactoDAOFactory.getInstance().createContactoDAO();
        dto = new ContactoDTO();
        
        switch (e.getActionCommand()) {
            case "Guardar":
                dto.setCedula(ui.cedula.getText());
                dto.setDireccion(ui.direccion.getText());
                dto.setEmail(ui.email.getText());
                dto.setMovil(Integer.parseInt(ui.movil.getText()));
                dto.setNombre(ui.nombre.getText());
                dto.setStatus(ui.comboBoxEstatus.getSelectedItem().toString());
                dto.setIdEmpresaFK(ui.comboBoxEmpresas.getSelectedItem().toString());
                dto.setIdEstadoFK(ui.comboBoxEstados.getSelectedItem().toString());
                dto.setTelefono(Integer.parseInt(ui.fijo.getText()));
                dao.guardar(dto);
                JOptionPane.showMessageDialog(ui,"Contacto Guardado");
                ui.dispose();
                break;
        }
        
    }
    
}
