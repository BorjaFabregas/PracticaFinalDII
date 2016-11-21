package com.np.dam2.dii.grupo2.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author JoseCarlos
 */
public class PresupuestoUI extends JFrame{
	public JTextField textField;
	public JTextField textField_1;
	public JComboBox comboBox,comboBox_1;
	public JButton btnGuardar;
	private String[] status={"Activo","Inactivo","Desconocido"};
	private String[] empresas={"1","2","3","4","5","6","7","8"};
	public PresupuestoUI() {

		setTitle("Nuevo Presupuesto");	
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblPresupuesto = new JLabel("Presupuesto");
		GridBagConstraints gbc_lblPresupuesto = new GridBagConstraints();
		gbc_lblPresupuesto.anchor = GridBagConstraints.EAST;
		gbc_lblPresupuesto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPresupuesto.gridx = 0;
		gbc_lblPresupuesto.gridy = 0;
		panel.add(lblPresupuesto, gbc_lblPresupuesto);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 0;
		gbc_lblFecha.gridy = 1;
		panel.add(lblFecha, gbc_lblFecha);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEstatus = new JLabel("Estatus");
		GridBagConstraints gbc_lblEstatus = new GridBagConstraints();
		gbc_lblEstatus.anchor = GridBagConstraints.EAST;
		gbc_lblEstatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstatus.gridx = 0;
		gbc_lblEstatus.gridy = 2;
		panel.add(lblEstatus, gbc_lblEstatus);
		
		comboBox = new JComboBox(status);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		GridBagConstraints gbc_lblEmpresa = new GridBagConstraints();
		gbc_lblEmpresa.anchor = GridBagConstraints.EAST;
		gbc_lblEmpresa.insets = new Insets(0, 0, 0, 5);
		gbc_lblEmpresa.gridx = 0;
		gbc_lblEmpresa.gridy = 3;
		panel.add(lblEmpresa, gbc_lblEmpresa);
		
		comboBox_1 = new JComboBox(empresas);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 3;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		btnGuardar = new JButton("Guardar");
		panel_1.add(btnGuardar);
                setSize(292,190);
                setVisible(true);
                setResizable(false);
                setLocationRelativeTo(InterfazMaestraUI.center);
	}
    
}