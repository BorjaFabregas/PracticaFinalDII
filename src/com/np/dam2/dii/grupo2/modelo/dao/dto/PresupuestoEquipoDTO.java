package com.np.dam2.dii.grupo2.modelo.dao.dto;


public class PresupuestoEquipoDTO {

    private String idPresupuestosEquipos;

    private int cantidadPresupMod;

    private int total;
    
    private String idPresupuestoFK;
    
    private String idEmpresaFK;

    public PresupuestoEquipoDTO() {
    }

    /**
     * @return the idPresupuestosEquipos
     */
    public String getIdPresupuestosEquipos() {
        return idPresupuestosEquipos;
    }

    /**
     * @return the cantidadPresupMod
     */
    public int getCantidadPresupMod() {
        return cantidadPresupMod;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param idPresupuestosEquipos the idPresupuestosEquipos to set
     */
    public void setIdPresupuestosEquipos(String idPresupuestosEquipos) {
        this.idPresupuestosEquipos = idPresupuestosEquipos;
    }

    /**
     * @param cantidadPresupMod the cantidadPresupMod to set
     */
    public void setCantidadPresupMod(int cantidadPresupMod) {
        this.cantidadPresupMod = cantidadPresupMod;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    public String getIdEmpresaFK() {
        return idEmpresaFK;
    }

    public String getIdPresupuestoFK() {
        return idPresupuestoFK;
    }

    public void setIdEmpresaFK(String idEmpresaFK) {
        this.idEmpresaFK = idEmpresaFK;
    }

    public void setIdPresupuestoFK(String idPresupuestoFK) {
        this.idPresupuestoFK = idPresupuestoFK;
    }

    
    
}
