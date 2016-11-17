/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Fabregas
 */
public class EmpresaUI extends JFrame {

    private JTextField cif;
    private JTextField email;
    private JTextField direccion;
    private JTextField telefono;
    public JButton guardar;
    private JComboBox comboBox;

    public EmpresaUI() {
        setTitle("Empresa");

        JPanel north = new JPanel();
        north.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        GridBagLayout gbl_north = new GridBagLayout();
        gbl_north.columnWidths = new int[]{0, 0, 0};
        gbl_north.rowHeights = new int[]{0, 0, 0, 0, 0};
        gbl_north.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_north.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        north.setLayout(gbl_north);

        JLabel lblCIF = new JLabel("CIF");
        GridBagConstraints gbc_lblCIF = new GridBagConstraints();
        gbc_lblCIF.insets = new Insets(0, 0, 5, 5);
        gbc_lblCIF.anchor = GridBagConstraints.EAST;
        gbc_lblCIF.gridx = 0;
        gbc_lblCIF.gridy = 0;
        north.add(lblCIF, gbc_lblCIF);

        cif = new JTextField();
        GridBagConstraints gbc_cif = new GridBagConstraints();
        gbc_cif.insets = new Insets(0, 0, 5, 0);
        gbc_cif.fill = GridBagConstraints.HORIZONTAL;
        gbc_cif.gridx = 1;
        gbc_cif.gridy = 0;
        north.add(cif, gbc_cif);
        cif.setColumns(10);

        JLabel lblEmail = new JLabel("E-mail");
        GridBagConstraints gbc_lblEmail = new GridBagConstraints();
        gbc_lblEmail.anchor = GridBagConstraints.EAST;
        gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
        gbc_lblEmail.gridx = 0;
        gbc_lblEmail.gridy = 1;
        north.add(lblEmail, gbc_lblEmail);

        email = new JTextField();
        GridBagConstraints gbc_email = new GridBagConstraints();
        gbc_email.insets = new Insets(0, 0, 5, 0);
        gbc_email.fill = GridBagConstraints.HORIZONTAL;
        gbc_email.gridx = 1;
        gbc_email.gridy = 1;
        north.add(email, gbc_email);
        email.setColumns(10);

        JLabel lblDireccion = new JLabel("Direccion");
        GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
        gbc_lblDireccion.anchor = GridBagConstraints.EAST;
        gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
        gbc_lblDireccion.gridx = 0;
        gbc_lblDireccion.gridy = 2;
        north.add(lblDireccion, gbc_lblDireccion);

        direccion = new JTextField();
        GridBagConstraints gbc_direccion = new GridBagConstraints();
        gbc_direccion.insets = new Insets(0, 0, 5, 0);
        gbc_direccion.fill = GridBagConstraints.HORIZONTAL;
        gbc_direccion.gridx = 1;
        gbc_direccion.gridy = 2;
        north.add(direccion, gbc_direccion);
        direccion.setColumns(10);

        JLabel lblTelefono = new JLabel("Telefono");
        GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
        gbc_lblTelefono.anchor = GridBagConstraints.EAST;
        gbc_lblTelefono.insets = new Insets(0, 0, 0, 5);
        gbc_lblTelefono.gridx = 0;
        gbc_lblTelefono.gridy = 3;
        north.add(lblTelefono, gbc_lblTelefono);

        telefono = new JTextField();
        GridBagConstraints gbc_telefono = new GridBagConstraints();
        gbc_telefono.anchor = GridBagConstraints.NORTH;
        gbc_telefono.fill = GridBagConstraints.HORIZONTAL;
        gbc_telefono.gridx = 1;
        gbc_telefono.gridy = 3;
        north.add(telefono, gbc_telefono);
        telefono.setColumns(10);

        JPanel center = new JPanel();
        getContentPane().add(center, BorderLayout.CENTER);

        JLabel lblEstatus = new JLabel("Estatus");
        center.add(lblEstatus);

        String[] status = {"Activo", "Inactivo", "Desconocido"};
        comboBox = new JComboBox(status);
        center.add(comboBox);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.SOUTH);

        guardar = new JButton("Guardar");
        guardar.setActionCommand("guardar");
        panel.add(guardar);
        
        setAlwaysOnTop(true);
        setLocationRelativeTo(InterfazMaestraUI.center);
        setSize(240,225);
        setVisible(true);
        setResizable(false);
        
        
    }

    /**
     * @return the cif
     */
    public JTextField getCif() {
        return cif;
    }

    /**
     * @return the email
     */
    public JTextField getEmail() {
        return email;
    }

    /**
     * @return the direccion
     */
    public JTextField getDireccion() {
        return direccion;
    }

    /**
     * @return the telefono
     */
    public JTextField getTelefono() {
        return telefono;
    }

    /**
     * @return the comboBox
     */
    public JComboBox getComboBox() {
        return comboBox;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(JTextField cif) {
        this.cif = cif;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(JTextField email) {
        this.email = email;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(JTextField direccion) {
        this.direccion = direccion;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(JTextField telefono) {
        this.telefono = telefono;
    }

    
    
}
