package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.AuditoriaDAO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.AuditoriaDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.dto.AuditoriaDTO;
import com.np.dam2.dii.grupo2.vista.AuditoriaUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Fabregas
 */
public class ControladorAuditoria implements ActionListener {

    AuditoriaUI ui;
    AuditoriaDAO dao;
    AuditoriaDTO dto;

    public ControladorAuditoria(String parametro, String accion) {
        
        dao = AuditoriaDAOFactory.getInstance().createAuditoriaDAO();
        dto = new AuditoriaDTO();
        ui = new AuditoriaUI(parametro, accion);
        ui.accion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();

        switch (comando) {
            case "Borrar":
                dto.setIdAuditoria(ui.textField.getText());
                dao.borrar(dto.getIdAuditoria());
                break;
        }

    }

}
