package com.np.dam2.dii.grupo2.modelo.dao.dto;

public class EmpresaDTO {

    private String idEmpresa;

    private String rifEmpresa;

    private String email;

    private String direccion;

    private String movil;

    private String status;
    
    public String toString(boolean actualizar){
        return idEmpresa+"-"+rifEmpresa+"-"+email+"-"+direccion+"-"+movil+"-"+status;
    }

    public EmpresaDTO() {
    }

    /**
     * @return the idEmpresa
     */
    public String getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @return the rifEmpresa
     */
    public String getRifEmpresa() {
        return rifEmpresa;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return the movil
     */
    public String getMovil() {
        return movil;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @param rifEmpresa the rifEmpresa to set
     */
    public void setRifEmpresa(String rifEmpresa) {
        this.rifEmpresa = rifEmpresa;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @param movil the movil to set
     */
    public void setMovil(String movil) {
        this.movil = movil;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID Empresa: " + idEmpresa 
                + "\nEmail: " + email 
                + "\nDireccion: " + direccion 
                + "\nTelefono: " + movil 
                + "\nEstatus: " + status;
    }
    
    

}
