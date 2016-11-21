/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.PresupuestoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.PresupuestoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.PresupuestoDAOFactory;
import com.np.dam2.dii.grupo2.vista.PresupuestoUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseCarlos
 */
public class ControladorPresupuestoUI implements ActionListener {

    PresupuestoUI presupuesto;
    PresupuestoDTO dto;
    PresupuestoDAO dao;

    public ControladorPresupuestoUI() {
        presupuesto = new PresupuestoUI();
        presupuesto.btnGuardar.addActionListener(this);
        dao = PresupuestoDAOFactory.getInstance().createPresupuestoDAO();
        dto = new PresupuestoDTO();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case "Guardar":
                dto.setPresupuesto(presupuesto.textField.getText());
                dto.setFecha(presupuesto.textField_1.getText());
                dto.setIdEmpresaFK(presupuesto.comboBox_1.getSelectedItem().toString());
                dto.setStatus(presupuesto.comboBox.getSelectedItem().toString());
                dao.guardar(dto);
                presupuesto.dispose();
                JOptionPane.showMessageDialog(presupuesto, "Presupuesto Guardado");
        }
    }

}
