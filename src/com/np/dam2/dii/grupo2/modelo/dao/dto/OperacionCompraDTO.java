package com.np.dam2.dii.grupo2.modelo.dao.dto;


public class OperacionCompraDTO {

    private String idOpCompra;

    private int numeroOpCompra;

    private String status;
    
    private String idPresupuestoFK;

    public OperacionCompraDTO() {
    }

    /**
     * @return the idOpCompra
     */
    public String getIdOpCompra() {
        return idOpCompra;
    }

    /**
     * @return the numeroOpCompra
     */
    public int getNumeroOpCompra() {
        return numeroOpCompra;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param idOpCompra the idOpCompra to set
     */
    public void setIdOpCompra(String idOpCompra) {
        this.idOpCompra = idOpCompra;
    }

    /**
     * @param numeroOpCompra the numeroOpCompra to set
     */
    public void setNumeroOpCompra(int numeroOpCompra) {
        this.numeroOpCompra = numeroOpCompra;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdPresupuestoFK() {
        return idPresupuestoFK;
    }

    public void setIdPresupuestoFK(String idPresupuestoFK) {
        this.idPresupuestoFK = idPresupuestoFK;
    }
    
    

}
