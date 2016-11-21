/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IEquipoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EquipoDTO;
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
public class EquipoDAO implements IEquipoDAO {

    @Override
    public void guardar(EquipoDTO equipo) {
        File f = new File("ficheros/Equipos.txt");
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
            bw.write(id + "-" + equipo.getNombre() + "-" + equipo.getDescripcion() + "-" + equipo.getSistemaOperativo() + "-" + equipo.getCantidad() + "-" + equipo.getPrecio() + "-" + equipo.getStatus() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public EquipoDTO leer(String idEquipo) {
        File f = new File("ficheros/Equipos.txt");
        String linea = "";
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        EquipoDTO equipo = new EquipoDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idEquipo != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idEquipo)) {
                    equipo.setIdEquipo(idEquipo);
                    equipo.setNombre(atributos[1]);
                    equipo.setDescripcion(atributos[2]);
                    equipo.setSistemaOperativo(atributos[3]);
                    equipo.setCantidad(Integer.parseInt(atributos[4]));
                    equipo.setPrecio(Float.parseFloat(atributos[5]));
                    equipo.setStatus(atributos[6]);
                    equipo.setIdEmpresaFK(atributos[7]);

                    equipo.setIdSistemaOperativoFK(atributos[8]);

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
        return equipo;
    }

    @Override
    public void borrar(String idEquipo) {
        Utilidades u = new Utilidades(new File("ficheros/Equipos.txt"));
        u.eliminar(idEquipo);
    }

    @Override
    public void actualizar(EquipoDTO iva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EquipoDTO> listar() {
        LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/Equipos.txt");
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
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IndexOutOfBoundsException ioobe) {
            ioobe.printStackTrace();
        }

        lista = new LinkedList<EquipoDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
