/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.PresupuestoEquipoDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IPresupuestoEquipoDAO {

    public void guardar(PresupuestoEquipoDTO pEquipo);

    public PresupuestoEquipoDTO leer(String idPresupuestoEquipo);

    public void borrar(String idPresupuestoEquipo);

    public void actualizar(PresupuestoEquipoDTO pEquipo);

    public List<PresupuestoEquipoDTO> listar();
}
