/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.vista;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author Fabregas
 */
public class AuditoriaUI extends JFrame{
    
    public JTextField textField;
    public JButton accion;

    public AuditoriaUI(String parametro, String accion) {
        
             
        setTitle(accion + " Auditoria");

        JPanel north = new JPanel();
        north.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        GridBagLayout gbl_north = new GridBagLayout();
        gbl_north.columnWidths = new int[]{0, 189, 0};
        gbl_north.rowHeights = new int[]{0, 0};
        gbl_north.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        gbl_north.rowWeights = new double[]{0.0, Double.MIN_VALUE};
        north.setLayout(gbl_north);

        JLabel nombre = new JLabel(parametro);
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

        this.accion = new JButton(accion);
        south.add(this.accion);
        
        setLocationRelativeTo(null);
        setSize(256,90);
        setVisible(true);
        setResizable(false);
        
    }
    
    
    
}
