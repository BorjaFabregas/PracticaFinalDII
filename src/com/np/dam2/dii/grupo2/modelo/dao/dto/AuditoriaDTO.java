package com.np.dam2.dii.grupo2.modelo.dao.dto;


import java.util.Date;

public class AuditoriaDTO {

    private String idAuditoria;

    private String descripcion;

    private Date fecha;

    private Date hora;

    private String usuario;

    public AuditoriaDTO() {
    }

    /**
     * @return the idAuditoria
     */
    public String getIdAuditoria() {
        return idAuditoria;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @return the hora
     */
    public Date getHora() {
        return hora;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param idAuditoria the idAuditoria to set
     */
    public void setIdAuditoria(String idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
