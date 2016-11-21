/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.OperacionCompraDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.OperacionCompraDTO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.OperacionCompraDAOFactory;
import com.np.dam2.dii.grupo2.vista.OperacionCompraUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseCarlos
 */
public class ControladorOperacionCompraUI implements ActionListener {

    OperacionCompraUI ui;
    OperacionCompraDTO dto;
    OperacionCompraDAO dao;

    public ControladorOperacionCompraUI() {
        ui = new OperacionCompraUI();
        dto = new OperacionCompraDTO();
        dao = OperacionCompraDAOFactory.getInstance().createOperacionCompraDAO();
        ui.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "Guardar":
                dto.setIdPresupuestoFK(ui.comboPresupuestoFK.getSelectedItem().toString());
                dto.setNumeroOpCompra(Integer.parseInt(ui.textoNumeroCompras.getText()));
                dto.setStatus(ui.comboStatus.getSelectedItem().toString());
                dao.guardar(dto);
                ui.dispose();
                JOptionPane.showMessageDialog(ui, "Compra creada");
        }
    }

}
