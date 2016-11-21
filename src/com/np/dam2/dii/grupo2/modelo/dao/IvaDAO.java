/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IIvaDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.IvaDTO;
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
public class IvaDAO implements IIvaDAO {

    @Override
    public void guardar(IvaDTO iva) {
        File f = new File("Ivas.txt");
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
            bw.write(id + "-" + iva.getPorcentajeIva() + "-" + iva.getStatus() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(IvaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public IvaDTO leer(String idIva) {
        File f = new File("ficheros/Ivas.txt");
        String linea = "";
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        IvaDTO iva = new IvaDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idIva != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idIva)) {
                    iva.setIdIva(idIva);
                    iva.setPorcentajeIva(Float.parseFloat(atributos[1]));
                    iva.setStatus(atributos[2]);
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
        return iva;
    }

    @Override
    public void borrar(String idIva) {
        Utilidades u = new Utilidades(new File("ficheros/Ivas.txt"));
        u.eliminar(idIva);
    }

    @Override
    public void actualizar(IvaDTO iva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IvaDTO> listar() {
        LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/Ivas.txt");
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
            Logger.getLogger(IvaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IvaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IndexOutOfBoundsException ioobe) {
            ioobe.printStackTrace();
        }

        lista = new LinkedList<IvaDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
