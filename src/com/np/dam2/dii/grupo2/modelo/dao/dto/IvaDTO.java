package com.np.dam2.dii.grupo2.modelo.dao.dto;


public class IvaDTO {

    private String idIva;

    private float porcentajeIva;

    private String status;

    public IvaDTO() {
    }

    /**
     * @return the idIva
     */
    public String getIdIva() {
        return idIva;
    }

    /**
     * @return the porcentajeIva
     */
    public float getPorcentajeIva() {
        return porcentajeIva;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param idIva the idIva to set
     */
    public void setIdIva(String idIva) {
        this.idIva = idIva;
    }

    /**
     * @param porcentajeIva the porcentajeIva to set
     */
    public void setPorcentajeIva(float porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
