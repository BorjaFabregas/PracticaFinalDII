package com.np.dam2.dii.grupo2.modelo.dao.dto;


public class SistemaOperativoDTO {

    private String idSO;

    private String nombre;

    private float precio;

    private String status;

    public SistemaOperativoDTO() {
    }

    /**
     * @return the idSO
     */
    public String getIdSO() {
        return idSO;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
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
     * @param idSO the idSO to set
     */
    public void setIdSO(String idSO) {
        this.idSO = idSO;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

}
