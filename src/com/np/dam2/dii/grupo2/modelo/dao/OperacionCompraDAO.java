/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IOperacionCompraDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.OperacionCompraDTO;
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
public class OperacionCompraDAO implements IOperacionCompraDAO{

    @Override
    public void guardar(OperacionCompraDTO operacion) {
         File f = new File("ficheros/OperacionesCompra.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(operacion.getIdOpCompra()+ "-" + operacion.getNumeroOpCompra()+"-"+operacion.getStatus()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(OperacionCompraDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public OperacionCompraDTO leer(String idOperacionCompra) {
 File f = new File("ficheros/OperacionesCompras.txt");
        String linea = "";
        boolean esEncontrado=false;
        FileReader fr = null;
        BufferedReader br = null;
        OperacionCompraDTO oCompra = new OperacionCompraDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idOperacionCompra != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idOperacionCompra)) {
                    oCompra.setIdOpCompra(idOperacionCompra);               
                    oCompra.setNumeroOpCompra(Integer.parseInt(atributos[1]));
                    oCompra.setStatus(atributos[2]);
                    oCompra.setIdPresupuestoFK(atributos[3]);
                    
                    esEncontrado=true;
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
        return oCompra;
    }

    @Override
    public void borrar(String idOperacionCOmpra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(OperacionCompraDTO iva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OperacionCompraDTO> listar() {
                LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/OperacionesCompras.txt");
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
            Logger.getLogger(OperacionCompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OperacionCompraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IndexOutOfBoundsException ioobe){
            ioobe.printStackTrace();
        } 

        lista = new LinkedList<OperacionCompraDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
