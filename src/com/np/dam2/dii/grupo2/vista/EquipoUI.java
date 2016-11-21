/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author JoseCarlos
 */
public class EquipoUI extends JFrame {

    public JTextField textoNombre;
    public JTextField textoDescripcion;
    public JTextField textoSistemaOperativo;
    public JTextField textoCantidad;
    public JTextField textoPrecio;
    public JComboBox comboStatus, comboEmpresaFK, comboSOAsociado;
    public JButton btnGuardar;

    public EquipoUI() {
        setTitle("Nuevo Equipo");

        JPanel north = new JPanel();
        north.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        GridBagLayout gbl_north = new GridBagLayout();
        gbl_north.columnWidths = new int[]{0, 0, 0};
        gbl_north.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_north.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_north.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        north.setLayout(gbl_north);

        JLabel nombre = new JLabel("Nombre");
        GridBagConstraints gbc_nombre = new GridBagConstraints();
        gbc_nombre.insets = new Insets(0, 0, 5, 5);
        gbc_nombre.anchor = GridBagConstraints.EAST;
        gbc_nombre.gridx = 0;
        gbc_nombre.gridy = 0;
        north.add(nombre, gbc_nombre);

        textoNombre = new JTextField();
        GridBagConstraints gbc_textoNombre = new GridBagConstraints();
        gbc_textoNombre.insets = new Insets(0, 0, 5, 0);
        gbc_textoNombre.fill = GridBagConstraints.BOTH;
        gbc_textoNombre.gridx = 1;
        gbc_textoNombre.gridy = 0;
        north.add(textoNombre, gbc_textoNombre);
        textoNombre.setColumns(10);

        JLabel descripcion = new JLabel("Descripcion");
        GridBagConstraints gbc_descripcion = new GridBagConstraints();
        gbc_descripcion.anchor = GridBagConstraints.EAST;
        gbc_descripcion.insets = new Insets(0, 0, 5, 5);
        gbc_descripcion.gridx = 0;
        gbc_descripcion.gridy = 1;
        north.add(descripcion, gbc_descripcion);

        textoDescripcion = new JTextField();
        GridBagConstraints gbc_textoDescripcion = new GridBagConstraints();
        gbc_textoDescripcion.insets = new Insets(0, 0, 5, 0);
        gbc_textoDescripcion.fill = GridBagConstraints.HORIZONTAL;
        gbc_textoDescripcion.gridx = 1;
        gbc_textoDescripcion.gridy = 1;
        north.add(textoDescripcion, gbc_textoDescripcion);
        textoDescripcion.setColumns(10);

        JLabel sistemaOperativo = new JLabel("Sistema Operativo");
        GridBagConstraints gbc_sistemaOperativo = new GridBagConstraints();
        gbc_sistemaOperativo.anchor = GridBagConstraints.EAST;
        gbc_sistemaOperativo.insets = new Insets(0, 0, 5, 5);
        gbc_sistemaOperativo.gridx = 0;
        gbc_sistemaOperativo.gridy = 2;
        north.add(sistemaOperativo, gbc_sistemaOperativo);

        textoSistemaOperativo = new JTextField();
        GridBagConstraints gbc_textoSistemaOperativo = new GridBagConstraints();
        gbc_textoSistemaOperativo.insets = new Insets(0, 0, 5, 0);
        gbc_textoSistemaOperativo.anchor = GridBagConstraints.NORTH;
        gbc_textoSistemaOperativo.fill = GridBagConstraints.HORIZONTAL;
        gbc_textoSistemaOperativo.gridx = 1;
        gbc_textoSistemaOperativo.gridy = 2;
        north.add(textoSistemaOperativo, gbc_textoSistemaOperativo);
        textoSistemaOperativo.setColumns(10);

        JLabel cantidad = new JLabel("Cantidad");
        GridBagConstraints gbc_cantidad = new GridBagConstraints();
        gbc_cantidad.anchor = GridBagConstraints.EAST;
        gbc_cantidad.insets = new Insets(0, 0, 5, 5);
        gbc_cantidad.gridx = 0;
        gbc_cantidad.gridy = 3;
        north.add(cantidad, gbc_cantidad);

        textoCantidad = new JTextField();
        GridBagConstraints gbc_textoCantidad = new GridBagConstraints();
        gbc_textoCantidad.insets = new Insets(0, 0, 5, 0);
        gbc_textoCantidad.anchor = GridBagConstraints.NORTH;
        gbc_textoCantidad.fill = GridBagConstraints.HORIZONTAL;
        gbc_textoCantidad.gridx = 1;
        gbc_textoCantidad.gridy = 3;
        north.add(textoCantidad, gbc_textoCantidad);
        textoCantidad.setColumns(10);

        JLabel precio = new JLabel("Precio");
        GridBagConstraints gbc_precio = new GridBagConstraints();
        gbc_precio.anchor = GridBagConstraints.EAST;
        gbc_precio.insets = new Insets(0, 0, 5, 5);
        gbc_precio.gridx = 0;
        gbc_precio.gridy = 4;
        north.add(precio, gbc_precio);

        textoPrecio = new JTextField();
        GridBagConstraints gbc_textoPrecio = new GridBagConstraints();
        gbc_textoPrecio.insets = new Insets(0, 0, 5, 0);
        gbc_textoPrecio.fill = GridBagConstraints.HORIZONTAL;
        gbc_textoPrecio.gridx = 1;
        gbc_textoPrecio.gridy = 4;
        north.add(textoPrecio, gbc_textoPrecio);
        textoPrecio.setColumns(10);

        JLabel status = new JLabel("Status");
        GridBagConstraints gbc_status = new GridBagConstraints();
        gbc_status.anchor = GridBagConstraints.EAST;
        gbc_status.insets = new Insets(0, 0, 5, 5);
        gbc_status.gridx = 0;
        gbc_status.gridy = 5;
        north.add(status, gbc_status);

        comboStatus = new JComboBox();
        comboStatus.setModel(new DefaultComboBoxModel(new String[]{"Activo", "Inactivo", "Desconocido"}));
        GridBagConstraints gbc_comboStatus = new GridBagConstraints();
        gbc_comboStatus.insets = new Insets(0, 0, 5, 0);
        gbc_comboStatus.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboStatus.gridx = 1;
        gbc_comboStatus.gridy = 5;
        north.add(comboStatus, gbc_comboStatus);

        JLabel empresaFK = new JLabel("Empresa Asociada");
        GridBagConstraints gbc_empresaFK = new GridBagConstraints();
        gbc_empresaFK.anchor = GridBagConstraints.EAST;
        gbc_empresaFK.insets = new Insets(0, 0, 5, 5);
        gbc_empresaFK.gridx = 0;
        gbc_empresaFK.gridy = 6;
        north.add(empresaFK, gbc_empresaFK);

        comboEmpresaFK = new JComboBox();
        comboEmpresaFK.setModel(new DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6"}));
        GridBagConstraints gbc_comboEmpresaFK = new GridBagConstraints();
        gbc_comboEmpresaFK.insets = new Insets(0, 0, 5, 0);
        gbc_comboEmpresaFK.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboEmpresaFK.gridx = 1;
        gbc_comboEmpresaFK.gridy = 6;
        north.add(comboEmpresaFK, gbc_comboEmpresaFK);

        JLabel SOAsociado = new JLabel("S.O. Asociado");
        GridBagConstraints gbc_SOAsociado = new GridBagConstraints();
        gbc_SOAsociado.anchor = GridBagConstraints.EAST;
        gbc_SOAsociado.insets = new Insets(0, 0, 0, 5);
        gbc_SOAsociado.gridx = 0;
        gbc_SOAsociado.gridy = 7;
        north.add(SOAsociado, gbc_SOAsociado);

        comboSOAsociado = new JComboBox();
        comboSOAsociado.setModel(new DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6"}));
        GridBagConstraints gbc_comboSOAsociado = new GridBagConstraints();
        gbc_comboSOAsociado.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboSOAsociado.gridx = 1;
        gbc_comboSOAsociado.gridy = 7;
        north.add(comboSOAsociado, gbc_comboSOAsociado);

        JPanel south = new JPanel();
        getContentPane().add(south, BorderLayout.SOUTH);

        btnGuardar = new JButton("Guardar");
        south.add(btnGuardar);
        setVisible(true);
        setResizable(false);
        setSize(275, 315);
        setLocationRelativeTo(InterfazMaestraUI.center);

    }

}
