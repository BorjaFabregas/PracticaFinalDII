/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IPresupuestoEquipoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.PresupuestoEquipoDTO;
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
public class PresupuestoEquipoDAO implements IPresupuestoEquipoDAO {

    @Override
    public void guardar(PresupuestoEquipoDTO pEquipo) {
        File f = new File("ficheros/PresupuestosEquipos.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(pEquipo.getIdPresupuestosEquipos() + "-" + pEquipo.getCantidadPresupMod() + "-" + pEquipo.getTotal() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(PresupuestoEquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public PresupuestoEquipoDTO leer(String idPresupuestoEquipo) {
        File f = new File("ficheros/PresupuestosEquipos.txt");
        String linea = "";
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        PresupuestoEquipoDTO pEquipo = new PresupuestoEquipoDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idPresupuestoEquipo != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idPresupuestoEquipo)) {
                    pEquipo.setIdPresupuestosEquipos(idPresupuestoEquipo);
                    pEquipo.setCantidadPresupMod(Integer.parseInt(atributos[1]));
                    pEquipo.setTotal(Integer.parseInt(atributos[2]));
                    pEquipo.setIdPresupuestoFK(atributos[3]);
                    pEquipo.setIdEmpresaFK(atributos[4]);
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
        return pEquipo;
    }

    @Override
    public void borrar(String idPresupuestoEquipo) {
        Utilidades u = new Utilidades(new File("ficheros/PresupuestosEquipos.txt"));
        u.eliminar(idPresupuestoEquipo);
    }

    @Override
    public void actualizar(PresupuestoEquipoDTO pEquipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PresupuestoEquipoDTO> listar() {
        LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/PresupuestoEquipos.txt");
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
            Logger.getLogger(PresupuestoEquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PresupuestoEquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IndexOutOfBoundsException ioobe) {
            ioobe.printStackTrace();
        }

        lista = new LinkedList<PresupuestoEquipoDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
