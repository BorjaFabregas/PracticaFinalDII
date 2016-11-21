/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IRecepcionDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.RecepcionDTO;
import com.np.dam2.dii.grupo2.modelo.dao.util.Utilidades;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grupo 2
 */
public class RecepcionDAO implements IRecepcionDAO {

    @Override
    public void guardar(RecepcionDTO recepcion) {
        File f = new File("ficheros/Recepciones.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(recepcion.getIdRecepcion() + "-" + recepcion.getPersonaRecepcion() + "-" + recepcion.getModeloEquipo() + "-" + recepcion.getFechaRecepcion().toString() + "-" + recepcion.getCantidadProducRecepcion() + "-" + recepcion.getStatus()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public RecepcionDTO leer(String idRecepcion) {
        File f = new File("ficheros/Recepciones.txt");
        String linea = "";
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        RecepcionDTO recepcion = new RecepcionDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idRecepcion != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idRecepcion)) {
                    recepcion.setIdRecepcion(idRecepcion);
                    recepcion.setPersonaRecepcion(atributos[1]);               
                    recepcion.setModeloEquipo(atributos[2]);
                    recepcion.setFechaRecepcion(formatoFecha.parse(atributos[3]));
                    recepcion.setCantidadProducRecepcion(Integer.parseInt(atributos[4]));
                    recepcion.setStatus(atributos[5]);
                    recepcion.setIdSistemaOperativoFK(atributos[6]);
                    recepcion.setIdEmpresaFK(atributos[7]);                  
                    recepcion.setIdEquipoFK(atributos[8]);
                    esEncontrado = true;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return recepcion;
    }

    @Override
    public void borrar(String idRecepcion) {
         Utilidades u = new Utilidades(new File("ficheros/Recepciones.txt"));
        u.eliminar(idRecepcion);
    }

    @Override
    public void actualizar(RecepcionDTO recepcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RecepcionDTO> listar() {
            LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/Recepciones.txt");
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
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RecepcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IndexOutOfBoundsException ioobe){
            ioobe.printStackTrace();
        } 

        lista = new LinkedList<RecepcionDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
