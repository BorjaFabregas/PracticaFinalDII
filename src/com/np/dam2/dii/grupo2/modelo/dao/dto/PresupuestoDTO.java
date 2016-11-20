package com.np.dam2.dii.grupo2.modelo.dao.dto;


import java.util.Date;

public class PresupuestoDTO {

    private String idPresupuesto;

    private String rifEmpresaPresupuesto;

    private Date fecha;

    private String status;

    private String presupuesto;
    
    private String idEmpresaFK;

    @Override
    public String toString() {
        return "ID Presupuesto: " + idPresupuesto
                +"\nFecha: " + fecha.toString()
                +"\nEstatus: " + status
                +"\nPresupuesto: " + presupuesto + "€"
                +"\nID Empresa Asociada: " + idEmpresaFK;
    }

    
    
    public PresupuestoDTO() {
    }

    /**
     * @return the idPresupuesto
     */
    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    /**
     * @return the rifEmpresaPresupuesto
     */
    public String getRifEmpresaPresupuesto() {
        return rifEmpresaPresupuesto;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the presupuesto
     */
    public String getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param idPresupuesto the idPresupuesto to set
     */
    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    /**
     * @param rifEmpresaPresupuesto the rifEmpresaPresupuesto to set
     */
    public void setRifEmpresaPresupuesto(String rifEmpresaPresupuesto) {
        this.rifEmpresaPresupuesto = rifEmpresaPresupuesto;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getIdEmpresaFK() {
        return idEmpresaFK;
    }

    public void setIdEmpresaFK(String idEmpresaFK) {
        this.idEmpresaFK = idEmpresaFK;
    }
    
    
}
