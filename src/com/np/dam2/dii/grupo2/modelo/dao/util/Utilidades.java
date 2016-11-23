package com.np.dam2.dii.grupo2.modelo.dao.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Utilidades {

    public static File fichero;

    public Utilidades(File f) {
        fichero = f;
    }

    public static String[] read(String id) {
        String[] registro = null;

        FileReader fr;
        BufferedReader br;

        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            String linea;
            linea = br.readLine();

            int i = 0;
            String pkRegistro = "";

            while (linea != null && linea.length() > 0 && !pkRegistro.equals(id)) {
                //Si la linea contiene la PK que queremos eliminar NO se guarda
                while (linea.charAt(i) != '-' && linea.length() > 1) {
                    pkRegistro = pkRegistro + linea.charAt(i);
                    i++;
                }
                i = 0;
                pkRegistro = "";
                linea = br.readLine();
            }
            if (linea != null) {
                registro = linea.split("-");
            }
        } catch (SecurityException se) {
            System.out.println("No tiene permisos para crear el fichero \"" + fichero.getPath() + "\"");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error I/O");
        }
        return registro;
    }

    public static String[] readLine(int line) {
        String[] registro = null;

        FileReader fr;
        BufferedReader br;

        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            String linea;
            linea = br.readLine();
            int cont = 1;
            while (linea != null && cont != line) {
                linea = br.readLine();
                cont++;
            }
            if (linea != null) {
                registro = linea.split("-");
            }
        } catch (SecurityException se) {
            System.out.println("No tiene permisos para crear el fichero \"" + fichero.getPath() + "\"");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error I/O");
        }
        return registro;
    }

    public void escribir(String registro) {

        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(fichero, true);
            pw = new PrintWriter(fw);

            pw.println(registro);
            //System.out.println("Operacion a񡤩da");

            pw.close();
            fw.close();

        } catch (SecurityException se) {
            System.out.println("No tiene permisos para acceder al fichero  \"" + fichero.getPath() + "\"");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
            fnfe.printStackTrace(System.out);
        } catch (IOException e) {
            System.out.println("Error I/O");
            e.printStackTrace(System.out);
        }
    }

    public void actualizar(String id, String registro) {
        FileWriter fw;
        PrintWriter pw;
        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            eliminar(id);
            //Sobrescribir
            fw = new FileWriter(fichero, true);
            pw = new PrintWriter(fw);
            //A񡤥 el registro actualizado al final
            pw.println(registro);

            pw.close();
            fw.close();
        } catch (SecurityException se) {
            System.out.println("No tiene permisos para crear el fichero \"" + fichero.getPath() + "\"");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
            fnfe.printStackTrace(System.out);
        } catch (IOException e) {
            System.out.println("Error I/O");
            e.printStackTrace(System.out);
        }
    }

    public  void eliminar(String id) {
        String str = "";

        FileReader fr;
        BufferedReader br;

        FileWriter fw;
        PrintWriter pw;
        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            //Leer
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);
            String linea;
            linea = br.readLine();

            int i = 0;
            String pkRegistro = "";

            while (linea != null) {
                //Si la linea contiene la PK que queremos eliminar NO se guarda
                while (linea.charAt(i) != '-') {
                    pkRegistro = pkRegistro + linea.charAt(i);
                    i++;
                }
                if (!pkRegistro.equals(id)) {
                    str = str + linea + "\n";
                }
                i = 0;
                pkRegistro = "";
                linea = br.readLine();
            }
            br.close();
            fr.close();

            //Sobrescribir
            fw = new FileWriter(fichero);
            pw = new PrintWriter(fw);
            //A񡤥 la copia del fichero
            pw.println(str);

            pw.close();
            fw.close();
        } catch (SecurityException se) {
            System.out.println("No tiene permisos para crear el fichero \"" + fichero.getPath() + "\"");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Archivo no encontrado");
            fnfe.printStackTrace(System.out);
        } catch (IOException e) {
            System.out.println("Error I/O");
            e.printStackTrace(System.out);
        }
    }
}
