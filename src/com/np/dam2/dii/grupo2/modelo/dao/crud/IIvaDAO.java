/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.crud;

import com.np.dam2.dii.grupo2.modelo.dao.dto.IvaDTO;
import java.util.List;

/**
 *
 * @author Grupo 2
 */
public interface IIvaDAO {

    public void guardar(IvaDTO iva);

    public IvaDTO leer(String idIva);

    public void borrar(String idIva);

    public void actualizar(IvaDTO iva);

    public List<IvaDTO> listar();

}
