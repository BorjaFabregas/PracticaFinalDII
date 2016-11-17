/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.SistemaOperativoDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface ISistemaOperativoDAO {

    public void guardar(SistemaOperativoDTO sistema);

    public SistemaOperativoDTO leer(String idSistema);

    public void borrar(String idSistema);

    public void actualizar(SistemaOperativoDTO sistemaOperativo);

    public List<SistemaOperativoDTO> listar();

}
