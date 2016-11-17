/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.EmpresaDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IEmpresaDAO {

    public void guardar(EmpresaDTO empresa);

    public EmpresaDTO leer(String idEmpresa);

    public void borrar(String idEmpresa);

    public void actualizar(EmpresaDTO empresa);

    public List<EmpresaDTO> listar();
}
