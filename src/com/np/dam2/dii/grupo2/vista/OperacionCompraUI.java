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
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author JoseCarlos
 */
public class OperacionCompraUI extends JFrame {

    public JTextField textoNumeroCompras;
    public JButton btnGuardar;
    public JComboBox comboStatus, comboPresupuestoFK;

    public OperacionCompraUI() {
        setTitle("Nueva Compra");

        JPanel north = new JPanel();
        north.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        GridBagLayout gbl_north = new GridBagLayout();
        gbl_north.columnWidths = new int[]{0, 0, 0};
        gbl_north.rowHeights = new int[]{0, 0, 0, 0};
        gbl_north.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_north.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        north.setLayout(gbl_north);

        JLabel numeroCompras = new JLabel("Numero de Compra");
        GridBagConstraints gbc_numeroCompras = new GridBagConstraints();
        gbc_numeroCompras.anchor = GridBagConstraints.EAST;
        gbc_numeroCompras.insets = new Insets(0, 0, 5, 5);
        gbc_numeroCompras.gridx = 0;
        gbc_numeroCompras.gridy = 0;
        north.add(numeroCompras, gbc_numeroCompras);

        textoNumeroCompras = new JTextField();
        GridBagConstraints gbc_textoNumeroCompras = new GridBagConstraints();
        gbc_textoNumeroCompras.anchor = GridBagConstraints.NORTH;
        gbc_textoNumeroCompras.insets = new Insets(0, 0, 5, 0);
        gbc_textoNumeroCompras.fill = GridBagConstraints.HORIZONTAL;
        gbc_textoNumeroCompras.gridx = 1;
        gbc_textoNumeroCompras.gridy = 0;
        north.add(textoNumeroCompras, gbc_textoNumeroCompras);
        textoNumeroCompras.setColumns(10);

        JLabel status = new JLabel("Status");
        GridBagConstraints gbc_status = new GridBagConstraints();
        gbc_status.anchor = GridBagConstraints.EAST;
        gbc_status.insets = new Insets(0, 0, 5, 5);
        gbc_status.gridx = 0;
        gbc_status.gridy = 1;
        north.add(status, gbc_status);

        comboStatus = new JComboBox();
        comboStatus.setModel(new DefaultComboBoxModel(new String[]{"Activo", "Inactivo", "Desconocido"}));
        GridBagConstraints gbc_comboStatus = new GridBagConstraints();
        gbc_comboStatus.insets = new Insets(0, 0, 5, 0);
        gbc_comboStatus.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboStatus.gridx = 1;
        gbc_comboStatus.gridy = 1;
        north.add(comboStatus, gbc_comboStatus);

        JLabel presupuestoFK = new JLabel("Presupuesto Asociado");
        GridBagConstraints gbc_presupuestoFK = new GridBagConstraints();
        gbc_presupuestoFK.anchor = GridBagConstraints.EAST;
        gbc_presupuestoFK.insets = new Insets(0, 0, 0, 5);
        gbc_presupuestoFK.gridx = 0;
        gbc_presupuestoFK.gridy = 2;
        north.add(presupuestoFK, gbc_presupuestoFK);

        comboPresupuestoFK = new JComboBox();
        comboPresupuestoFK.setModel(new DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8"}));
        GridBagConstraints gbc_comboPresupuestoFK = new GridBagConstraints();
        gbc_comboPresupuestoFK.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboPresupuestoFK.gridx = 1;
        gbc_comboPresupuestoFK.gridy = 2;
        north.add(comboPresupuestoFK, gbc_comboPresupuestoFK);

        JPanel south = new JPanel();
        getContentPane().add(south, BorderLayout.SOUTH);

        btnGuardar = new JButton("Guardar");
        south.add(btnGuardar);
        setVisible(true);
        setResizable(false);
        setSize(252, 151);
        setLocationRelativeTo(InterfazMaestraUI.center);
    }

}
