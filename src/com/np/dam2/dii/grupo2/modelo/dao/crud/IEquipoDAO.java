/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.EquipoDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IEquipoDAO {

    public void guardar(EquipoDTO equipo);

    public EquipoDTO leer(String idEquipo);

    public void borrar(String idEquipo);

    public void actualizar(EquipoDTO iva);

    public List<EquipoDTO> listar();
}
