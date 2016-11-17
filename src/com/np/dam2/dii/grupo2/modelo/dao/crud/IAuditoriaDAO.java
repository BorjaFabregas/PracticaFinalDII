/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.AuditoriaDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IAuditoriaDAO {

    public void guardar(AuditoriaDTO auditoria);

    public AuditoriaDTO leer(String auditoria);

    public void borrar(String idAuditoria);

    public void actualizar(AuditoriaDTO auditoria);

    public List<AuditoriaDTO> listar();
}
