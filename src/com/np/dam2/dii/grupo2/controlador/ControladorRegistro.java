/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.dto.UsuarioDTO;
import com.np.dam2.dii.grupo2.modelo.dao.UsuarioDAO;
import com.np.dam2.dii.grupo2.vista.RegistroUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabregas
 */
public class ControladorRegistro implements ActionListener {

    RegistroUI registro = new RegistroUI();
    UsuarioDTO dto;
    UsuarioDAO dao;

    public ControladorRegistro() {
        registro.getBtnCrearCuenta().addActionListener(this);
        dto = new UsuarioDTO();
        dao = new UsuarioDAO();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();

        switch (comando) {
            case "Crear Cuenta":
                dto.setUsuario(registro.getTextFieldUsuario().getText().toString());
                if (registro.getTextFieldPassConfirm().getText().toString().equals(registro.getTextFieldPass().getText().toString())) {
                    dto.setPass(registro.getTextFieldPass().getText().toString());
                    dao.guardar(dto);
                    JOptionPane.showMessageDialog(registro, "Usuario introducido Correctamente");
                    registro.dispose();
                    ControladorLogin controladorLogin = new ControladorLogin();

                } else {
                    JOptionPane.showMessageDialog(registro, "Contraseñas distintas");
                }
                dto.setNivel("Basico");

                break;
        }

    }

}
