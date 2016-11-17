/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.ISistemaOperativoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.SistemaOperativoDTO;
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
public class SistemaOperativoDAO implements ISistemaOperativoDAO {

    @Override
    public void guardar(SistemaOperativoDTO sistema) {
        File f = new File("ficheros/SistemasOperativos.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(sistema.getIdSO() + "-" + sistema.getNombre() + "-" + sistema.getPrecio() + "-" + sistema.getStatus());
        } catch (IOException ex) {
            Logger.getLogger(SistemaOperativoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public SistemaOperativoDTO leer(String idSistema) {
        File f = new File("ficheros/SistemasOperativos.txt");
        String linea = "";
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        SistemaOperativoDTO sistema = new SistemaOperativoDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idSistema != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idSistema)) {
                    sistema.setIdSO(idSistema);
                    sistema.setNombre(atributos[1]);
                    sistema.setPrecio(Float.parseFloat(atributos[2]));
                    sistema.setStatus(atributos[3]);

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
        return sistema;
    }

    @Override
    public void borrar(String idSistema) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(SistemaOperativoDTO sistemaOperativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SistemaOperativoDTO> listar() {
              LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/SistemasOperativos.txt");
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
            Logger.getLogger(SistemaOperativoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SistemaOperativoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IndexOutOfBoundsException ioobe){
            ioobe.printStackTrace();
        } 

        lista = new LinkedList<SistemaOperativoDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
