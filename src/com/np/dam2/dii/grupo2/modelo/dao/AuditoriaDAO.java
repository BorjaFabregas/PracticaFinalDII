/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IAuditoriaDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.AuditoriaDTO;
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
public class AuditoriaDAO implements IAuditoriaDAO {

    @Override
    public void guardar(AuditoriaDTO auditoria) {
        File f = new File("ficheros/Auditorias.txt");
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
            bw.write(id + "-" + auditoria.getDescripcion() + "-" + auditoria.getFecha().toString() + "-" + auditoria.getHora() + "-" + auditoria.getUsuario()+"\n");
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
    public AuditoriaDTO leer(String idAuditoria) {
        File f = new File("ficheros/Auditorias.txt");
        String linea = "";
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm");
        boolean esEncontrado = false;
        FileReader fr = null;
        BufferedReader br = null;
        AuditoriaDTO auditoria = new AuditoriaDTO();
        String[] atributos;
        String id = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while (linea != null && idAuditoria != id && !esEncontrado) {
                linea = br.readLine();
                atributos = linea.split("-");
                id = atributos[0];
                if (atributos[0].equalsIgnoreCase(idAuditoria)) {
                    auditoria.setIdAuditoria(idAuditoria);
                    auditoria.setDescripcion(atributos[1]);
                    auditoria.setFecha(formatoFecha.parse(atributos[2]));
                    auditoria.setHora(formatoHora.parse(atributos[3]));
                    auditoria.setUsuario((atributos[4]));
                    esEncontrado = true;
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AuditoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException np) {
            np.printStackTrace();
        }finally {
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return auditoria;
    }

    @Override
    public void borrar(String idAuditoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(AuditoriaDTO auditoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AuditoriaDTO> listar() {
        LinkedList lista;
        int numLineas = 0;
        String linea = "";
        File f = new File("ficheros/Auditorias.txt");
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
            Logger.getLogger(AuditoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AuditoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IndexOutOfBoundsException ioobe){
            ioobe.printStackTrace();
        } 

        lista = new LinkedList<AuditoriaDTO>();
        for (i = 1; i < numLineas; i++) {
            lista.add(this.leer(String.valueOf(i)));
        }

        return lista;
    }
}
