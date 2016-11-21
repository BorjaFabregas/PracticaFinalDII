/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.EquipoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EquipoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.EquipoDAOFactory;
import com.np.dam2.dii.grupo2.vista.EquipoUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseCarlos
 */
public class ControladorEquipoUI implements ActionListener {
    EquipoUI ui;
    EquipoDTO dto;
    EquipoDAO dao;
    
    public ControladorEquipoUI() {
        ui=new EquipoUI();
        dto=new EquipoDTO();
        dao=EquipoDAOFactory.getInstance().createEquipoDAO();
        ui.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando=e.getActionCommand();
        switch(comando){
            case "Guardar":
                dto.setCantidad(Integer.parseInt(ui.textoCantidad.getText()));
                dto.setDescripcion(ui.textoDescripcion.getText());
                dto.setIdEmpresaFK(ui.comboEmpresaFK.getSelectedItem().toString());
                dto.setIdSistemaOperativoFK(ui.comboSOAsociado.getSelectedItem().toString());
                dto.setNombre(ui.textoNombre.getText());
                dto.setPrecio(Float.parseFloat(ui.textoPrecio.getText()));
                dto.setSistemaOperativo(ui.textoSistemaOperativo.getText());
                dto.setStatus(ui.comboStatus.getSelectedItem().toString());
                dao.guardar(dto);
                ui.dispose();
                JOptionPane.showMessageDialog(ui,"Equipo Creado");
        }
    }

}
