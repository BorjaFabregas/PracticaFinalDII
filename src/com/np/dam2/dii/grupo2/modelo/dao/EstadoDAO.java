/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IEstadoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EstadoDTO;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 2
 */
public class EstadoDAO implements IEstadoDAO {

    @Override
    public void guardar(EstadoDTO estado) {
        File f = new File("ficheros/Estados.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        boolean hayFK = false;

        try {
            //Buscar el pais asociado
            FileReader fr = new FileReader(new File("ficheros/Paises.txt"));
            BufferedReader br = new BufferedReader(fr);
            int idFK = 1;
            while (br.readLine() != null) {
                if (idFK == Integer.parseInt(estado.getIdPaisFK())) {
                    hayFK = true;
                }
                idFK++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (hayFK) {
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
                bw.write(id + "-" + estado.getNombre() + "-" + estado.getIdPaisFK()+"\n");
            } catch (IOException ex) {
                Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
        } else {            
            JOptionPane.showMessageDialog(new JOptionPane(), "El Estado que intentas guardar\n no esta asociado a ningun Pais");            
        }
    }


    @Override
    public EstadoDTO leer(String idEstado) {
        File f = new File("ficheros/Estados.txt");
        String linea = "";
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        EstadoDTO estado = new EstadoDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idEstado != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idEstado)) {
                    estado.setIdEstado(idEstado);         
                    estado.setNombre(atributos[1]);                   
                    estado.setIdPaisFK(atributos[2]);                  
                    esEncontrado = true;
                }
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
        return estado;
    }

    @Override
    public void borrar(String idEstado) {
         Utilidades u = new Utilidades(new File("ficheros/Estados.txt"));
        u.eliminar(idEstado);
    }

    @Override
    public void actualizar(EstadoDTO estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public List<EstadoDTO> listar() {
            LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/Estados.txt");
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
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IndexOutOfBoundsException ioobe){
            ioobe.printStackTrace();
        } 

        lista = new LinkedList<EstadoDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
