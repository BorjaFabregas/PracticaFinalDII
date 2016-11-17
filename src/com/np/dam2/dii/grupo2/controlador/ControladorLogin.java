/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.UsuarioDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.UsuarioDTO;
import com.np.dam2.dii.grupo2.vista.LoginUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabregas
 */
public class ControladorLogin implements ActionListener{

    LoginUI login = new LoginUI();
    UsuarioDTO dto;
    UsuarioDAO dao;
    public static String nombreUsuario;

    public ControladorLogin() {
         
        dto = new UsuarioDTO();//Usar Factorias
        dao = new UsuarioDAO();//Usar Factorias
        login.getBtnIniciarSesion().addActionListener(this);
        login.getBtnRegistro().addActionListener(this);
        
        login.getTextFieldPass().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyChar()){
                    case '\n':
                    String usuario = login.getTextFieldUsuario().getText().toString();
                String pass = login.getTextFieldPass().getText().toString();
                
                dto.setIdUsuario(usuario);
                dto.setUsuario(usuario);
                dto.setPass(pass);
                UsuarioDTO u = dao.leer(dto.getIdUsuario());
                if(u.getUsuario().equals(dto.getUsuario())&&u.getPass().equals(dto.getPass())){
                    JOptionPane.showMessageDialog(login, "Bienvenido " + dto.getUsuario());
                    login.dispose();
                    //Se lanzaría la siguiente interfaz
                    nombreUsuario = dto.getIdUsuario();
                    ControladorInterfazMaestra cim = new ControladorInterfazMaestra();
                }else{
                    JOptionPane.showMessageDialog(login, "Usuario o contraseña incorrectos");
                }
                    
                        break;
                }
            }
            
        });
       
    }
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando = e.getActionCommand();
        
        switch(comando){
            case "Iniciar Sesion":
                String usuario = login.getTextFieldUsuario().getText().toString();
                String pass = login.getTextFieldPass().getText().toString();
                
                dto.setIdUsuario(usuario);
                dto.setUsuario(usuario);
                dto.setPass(pass);
                UsuarioDTO u = dao.leer(dto.getIdUsuario());
                if(u.getUsuario().equals(dto.getUsuario())&&u.getPass().equals(dto.getPass())){
                    JOptionPane.showMessageDialog(login, "Bienvenido " + dto.getUsuario());
                    login.dispose();
                    //Se lanzaría la siguiente interfaz
                    nombreUsuario = dto.getIdUsuario();
                    ControladorInterfazMaestra cim = new ControladorInterfazMaestra();
                }else{
                    JOptionPane.showMessageDialog(login, "Usuario o contraseña incorrectos");
                }
                
                break;
            case "Registro":
                login.dispose();
                ControladorRegistro cr = new ControladorRegistro();
                break;
        }
        
    }
    
}
