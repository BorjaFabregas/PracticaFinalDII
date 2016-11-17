/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.UsuarioDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IUsuarioDAO{
    
    public void guardar(UsuarioDTO user);
    public UsuarioDTO leer(String idUsuario);
    public void borrar(String idUsuario);
    public void actualizar(UsuarioDTO user);
    public List<UsuarioDTO> listar();
   
    
}
