package com.np.dam2.dii.grupo2.modelo.dao.dto;


import java.util.Date;

public class RecepcionDTO {

    private String idRecepcion;
    private String personaRecepcion;
    private String modeloEquipo;
    private Date fechaRecepcion;
    private int cantidadProducRecepcion;
    private String status;  
    private String idSistemaOperativoFK;
    private String idEmpresaFK;    
    private String idEquipoFK;

    @Override
    public String toString() {
        return idEmpresaFK;//Terminar de Implementar JCarlos o Sergio
    }
    
    

    public RecepcionDTO() {
    }

    /**
     * @return the idRecepcion
     */
    public String getIdRecepcion() {
        return idRecepcion;
    }

    /**
     * @return the personaRecepcion
     */
    public String getPersonaRecepcion() {
        return personaRecepcion;
    }

    /**
     * @return the modeloEquipo
     */
    public String getModeloEquipo() {
        return modeloEquipo;
    }

    /**
     * @return the fechaRecepcion
     */
    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * @return the cantidadProducRecepcion
     */
    public int getCantidadProducRecepcion() {
        return cantidadProducRecepcion;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param idRecepcion the idRecepcion to set
     */
    public void setIdRecepcion(String idRecepcion) {
        this.idRecepcion = idRecepcion;
    }

    /**
     * @param personaRecepcion the personaRecepcion to set
     */
    public void setPersonaRecepcion(String personaRecepcion) {
        this.personaRecepcion = personaRecepcion;
    }

    /**
     * @param modeloEquipo the modeloEquipo to set
     */
    public void setModeloEquipo(String modeloEquipo) {
        this.modeloEquipo = modeloEquipo;
    }

    /**
     * @param fechaRecepcion the fechaRecepcion to set
     */
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * @param cantidadProducRecepcion the cantidadProducRecepcion to set
     */
    public void setCantidadProducRecepcion(int cantidadProducRecepcion) {
        this.cantidadProducRecepcion = cantidadProducRecepcion;
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

    public String getIdEquipoFK() {
        return idEquipoFK;
    }

    public String getIdSistemaOperativoFK() {
        return idSistemaOperativoFK;
    }

    public void setIdEmpresaFK(String idEmpresaFK) {
        this.idEmpresaFK = idEmpresaFK;
    }

    public void setIdEquipoFK(String idEquipoFK) {
        this.idEquipoFK = idEquipoFK;
    }

    public void setIdSistemaOperativoFK(String idSistemaOperativoFK) {
        this.idSistemaOperativoFK = idSistemaOperativoFK;
    }
    
    
}
