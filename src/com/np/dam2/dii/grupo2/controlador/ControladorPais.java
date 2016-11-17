/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.PaisDAO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.PaisDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.dto.PaisDTO;
import com.np.dam2.dii.grupo2.vista.PaisUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabregas
 */
public class ControladorPais implements ActionListener {

    PaisUI pais = new PaisUI();
    PaisDTO dto;
    PaisDAO dao;

    public ControladorPais() {

        pais.guardar.addActionListener(this);
        dao = PaisDAOFactory.getInstance().createPaisDAO();
        dto = new PaisDTO();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();

        switch (comando) {
            case "Guardar":
                dto.setNombre(pais.textField.getText());
                dao.guardar(dto);
                JOptionPane.showMessageDialog(pais, "Pais Creado Correctamente");
                pais.dispose();
                break;
        }

    }

}
