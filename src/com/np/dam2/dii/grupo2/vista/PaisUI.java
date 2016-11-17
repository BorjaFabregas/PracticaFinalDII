package com.np.dam2.dii.grupo2.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class PaisUI extends JFrame {

    public JTextField textField;
    public JButton guardar;

    public PaisUI() {
        
        setTitle("Nuevo Pais");

        JPanel north = new JPanel();
        north.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        GridBagLayout gbl_north = new GridBagLayout();
        gbl_north.columnWidths = new int[]{0, 189, 0};
        gbl_north.rowHeights = new int[]{0, 0};
        gbl_north.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        gbl_north.rowWeights = new double[]{0.0, Double.MIN_VALUE};
        north.setLayout(gbl_north);

        JLabel nombre = new JLabel("Nombre");
        GridBagConstraints gbc_nombre = new GridBagConstraints();
        gbc_nombre.anchor = GridBagConstraints.EAST;
        gbc_nombre.insets = new Insets(0, 0, 0, 5);
        gbc_nombre.gridx = 0;
        gbc_nombre.gridy = 0;
        north.add(nombre, gbc_nombre);

        textField = new JTextField();
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField.gridx = 1;
        gbc_textField.gridy = 0;
        north.add(textField, gbc_textField);
        textField.setColumns(10);

        JPanel south = new JPanel();
        getContentPane().add(south, BorderLayout.SOUTH);

        guardar = new JButton("Guardar");
        south.add(guardar);
        
        setLocationRelativeTo(null);
        setSize(256,90);
        setVisible(true);
        setResizable(false);
        
    }

}
