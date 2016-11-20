/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IContactoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.ContactoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.util.Utilidades;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grupo 2
 */
public class ContactoDAO implements IContactoDAO {

    @Override
    public void guardar(ContactoDTO contacto) {
        File f = new File("ficheros/Contactos.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {

            //Obtencion ultimo id y autoincremento
            int id = 1;
            String str;
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                while ((str = br.readLine()) != null) {
                    id++;
                }
                br.close();
            }

            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(id + "-" + contacto.getCedula() + "-" + contacto.getNombre() + "-" + contacto.getEmail() + "-" + contacto.getDireccion() + "-" + contacto.getTelefono() + "-" + contacto.getMovil() + "-" + contacto.getStatus() + "-" + contacto.getIdEmpresaFK() + "-" + contacto.getIdEstadoFK() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(AuditoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }

    @Override
    public ContactoDTO leer(String idContacto) {
        File f = new File("ficheros/Contactos.txt");
        String linea = "";
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        ContactoDTO contacto = new ContactoDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idContacto != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idContacto)) {
                    contacto.setIdPContactos(idContacto);
                    contacto.setCedula(atributos[1]);
                    contacto.setNombre(atributos[2]);
                    contacto.setEmail(atributos[3]);
                    contacto.setDireccion((atributos[4]));
                    contacto.setTelefono(Integer.parseInt(atributos[5]));
                    contacto.setMovil(Integer.parseInt(atributos[6]));
                    contacto.setStatus(atributos[7]);
                    contacto.setIdEstadoFK(atributos[8]);
                    contacto.setIdEmpresaFK(atributos[9]);

                    esEncontrado = true;
                }

                linea.substring(0, linea.charAt(linea.indexOf("-")));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return contacto;
    }

    @Override
    public void borrar(String idContacto) {
        Utilidades u = new Utilidades(new File("ficheros/contactos.txt"));
        u.eliminar(idContacto);
    }

    @Override
    public void actualizar(ContactoDTO contacto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ContactoDTO> listar() {
        LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/Contactos.txt");
        FileReader fr = null;
        BufferedReader br = null;
        int i;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            linea = br.readLine();

            while (linea != null) {
                numLineas++;
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ContactoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ContactoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IndexOutOfBoundsException ioobe) {
            ioobe.printStackTrace();
        }

        lista = new LinkedList<ContactoDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
