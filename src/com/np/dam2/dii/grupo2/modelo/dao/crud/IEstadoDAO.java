package com.np.dam2.dii.grupo2.modelo.dao.crud;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.np.dam2.dii.grupo2.modelo.dao.dto.EstadoDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IEstadoDAO {

    public void guardar(EstadoDTO estado);

    public EstadoDTO leer(String idEstado);

    public void borrar(String idEstado);

    public void actualizar(EstadoDTO estado);

    public List<EstadoDTO> listar();
}
