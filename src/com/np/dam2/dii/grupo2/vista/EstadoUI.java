package com.np.dam2.dii.grupo2.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;

public class EstadoUI extends JFrame {

    public JTextField textField;
    public JLabel pais;
    public JComboBox<String> paises;
    public JButton guardar;
    
    public EstadoUI() {
        setTitle("Nuevo Estado");

        JPanel north = new JPanel();
        north.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        GridBagLayout gbl_north = new GridBagLayout();
        gbl_north.columnWidths = new int[]{67, 0, 0};
        gbl_north.rowHeights = new int[]{0, 0, 0};
        gbl_north.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        gbl_north.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        north.setLayout(gbl_north);

        JLabel nombre = new JLabel("Nombre");
        GridBagConstraints gbc_nombre = new GridBagConstraints();
        gbc_nombre.insets = new Insets(0, 0, 5, 5);
        gbc_nombre.anchor = GridBagConstraints.WEST;
        gbc_nombre.gridx = 0;
        gbc_nombre.gridy = 0;
        north.add(nombre, gbc_nombre);

        textField = new JTextField();
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.insets = new Insets(0, 0, 5, 0);
        gbc_textField.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField.gridx = 1;
        gbc_textField.gridy = 0;
        north.add(textField, gbc_textField);
        textField.setColumns(10);

        pais = new JLabel("Pais");
        GridBagConstraints gbc_pais = new GridBagConstraints();
        gbc_pais.insets = new Insets(0, 0, 0, 5);
        gbc_pais.anchor = GridBagConstraints.WEST;
        gbc_pais.gridx = 0;
        gbc_pais.gridy = 1;
        north.add(pais, gbc_pais);

       paises = new JComboBox();
        GridBagConstraints gbc_paises = new GridBagConstraints();
        gbc_paises.fill = GridBagConstraints.HORIZONTAL;
        gbc_paises.gridx = 1;
        gbc_paises.gridy = 1;
        north.add(paises, gbc_paises);

        JPanel south = new JPanel();
        getContentPane().add(south, BorderLayout.CENTER);

        guardar = new JButton("Guardar");
        south.add(guardar);
        
        this.setVisible(true);
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        
        
    }

}
