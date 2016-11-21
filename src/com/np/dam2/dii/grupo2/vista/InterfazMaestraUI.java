package com.np.dam2.dii.grupo2.vista;

import com.np.dam2.dii.grupo2.controlador.ControladorLogin;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.GridBagConstraints;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class InterfazMaestraUI extends JFrame {

    public static String[] columnNames = {"ID", "CIF", "Email", "Direccion", "Telefono", "Movil", "Status"};
    // -
    public static String[][] data = {
        {"001", "11111111", "empresa1@gmail.com", "Calle Isabela 1", "902202111", "651001122", "Activa"}};

    public JTable table;
    public JLabel user, hora;
    public JMenuBar menu;
    public JMenu menuRecepciones;
    public JMenu menuEmpresas;
    public JMenu menuPresupuestos;
    public JMenu menuContactos;
    public JMenu menuEquipos;
    public JMenu menuAuditorias;
    public JMenu menuSistemasOperativos;
    public JMenu mnCompras;
    public JMenuItem nuevaEmpresa;
    public JMenuItem listarEmpresas;
    public JMenuItem updateEmpresa;
    public JMenuItem borrarEmpresa;
    public JMenuItem nuevoPresupuesto;
    public JMenuItem listarPresupuestos;
    public JMenuItem updatePresupuesto;
    public JMenuItem borrarPresupuesto;
    public JMenuItem nuevoContacto;
    public JMenuItem listarContactos;
    public JMenuItem updateContacto;
    public JMenuItem borrarContacto;
    public JMenuItem nuevoEquipo;
    public JMenuItem listarEquipos;
    public JMenuItem updateEquipos;
    public JMenuItem borrarEquipo;
    public JMenuItem nuevoSO;
    public JMenuItem listarSO;
    public JMenuItem updateSO;
    public JMenuItem borraSO;
    public JMenuItem nuevaAuditoria;
    public JMenuItem listarAuditorias;
    public JMenuItem updateAuditoria;
    public JMenuItem borrarAuditoria;
    public JMenuItem nuevaRecepcion;
    public JMenuItem listarRecepciones;
    public JMenuItem updateRecepcion;
    public JMenuItem borrarRecepcion;
    public JMenuItem nuevaCompra;
    public JMenuItem listarCompras;
    public JMenuItem updateCompra;
    public JMenuItem borrarCompra;
    public JMenu mnBuscar;
    public JMenuItem buscarEmpresa;
    public JMenuItem buscarPresupuesto;
    public JMenuItem buscarContacto;
    public JMenu mnPaises;
    public JMenu mnEstados;
    public JMenuItem nuevoPais;
    public JMenuItem listarPaises;
    public JMenuItem updatePais;
    public JMenuItem borrarPais;
    public JMenuItem nuevoEstado;
    public JMenuItem listarEstados;
    public JMenuItem updateEstado;
    public JMenuItem borrarEstado;
    public JMenuItem mntmEquipo;
    public JMenuItem buscarSO;
    public JMenuItem buscarAuditoria;
    public JMenuItem buscarRecepcion;
    public JMenuItem buscarCompra;
    public JMenuItem buscarPais;
    public JMenuItem buscarEstado;
    public JMenu menuSalir;
    public JMenuItem cerrarSesion;
    public JMenuItem salir;
    public static JPanel north, center, south;
    public JMenuItem buscarEquipo;

    public InterfazMaestraUI() {

        setTitle("Nuevas Profesiones v2.0");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        north = new JPanel();
        north.setBorder(new EmptyBorder(0, 5, 0, 5));
        getContentPane().add(north, BorderLayout.NORTH);
        north.setLayout(new BorderLayout(0, 0));

        hora = new JLabel("Hora");

        Date current = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("HH:mm");
        hora.setText("Ultimo inicio de Sesion " + sdt.format(current));
        hora.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        north.add(hora, BorderLayout.EAST);

        user = new JLabel("Usuario");
        user.setText("Usuario: " + ControladorLogin.nombreUsuario.toUpperCase());
        user.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        north.add(user, BorderLayout.WEST);

        center = new JPanel();
        getContentPane().add(center, BorderLayout.CENTER);
        GridBagLayout gbl_center = new GridBagLayout();
        center.setLayout(gbl_center);

        JLabel lblFoto = new JLabel("");
        lblFoto.setIcon(new ImageIcon("slide-eusa1.png"));
        GridBagConstraints gbc_lblFoto = new GridBagConstraints();
        gbc_lblFoto.gridx = 0;
        gbc_lblFoto.gridy = 0;
        center.add(lblFoto, gbc_lblFoto);

        south = new JPanel();
        south.setBorder(new EmptyBorder(0, 0, 10, 0));
        getContentPane().add(south, BorderLayout.SOUTH);

        table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(690, 200));
        south.add(scrollPane);

        menu = new JMenuBar();
        setJMenuBar(menu);

        menuEmpresas = new JMenu("Empresas");
        menu.add(menuEmpresas);

        nuevaEmpresa = new JMenuItem("Nueva");
        nuevaEmpresa.setActionCommand("nuevaEmpresa");
        menuEmpresas.add(nuevaEmpresa);

        listarEmpresas = new JMenuItem("Abrir");
        listarEmpresas.setActionCommand("listarEmpresas");
        menuEmpresas.add(listarEmpresas);

        updateEmpresa = new JMenuItem("Actualizar");
        updateEmpresa.setActionCommand("updateEmpresa");
        menuEmpresas.add(updateEmpresa);

        borrarEmpresa = new JMenuItem("Borrar");
        borrarEmpresa.setActionCommand("borrarEmpresa");
        menuEmpresas.add(borrarEmpresa);

        menuPresupuestos = new JMenu("Presupuestos");
        menu.add(menuPresupuestos);

        nuevoPresupuesto = new JMenuItem("Nuevo");
        nuevoPresupuesto.setActionCommand("nuevoPresupuesto");
        menuPresupuestos.add(nuevoPresupuesto);

        listarPresupuestos = new JMenuItem("Abrir");
        listarPresupuestos.setActionCommand("listarPresupuestos");
        menuPresupuestos.add(listarPresupuestos);

        updatePresupuesto = new JMenuItem("Actualizar");
        updatePresupuesto.setActionCommand("updatePresupuesto");
        menuPresupuestos.add(updatePresupuesto);

        borrarPresupuesto = new JMenuItem("Borrar");
        borrarPresupuesto.setActionCommand("borrarPresupuesto");
        menuPresupuestos.add(borrarPresupuesto);

        menuContactos = new JMenu("Contactos");
        menu.add(menuContactos);

        nuevoContacto = new JMenuItem("Nuevo");
        nuevoContacto.setActionCommand("nuevoContacto");
        menuContactos.add(nuevoContacto);

        listarContactos = new JMenuItem("Abrir");
        listarContactos.setActionCommand("listarContactos");
        menuContactos.add(listarContactos);

        updateContacto = new JMenuItem("Actualizar");
        updateContacto.setActionCommand("updateContacto");
        menuContactos.add(updateContacto);

        borrarContacto = new JMenuItem("Borrar");
        borrarContacto.setActionCommand("borrarContacto");
        menuContactos.add(borrarContacto);

        mnPaises = new JMenu("Paises");

        menuContactos.add(mnPaises);

        nuevoPais = new JMenuItem("Nuevo");
        nuevoPais.setActionCommand("nuevoPais");
        mnPaises.add(nuevoPais);

        listarPaises = new JMenuItem("Abrir");
        listarPaises.setActionCommand("listarPaises");
        mnPaises.add(listarPaises);

        updatePais = new JMenuItem("Actualizar");
        updatePais.setActionCommand("updatePais");
        mnPaises.add(updatePais);

        borrarPais = new JMenuItem("Borrar");
        borrarPais.setActionCommand("borrarPais");
        mnPaises.add(borrarPais);

        mnEstados = new JMenu("Estados");
        mnEstados.setActionCommand("mnEstados");
        menuContactos.add(mnEstados);

        nuevoEstado = new JMenuItem("Nuevo");
        nuevoEstado.setActionCommand("nuevoEstado");
        mnEstados.add(nuevoEstado);

        listarEstados = new JMenuItem("Abrir");
        listarEstados.setActionCommand("listarEstados");
        mnEstados.add(listarEstados);

        updateEstado = new JMenuItem("Actualizar");
        updateEstado.setActionCommand("updateEstado");
        mnEstados.add(updateEstado);

        borrarEstado = new JMenuItem("Borrar");
        borrarEstado.setActionCommand("borrarEstado");
        mnEstados.add(borrarEstado);

        menuEquipos = new JMenu("Equipos");
        menu.add(menuEquipos);

        nuevoEquipo = new JMenuItem("Nuevo");
        nuevoEquipo.setActionCommand("nuevoEquipo");
        menuEquipos.add(nuevoEquipo);

        listarEquipos = new JMenuItem("Abrir");
        listarEquipos.setActionCommand("listarEquipos");
        menuEquipos.add(listarEquipos);

        updateEquipos = new JMenuItem("Actualizar");
        updateEquipos.setActionCommand("updateEquipos");
        menuEquipos.add(updateEquipos);

        borrarEquipo = new JMenuItem("Borrar");
        borrarEquipo.setActionCommand("borrarEquipo");
        menuEquipos.add(borrarEquipo);

        menuSistemasOperativos = new JMenu("S.S.O.O.");
        menu.add(menuSistemasOperativos);

        nuevoSO = new JMenuItem("Nuevo");
        nuevoSO.setActionCommand("nuevoSO");
        menuSistemasOperativos.add(nuevoSO);

        listarSO = new JMenuItem("Abrir");
        listarSO.setActionCommand("listarSO");
        menuSistemasOperativos.add(listarSO);

        updateSO = new JMenuItem("Actualizar");
        updateSO.setActionCommand("updateSO");
        menuSistemasOperativos.add(updateSO);

        borraSO = new JMenuItem("Borrar");
        borraSO.setActionCommand("borraSO");
        menuSistemasOperativos.add(borraSO);

        menuAuditorias = new JMenu("Auditorias");
        menu.add(menuAuditorias);

        nuevaAuditoria = new JMenuItem("Nueva");
        nuevaAuditoria.setActionCommand("nuevaAuditoria");
        menuAuditorias.add(nuevaAuditoria);

        listarAuditorias = new JMenuItem("Abrir");
        listarAuditorias.setActionCommand("listarAuditorias");
        menuAuditorias.add(listarAuditorias);

        updateAuditoria = new JMenuItem("Actualizar");
        updateAuditoria.setActionCommand("updateAuditoria");
        menuAuditorias.add(updateAuditoria);

        borrarAuditoria = new JMenuItem("Borrar");
        borrarAuditoria.setActionCommand("borrarAuditoria");
        menuAuditorias.add(borrarAuditoria);

        menuRecepciones = new JMenu("Recepciones");
        menuRecepciones.setActionCommand("menuRecepciones");
        menu.add(menuRecepciones);

        nuevaRecepcion = new JMenuItem("Nueva");
        nuevaRecepcion.setActionCommand("nuevaRecepcion");
        menuRecepciones.add(nuevaRecepcion);

        listarRecepciones = new JMenuItem("Abrir");
        listarRecepciones.setActionCommand("listarRecepciones");
        menuRecepciones.add(listarRecepciones);

        updateRecepcion = new JMenuItem("Actualizar");
        updateRecepcion.setActionCommand("updateRecepcion");
        menuRecepciones.add(updateRecepcion);

        borrarRecepcion = new JMenuItem("Borrar");
        borrarRecepcion.setActionCommand("borrarRecepcion");
        menuRecepciones.add(borrarRecepcion);

        mnCompras = new JMenu("Compras");
        menu.add(mnCompras);

        nuevaCompra = new JMenuItem("Nueva");
        nuevaCompra.setActionCommand("nuevaCompra");
        mnCompras.add(nuevaCompra);

        listarCompras = new JMenuItem("Abrir");
        listarCompras.setActionCommand("listarCompras");
        mnCompras.add(listarCompras);

        updateCompra = new JMenuItem("Actualizar");
        updateCompra.setActionCommand("updateCompra");
        mnCompras.add(updateCompra);

        borrarCompra = new JMenuItem("Borrar");
        borrarCompra.setActionCommand("borrarCompra");
        mnCompras.add(borrarCompra);

        Component horizontalStrut = Box.createHorizontalStrut(123);
        menu.add(horizontalStrut);

        mnBuscar = new JMenu("Buscar");
        mnBuscar.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        mnBuscar.setIcon(new ImageIcon("lupa.png'"));
        menu.add(mnBuscar);

        buscarEmpresa = new JMenuItem("Empresa");
        buscarEmpresa.setActionCommand("buscarEmpresa");
        mnBuscar.add(buscarEmpresa);

        buscarPresupuesto = new JMenuItem("Presupuesto");
        buscarPresupuesto.setActionCommand("buscarPresupuesto");
        mnBuscar.add(buscarPresupuesto);

        buscarContacto = new JMenuItem("Contacto");
        buscarContacto.setActionCommand("buscarContacto");
        mnBuscar.add(buscarContacto);

        buscarEquipo = new JMenuItem("Equipo");
        buscarEquipo.setActionCommand("buscarEquipo");
        mnBuscar.add(buscarEquipo);

        buscarSO = new JMenuItem("S. Operativo");
        buscarSO.setActionCommand("buscarSO");
        mnBuscar.add(buscarSO);

        buscarAuditoria = new JMenuItem("Auditoria");
        buscarAuditoria.setActionCommand("buscarAuditoria");
        mnBuscar.add(buscarAuditoria);

        buscarRecepcion = new JMenuItem("Recepcion");
        buscarRecepcion.setActionCommand("buscarRecepcion");
        mnBuscar.add(buscarRecepcion);

        buscarCompra = new JMenuItem("Compra");
        buscarCompra.setActionCommand("buscarCompra");
        mnBuscar.add(buscarCompra);

        buscarPais = new JMenuItem("Pais");
        buscarPais.setActionCommand("buscarPais");
        mnBuscar.add(buscarPais);

        buscarEstado = new JMenuItem("Estado");
        buscarEstado.setActionCommand("buscarEstado");
        mnBuscar.add(buscarEstado);

        menuSalir = new JMenu("Salir");
        menuSalir.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        menu.add(menuSalir);

        cerrarSesion = new JMenuItem("Cerrar Sesion");
        cerrarSesion.setActionCommand("cerrarSesion");
        menuSalir.add(cerrarSesion);

        this.setSize(933, 427);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

    }

}
