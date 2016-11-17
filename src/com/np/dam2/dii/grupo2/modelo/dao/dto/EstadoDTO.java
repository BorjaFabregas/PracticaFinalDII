/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao.dto;

/**
 *
 * @author Fabregas
 */
public class EstadoDTO {

    private String idEstado;
    private String idPaisFK;
    private String nombre;

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdPaisFK() {
        return idPaisFK;
    }

    public void setIdPaisFK(String idPaisFK) {
        this.idPaisFK = idPaisFK;
    }
    
    

}
