/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.PaisDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IPaisDAO {

    public void guardar(PaisDTO pais);

    public PaisDTO leer(String idPais);

    public void borrar(String idPais);

    public void actualizar(PaisDTO pais);

    public List<PaisDTO> listar();
}
