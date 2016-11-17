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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginUI extends JFrame {

    private JPanel north;
    private JPanel center;
    private JPanel south;
    private JLabel labelUsuario;
    private JTextField textFieldUsuario;
    private JLabel labelPass;
    private JPasswordField passField;
    private JButton btnIniciarSesion;
    private JLabel lblnoTienesCuenta;
    private JButton btnRegistro;

    public LoginUI() {

        setTitle("Inicio de Sesion");

        north = new JPanel();
        north.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        GridBagLayout gbl_north = new GridBagLayout();
        gbl_north.columnWidths = new int[]{0, 0, 0};
        gbl_north.rowHeights = new int[]{0, 0, 0};
        gbl_north.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gbl_north.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        north.setLayout(gbl_north);

        labelUsuario = new JLabel("Usuario");
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

        labelPass = new JLabel("Contraseña");
        GridBagConstraints gbc_labelPass = new GridBagConstraints();
        gbc_labelPass.anchor = GridBagConstraints.EAST;
        gbc_labelPass.insets = new Insets(0, 0, 0, 5);
        gbc_labelPass.gridx = 0;
        gbc_labelPass.gridy = 1;
        north.add(labelPass, gbc_labelPass);

        passField = new JPasswordField();
        GridBagConstraints gbc_textFieldPass = new GridBagConstraints();
        gbc_textFieldPass.fill = GridBagConstraints.HORIZONTAL;
        gbc_textFieldPass.gridx = 1;
        gbc_textFieldPass.gridy = 1;
        north.add(passField, gbc_textFieldPass);
        passField.setColumns(10);

        

        center = new JPanel();
        getContentPane().add(center, BorderLayout.CENTER);

        btnIniciarSesion = new JButton("Iniciar Sesion");

        center.add(btnIniciarSesion);

        south = new JPanel();
        getContentPane().add(south, BorderLayout.SOUTH);

        lblnoTienesCuenta = new JLabel("¿No tienes Cuenta?");
        south.add(lblnoTienesCuenta);

        btnRegistro = new JButton("Registro");
        south.add(btnRegistro);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(275, 160);
        this.setResizable(false);
        this.setVisible(true);

    }

    /**
     * @return the textFieldUsuario
     */
    public JTextField getTextFieldUsuario() {
        return textFieldUsuario;
    }

    /**
     * @return the passField
     */
    public JTextField getTextFieldPass() {
        return passField;
    }

    /**
     * @return the btnIniciarSesion
     */
    public JButton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    /**
     * @return the btnRegistro
     */
    public JButton getBtnRegistro() {
        return btnRegistro;
    }

    /**
     * @param textFieldUsuario the textFieldUsuario to set
     */
    public void setTextFieldUsuario(JTextField textFieldUsuario) {
        this.textFieldUsuario = textFieldUsuario;
    }

    /**
     * @param passField the passField to set
     */
    public void setPassField(JPasswordField passField) {
        this.passField = passField;
    }

    /**
     * @param btnIniciarSesion the btnIniciarSesion to set
     */
    public void setBtnIniciarSesion(JButton btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    /**
     * @param btnRegistro the btnRegistro to set
     */
    public void setBtnRegistro(JButton btnRegistro) {
        this.btnRegistro = btnRegistro;
    }

}
