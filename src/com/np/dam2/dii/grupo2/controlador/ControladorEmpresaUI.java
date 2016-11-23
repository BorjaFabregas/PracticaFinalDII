/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.EmpresaDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EmpresaDTO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.EmpresaDAOFactory;
import com.np.dam2.dii.grupo2.vista.EmpresaUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabregas
 */
public class ControladorEmpresaUI implements ActionListener {

    EmpresaUI ui;
    EmpresaDAO dao;
    EmpresaDTO dto;

    public ControladorEmpresaUI() {
        ui = new EmpresaUI();
        ui.guardar.addActionListener(this);
        dao = EmpresaDAOFactory.getInstance().createEmpresaDAO();
    }

    public ControladorEmpresaUI(String actualizar) {
        dto = new EmpresaDTO();
        dao = EmpresaDAOFactory.getInstance().createEmpresaDAO();
        dto = dao.leer(JOptionPane.showInputDialog(ui, "ID Empresa"));
        ui = new EmpresaUI("Actualizar", dto);
        ui.actualizar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "guardar") {
            dto = new EmpresaDTO();
            dto.setRifEmpresa(ui.getCif().getText());
            dto.setDireccion(ui.getDireccion().getText());
            dto.setEmail(ui.getEmail().getText());
            dto.setMovil(ui.getTelefono().getText());
            dto.setStatus(ui.getComboBox().getSelectedItem().toString());
            dao.guardar(dto);
            ui.dispose();
        }

        if (e.getActionCommand() == "actualizar") {

            dao.actualizar(dto);
            ui.dispose();
        }

    }

}
