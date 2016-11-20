package com.np.dam2.dii.grupo2.modelo.dao.dto;

public class ContactoDTO {

    private String idPContactos;

    private String cedula;

    private String nombre;

    private String email;

    private String direccion;

    private int telefono;

    private int movil;

    private String status;

    private String idEstadoFK;

    private String idEmpresaFK;

    private String rifEmpresaFK;

    @Override
    public String toString() {
        return "ID Contacto: " + idPContactos
                + "\nNombre: " + nombre
                + "\nCedula: " + cedula
                + "\nE-mail: " + email
                + "\nDireccion: " + direccion
                + "\nFijo: " + telefono
                + "\nMovil: " + movil
                + "\nEstatus: " + status
                + "\nEstado asociado: " + idEstadoFK
                + "\nEmpresa asociada: " + idEmpresaFK;

    }

    public ContactoDTO() {
    }

    /**
     * @return the idPContactos
     */
    public String getIdPContactos() {
        return idPContactos;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
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
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @return the movil
     */
    public int getMovil() {
        return movil;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param idPContactos the idPContactos to set
     */
    public void setIdPContactos(String idPContactos) {
        this.idPContactos = idPContactos;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @param movil the movil to set
     */
    public void setMovil(int movil) {
        this.movil = movil;
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

    public String getIdEstadoFK() {
        return idEstadoFK;
    }

    public String getRifEmpresaFK() {
        return rifEmpresaFK;
    }

    public void setIdEmpresaFK(String idEmpresaFK) {
        this.idEmpresaFK = idEmpresaFK;
    }

    public void setIdEstadoFK(String idEstadoFK) {
        this.idEstadoFK = idEstadoFK;
    }

    public void setRifEmpresaFK(String rifEmpresaFK) {
        this.rifEmpresaFK = rifEmpresaFK;
    }

    /*@Override
    public String toString() {
        return idPContactos + "-" + cedula + todos los atributos excepto las FK;
    }*/
}
