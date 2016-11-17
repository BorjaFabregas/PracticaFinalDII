/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.PresupuestoDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IPresupuestoDAO {

    public void guardar(PresupuestoDTO presupuesto);

    public PresupuestoDTO leer(String idPresupuesto);

    public void borrar(String idPresupuesto);

    public void actualizar(PresupuestoDTO presupuesto);

    public List<PresupuestoDTO> listar();

}
