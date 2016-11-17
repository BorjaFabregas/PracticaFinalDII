package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.vista.InterfazMaestraUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabregas
 */
public class ControladorInterfazMaestra implements ActionListener {
    
    InterfazMaestraUI interfazMaestra;
    
    public ControladorInterfazMaestra() {
        interfazMaestra = new InterfazMaestraUI();
        interfazMaestra.nuevaEmpresa.addActionListener(this);
        interfazMaestra.borrarAuditoria.addActionListener(this);
        interfazMaestra.cerrarSesion.addActionListener(this);
        interfazMaestra.nuevoPais.addActionListener(this);
        interfazMaestra.nuevoEstado.addActionListener(this);
        interfazMaestra.salir.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()) {
            case "cerrarSesion":
                JOptionPane.showMessageDialog(interfazMaestra, "Hasta Pronto!");
                interfazMaestra.dispose();
                ControladorLogin cl = new ControladorLogin();
                break;
            case "nuevoPais":
                ControladorPais cp = new ControladorPais();
                break;
            case "nuevoEstado":
                ControladorEstado ce = new ControladorEstado();
                break;
            case "borrarAuditoria"://Implementar guardar auditoria
                ControladorAuditoria ca = new ControladorAuditoria("Id", "Borrar");
                break;
            case "salir":
                if (JOptionPane.showConfirmDialog(interfazMaestra, "¿Seguro que quieres salir?", "Salir", 0) == 0) {
                    interfazMaestra.dispose();
                }
                break;
            case "nuevaEmpresa":
                ControladorEmpresaUI cem = new ControladorEmpresaUI();
                break;
        }
        
    }
    
}
