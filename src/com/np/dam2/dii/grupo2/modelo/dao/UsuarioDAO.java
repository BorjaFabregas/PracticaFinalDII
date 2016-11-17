package com.np.dam2.dii.grupo2.modelo.dao;

import com.np.dam2.dii.grupo2.modelo.dao.crud.IUsuarioDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.UsuarioDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Fabregas
 */
public class UsuarioDAO implements IUsuarioDAO {

    @Override
    public void guardar(UsuarioDTO user) {

        File f;
        FileOutputStream fos;
        ObjectOutputStream ous;
        FileInputStream fis;
        ObjectInputStream ois;
        LinkedList<UsuarioDTO> usuarios;

        try {
            f = new File("ficheros/Usuarios.dat");

            if (f.exists()) {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                usuarios = (LinkedList<UsuarioDTO>) ois.readObject();
                usuarios.add(user);
                ois.close();
                fis.close();
                fos = new FileOutputStream(f);
                ous = new ObjectOutputStream(fos);
                ous.writeObject(usuarios);
                ous.close();
                fos.close();
            } else {
                fos = new FileOutputStream(f);
                ous = new ObjectOutputStream(fos);
                usuarios = new LinkedList<>();
                usuarios.add(user);
                ous.writeObject(usuarios);
                ous.close();
                fos.close();
            }
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }

    }

    @Override
    public UsuarioDTO leer(String idUsuario) {
        File f;
        FileInputStream fis;
        ObjectInputStream ois;
        LinkedList<UsuarioDTO> usuarios = null;
        int i = 0;
        f = new File("ficheros/Usuarios.dat");
        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            UsuarioDTO aux = new UsuarioDTO();
            aux.setIdUsuario(idUsuario);

            usuarios = (LinkedList<UsuarioDTO>) ois.readObject();
            while (aux.getIdUsuario() != usuarios.get(i).getIdUsuario() && usuarios.size() < i) {
                if (aux.getIdUsuario().equals(usuarios.get(i).getIdUsuario())) {
                    return usuarios.get(i);
                } else {
                    i++;
                }
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (ClassNotFoundException cnf) {
            cnf.printStackTrace();
        }//NO PUEDE DEVOLVER NULL
        return usuarios.get(i);
    }

    @Override
    public void borrar(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(UsuarioDTO user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UsuarioDTO> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
