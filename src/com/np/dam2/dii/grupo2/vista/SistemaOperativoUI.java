package com.np.dam2.dii.grupo2.vista;

import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class SistemaOperativoUI extends JFrame {

    JPanel panel;
    JLabel lblNombre;
    JLabel lblPrecio;
    JLabel lblStatus;
    JTextField nombre;
    JTextField precio;
    JComboBox status;

    public SistemaOperativoUI() throws HeadlessException {

        panel = new JPanel();
        GridBagLayout gbPanel0 = new GridBagLayout();
        GridBagConstraints gbcPanel0 = new GridBagConstraints();
        panel.setLayout(gbPanel0);

        lblNombre = new JLabel("Nombre");
        gbcPanel0.gridx = 1;
        gbcPanel0.gridy = 1;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbcPanel0.insets = new Insets(5, 5, 5, 5);
        gbPanel0.setConstraints(lblNombre, gbcPanel0);
        panel.add(lblNombre);

        lblPrecio = new JLabel("Precio");
        gbcPanel0.gridx = 1;
        gbcPanel0.gridy = 3;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbcPanel0.insets = new Insets(5, 5, 5, 5);
        gbPanel0.setConstraints(lblPrecio, gbcPanel0);
        panel.add(lblPrecio);

        lblStatus = new JLabel("Estatus");
        gbcPanel0.gridx = 1;
        gbcPanel0.gridy = 5;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbcPanel0.insets = new Insets(5, 5, 5, 5);
        gbPanel0.setConstraints(lblStatus, gbcPanel0);
        panel.add(lblStatus);

        nombre = new JTextField();
        gbcPanel0.gridx = 3;
        gbcPanel0.gridy = 1;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbcPanel0.insets = new Insets(5, 0, 0, 5);
        gbPanel0.setConstraints(nombre, gbcPanel0);
        panel.add(nombre);

        precio = new JTextField();
        gbcPanel0.gridx = 3;
        gbcPanel0.gridy = 3;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbcPanel0.insets = new Insets(0, 0, 0, 5);
        gbPanel0.setConstraints(precio, gbcPanel0);
        panel.add(precio);

        String[] dataCombo0 = {"Activo", "Inactivo", "Desconocido"};
        status = new JComboBox(dataCombo0);
        gbcPanel0.gridx = 3;
        gbcPanel0.gridy = 5;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbcPanel0.insets = new Insets(0, 0, 5, 5);
        gbPanel0.setConstraints(status, gbcPanel0);
        panel.add(status);

    }
}
