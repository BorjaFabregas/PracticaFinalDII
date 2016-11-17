/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;


import com.np.dam2.dii.grupo2.modelo.dao.crud.IPresupuestoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.PresupuestoDTO;
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
public class PresupuestoDAO implements IPresupuestoDAO {

    @Override
    public void guardar(PresupuestoDTO presupuesto) {
        File f = new File("ficheros/Presupuestos.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(presupuesto.getIdPresupuesto() + "-" + presupuesto.getRifEmpresaPresupuesto() + "-" + presupuesto.getFecha().toString() + "-" + presupuesto.getStatus() + "-" + presupuesto.getPresupuesto());
        } catch (IOException ex) {
            Logger.getLogger(PresupuestoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public PresupuestoDTO leer(String idPresupuesto) {
        File f = new File("ficheros/Presupuestos.txt");
        String linea = "";
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        PresupuestoDTO presupuesto = new PresupuestoDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idPresupuesto != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idPresupuesto)) {
                    presupuesto.setIdPresupuesto(idPresupuesto);
                    presupuesto.setRifEmpresaPresupuesto(atributos[1]);
                    presupuesto.setFecha(formatoFecha.parse(atributos[2]));
                    presupuesto.setStatus(atributos[3]);
                    presupuesto.setPresupuesto((atributos[4]));
                    presupuesto.setIdEmpresaFK(atributos[5]);
                    esEncontrado = true;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PresupuestoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return presupuesto;
    }

    @Override
    public void borrar(String idPresupuesto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(PresupuestoDTO presupuesto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PresupuestoDTO> listar() {
               LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/Presupuestos.txt");
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
            Logger.getLogger(PresupuestoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PresupuestoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IndexOutOfBoundsException ioobe){
            ioobe.printStackTrace();
        } 

        lista = new LinkedList<PresupuestoDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
