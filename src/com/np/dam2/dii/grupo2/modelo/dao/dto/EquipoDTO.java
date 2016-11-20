package com.np.dam2.dii.grupo2.modelo.dao.dto;


public class EquipoDTO {

    private String idEquipo;

    private String nombre;

    private String descripcion;

    private String sistemaOperativo;

    private int cantidad;

    private float precio;

    private String status;
    
    private String idEmpresaFK;
    
    private String idSistemaOperativoFK;

    @Override
    public String toString() {
        return "ID Equipo: " + idEquipo
                +"\nNombre: " + nombre
                +"\nDescripcion: " + descripcion
                +"\nSistema Operativo: " + sistemaOperativo
                +"\nCantidad: " + cantidad
                +"\nPrecio: " + precio + "€"
                +"\nEstatus: " + status;
    }

    
    
    public EquipoDTO() {
    }

    /**
     * @return the idEquipo
     */
    public String getIdEquipo() {
        return idEquipo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the sistemaOperativo
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param idEquipo the idEquipo to set
     */
    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param sistemaOperativo the sistemaOperativo to set
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdEmpresaFK() {
        return idEmpresaFK;
    }

    public String getIdSistemaOperativoFK() {
        return idSistemaOperativoFK;
    }

    public void setIdEmpresaFK(String idEmpresaFK) {
        this.idEmpresaFK = idEmpresaFK;
    }

    public void setIdSistemaOperativoFK(String idSistemaOperativoFK) {
        this.idSistemaOperativoFK = idSistemaOperativoFK;
    }
    
}
