/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ContactoUI extends JFrame {

    public JTextField nombre;
    public JTextField cedula;
    public JTextField email;
    public JTextField direccion;
    public JTextField fijo;
    public JTextField movil;
    public JComboBox comboBoxEstatus, comboBoxEmpresas, comboBoxEstados;

    public ContactoUI(String accion) {

        this.setTitle( accion + "Contacto");
        
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(panel, BorderLayout.NORTH);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[]{0, 0, 0};
        gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);

        JLabel lblNombre = new JLabel("Nombre");
        GridBagConstraints gbc_lblNombre = new GridBagConstraints();
        gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
        gbc_lblNombre.anchor = GridBagConstraints.EAST;
        gbc_lblNombre.gridx = 0;
        gbc_lblNombre.gridy = 0;
        panel.add(lblNombre, gbc_lblNombre);

        nombre = new JTextField();
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.insets = new Insets(0, 0, 5, 0);
        gbc_textField.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField.gridx = 1;
        gbc_textField.gridy = 0;
        panel.add(nombre, gbc_textField);
        nombre.setColumns(10);

        JLabel lblCedula = new JLabel("Cedula");
        GridBagConstraints gbc_lblCedula = new GridBagConstraints();
        gbc_lblCedula.anchor = GridBagConstraints.EAST;
        gbc_lblCedula.insets = new Insets(0, 0, 5, 5);
        gbc_lblCedula.gridx = 0;
        gbc_lblCedula.gridy = 1;
        panel.add(lblCedula, gbc_lblCedula);

        cedula = new JTextField();
        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
        gbc_textField_1.insets = new Insets(0, 0, 5, 0);
        gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_1.gridx = 1;
        gbc_textField_1.gridy = 1;
        panel.add(cedula, gbc_textField_1);
        cedula.setColumns(10);

        JLabel lblEmail = new JLabel("E-mail");
        GridBagConstraints gbc_lblEmail = new GridBagConstraints();
        gbc_lblEmail.anchor = GridBagConstraints.EAST;
        gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
        gbc_lblEmail.gridx = 0;
        gbc_lblEmail.gridy = 2;
        panel.add(lblEmail, gbc_lblEmail);

        email = new JTextField();
        GridBagConstraints gbc_textField_2 = new GridBagConstraints();
        gbc_textField_2.insets = new Insets(0, 0, 5, 0);
        gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_2.gridx = 1;
        gbc_textField_2.gridy = 2;
        panel.add(email, gbc_textField_2);
        email.setColumns(10);

        JLabel lblNewLabel = new JLabel("Direccion");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 3;
        panel.add(lblNewLabel, gbc_lblNewLabel);

        direccion = new JTextField();
        GridBagConstraints gbc_textField_3 = new GridBagConstraints();
        gbc_textField_3.insets = new Insets(0, 0, 5, 0);
        gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_3.gridx = 1;
        gbc_textField_3.gridy = 3;
        panel.add(direccion, gbc_textField_3);
        direccion.setColumns(10);

        JLabel lblTelefono = new JLabel("Telefono");
        GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
        gbc_lblTelefono.anchor = GridBagConstraints.EAST;
        gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
        gbc_lblTelefono.gridx = 0;
        gbc_lblTelefono.gridy = 4;
        panel.add(lblTelefono, gbc_lblTelefono);

        fijo = new JTextField();
        GridBagConstraints gbc_textField_4 = new GridBagConstraints();
        gbc_textField_4.insets = new Insets(0, 0, 5, 0);
        gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_4.gridx = 1;
        gbc_textField_4.gridy = 4;
        panel.add(fijo, gbc_textField_4);
        fijo.setColumns(10);

        JLabel lblMovil = new JLabel("Movil");
        GridBagConstraints gbc_lblMovil = new GridBagConstraints();
        gbc_lblMovil.anchor = GridBagConstraints.EAST;
        gbc_lblMovil.insets = new Insets(0, 0, 5, 5);
        gbc_lblMovil.gridx = 0;
        gbc_lblMovil.gridy = 5;
        panel.add(lblMovil, gbc_lblMovil);

        movil = new JTextField();
        GridBagConstraints gbc_textField_5 = new GridBagConstraints();
        gbc_textField_5.insets = new Insets(0, 0, 5, 0);
        gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_5.gridx = 1;
        gbc_textField_5.gridy = 5;
        panel.add(movil, gbc_textField_5);
        movil.setColumns(10);

        JLabel lblEstatus = new JLabel("Estatus");
        GridBagConstraints gbc_lblEstatus = new GridBagConstraints();
        gbc_lblEstatus.anchor = GridBagConstraints.EAST;
        gbc_lblEstatus.insets = new Insets(0, 0, 5, 5);
        gbc_lblEstatus.gridx = 0;
        gbc_lblEstatus.gridy = 6;
        panel.add(lblEstatus, gbc_lblEstatus);

        String[] estatus = {"Activo","Inactivo","Desconocido"};
        comboBoxEstatus = new JComboBox(estatus);
        GridBagConstraints gbc_comboBox = new GridBagConstraints();
        gbc_comboBox.insets = new Insets(0, 0, 5, 0);
        gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox.gridx = 1;
        gbc_comboBox.gridy = 6;
        panel.add(comboBoxEstatus, gbc_comboBox);

        JLabel lblEstado = new JLabel("Estado");
        GridBagConstraints gbc_lblEstado = new GridBagConstraints();
        gbc_lblEstado.anchor = GridBagConstraints.EAST;
        gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
        gbc_lblEstado.gridx = 0;
        gbc_lblEstado.gridy = 7;
        panel.add(lblEstado, gbc_lblEstado);

        comboBoxEstados = new JComboBox();
        GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
        gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
        gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox_1.gridx = 1;
        gbc_comboBox_1.gridy = 7;
        panel.add(comboBoxEstados, gbc_comboBox_1);

        JLabel lblEmpresa = new JLabel("Empresa");
        GridBagConstraints gbc_lblEmpresa = new GridBagConstraints();
        gbc_lblEmpresa.anchor = GridBagConstraints.EAST;
        gbc_lblEmpresa.insets = new Insets(0, 0, 0, 5);
        gbc_lblEmpresa.gridx = 0;
        gbc_lblEmpresa.gridy = 8;
        panel.add(lblEmpresa, gbc_lblEmpresa);

        comboBoxEmpresas = new JComboBox();
        GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
        gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox_2.gridx = 1;
        gbc_comboBox_2.gridy = 8;
        panel.add(comboBoxEmpresas, gbc_comboBox_2);

        JPanel panel_1 = new JPanel();
        getContentPane().add(panel_1, BorderLayout.SOUTH);

        JButton btnAccion = new JButton(accion);
        panel_1.add(btnAccion);
        
        if(accion=="Actualizar"){
            nombre.setText("nombre del contacto a actualizar");
            cedula.setText("cedula");
            email.setText("email");
            direccion.setText("direccion");
            fijo.setText("fijo");
            movil.setText("movil");
        }
        
        setAlwaysOnTop(true);
        setLocationRelativeTo(InterfazMaestraUI.center);
        setSize(240,350);
        setVisible(true);
        setResizable(false);
        
    }

}
