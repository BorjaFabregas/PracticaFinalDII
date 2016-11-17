/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.RecepcionDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IRecepcionDAO {

    public void guardar(RecepcionDTO recepcion);

    public RecepcionDTO leer(String idRecepcion);

    public void borrar(String idRecepcion);

    public void actualizar(RecepcionDTO recepcion);

    public List<RecepcionDTO> listar();

}
