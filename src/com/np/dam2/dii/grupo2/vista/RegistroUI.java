package com.np.dam2.dii.grupo2.vista;

/**
 *
 * @author Grupo 2
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class RegistroUI extends JFrame {

    private JTextField textFieldUsuario;
    private JTextField textFieldPass;
    private JTextField textFieldPassConfirm;
    private JButton btnCrearCuenta;

    public RegistroUI() {

        setTitle("Registro");
        
        JPanel north = new JPanel();
        north.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        GridBagLayout gbl_north = new GridBagLayout();
        gbl_north.columnWidths = new int[]{0, 0, 0};
        gbl_north.rowHeights = new int[]{0, 0, 0, 0};
        gbl_north.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_north.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        north.setLayout(gbl_north);

        JLabel labelUsuario = new JLabel("Usuario");
        GridBagConstraints gbc_labelUsuario = new GridBagConstraints();
        gbc_labelUsuario.insets = new Insets(0, 0, 5, 5);
        gbc_labelUsuario.anchor = GridBagConstraints.EAST;
        gbc_labelUsuario.gridx = 0;
        gbc_labelUsuario.gridy = 0;
        north.add(labelUsuario, gbc_labelUsuario);

        textFieldUsuario = new JTextField();
        GridBagConstraints gbc_textFieldUsuario = new GridBagConstraints();
        gbc_textFieldUsuario.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldUsuario.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldUsuario.gridx = 1;
        gbc_textFieldUsuario.gridy = 0;
        north.add(textFieldUsuario, gbc_textFieldUsuario);
        textFieldUsuario.setColumns(10);

        JLabel labelPass = new JLabel("Contraseña");
        GridBagConstraints gbc_labelPass = new GridBagConstraints();
        gbc_labelPass.anchor = GridBagConstraints.EAST;
        gbc_labelPass.insets = new Insets(0, 0, 5, 5);
        gbc_labelPass.gridx = 0;
        gbc_labelPass.gridy = 1;
        north.add(labelPass, gbc_labelPass);

        textFieldPass = new JTextField();
        GridBagConstraints gbc_textFieldPass = new GridBagConstraints();
        gbc_textFieldPass.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldPass.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldPass.gridx = 1;
        gbc_textFieldPass.gridy = 1;
        north.add(textFieldPass, gbc_textFieldPass);
        textFieldPass.setColumns(10);

        JLabel labelPassConfirm = new JLabel("Contraseña");
        GridBagConstraints gbc_labelPassConfirm = new GridBagConstraints();
        gbc_labelPassConfirm.anchor = GridBagConstraints.EAST;
        gbc_labelPassConfirm.insets = new Insets(0, 0, 0, 5);
        gbc_labelPassConfirm.gridx = 0;
        gbc_labelPassConfirm.gridy = 2;
        north.add(labelPassConfirm, gbc_labelPassConfirm);

        textFieldPassConfirm = new JTextField();
        GridBagConstraints gbc_textFieldPassConfirm = new GridBagConstraints();
        gbc_textFieldPassConfirm.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldPassConfirm.gridx = 1;
        gbc_textFieldPassConfirm.gridy = 2;
        north.add(textFieldPassConfirm, gbc_textFieldPassConfirm);
        textFieldPassConfirm.setColumns(10);

        JPanel south = new JPanel();
        south.setBorder(new EmptyBorder(0, 0, 0, 0));
        getContentPane().add(south, BorderLayout.SOUTH);

        btnCrearCuenta = new JButton("Crear Cuenta");
        south.add(btnCrearCuenta);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(275, 160);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

    /**
     * @return the btnCrearCuenta
     */
    public JButton getBtnCrearCuenta() {
        return btnCrearCuenta;
    }

    public JTextField getTextFieldUsuario() {
        return textFieldUsuario;
    }

    public JTextField getTextFieldPass() {
        return textFieldPass;
    }

    public JTextField getTextFieldPassConfirm() {
        return textFieldPassConfirm;
    }

}
