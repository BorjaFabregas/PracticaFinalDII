/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.ContactoDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IContactoDAO {

    public void guardar(ContactoDTO contacto);

    public ContactoDTO leer(String idContacto);

    public void borrar(String idContacto);

    public void actualizar(ContactoDTO contacto);

    public List<ContactoDTO> listar();
}
