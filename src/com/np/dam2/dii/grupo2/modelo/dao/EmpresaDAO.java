/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IEmpresaDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EmpresaDTO;
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
 * @author Fabregas
 */
public class EmpresaDAO implements IEmpresaDAO {

    @Override
    public void guardar(EmpresaDTO empresa) {
        File f = new File("ficheros/Empresas.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            
            //Obtencion ultimo id y autoincremento
            int id = 1;
            String str;
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {                
                while((str=br.readLine())!=null){
                    id++;
                }
                br.close();
            }
            
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(id + "-" + empresa.getRifEmpresa() + "-" + empresa.getEmail() + "-" + empresa.getDireccion() + "-"  + empresa.getMovil() + "-" + empresa.getStatus()+"\n");
        } catch (IOException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
    public EmpresaDTO leer(String idEmpresa) {
        File f = new File("ficheros/Empresas.txt");
        String linea = "";
        boolean esEncontrado=false;
        FileReader fr = null;
        BufferedReader br = null;
        EmpresaDTO empresa = new EmpresaDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idEmpresa != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idEmpresa)) {
                    empresa.setIdEmpresa(idEmpresa);
                    empresa.setRifEmpresa(atributos[1]);
                    empresa.setEmail(atributos[2]);
                    empresa.setDireccion(atributos[3]);
                    empresa.setMovil((atributos[4]));
                    empresa.setStatus(atributos[5]);
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
        return empresa;
    }

    @Override
    public void borrar(String idEmpresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(EmpresaDTO empresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EmpresaDTO> listar() {
           LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/Empresas.txt");
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
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IndexOutOfBoundsException ioobe){
            ioobe.printStackTrace();
        } 

        lista = new LinkedList<EmpresaDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
