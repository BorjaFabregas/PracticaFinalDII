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
public class PaisDTO {

    private String idPais;
    private String nombre;

    @Override
    public String toString() {
        return "ID Pais: " + idPais
                + "\nNombre: " + nombre;
    }

    
    
    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
