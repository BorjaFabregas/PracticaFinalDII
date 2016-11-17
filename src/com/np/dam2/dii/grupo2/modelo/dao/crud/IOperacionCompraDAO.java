/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.OperacionCompraDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IOperacionCompraDAO {

    public void guardar(OperacionCompraDTO operacion);

    public OperacionCompraDTO leer(String idOperacionCompra);

    public void borrar(String idOperacionCOmpra);

    public void actualizar(OperacionCompraDTO iva);

    public List<OperacionCompraDTO> listar();
}
