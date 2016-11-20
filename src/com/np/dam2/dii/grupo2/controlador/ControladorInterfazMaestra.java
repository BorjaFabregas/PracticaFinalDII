package com.np.dam2.dii.grupo2.controlador;

import com.np.dam2.dii.grupo2.modelo.dao.AuditoriaDAO;
import com.np.dam2.dii.grupo2.modelo.dao.ContactoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.EmpresaDAO;
import com.np.dam2.dii.grupo2.modelo.dao.EquipoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.EstadoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.OperacionCompraDAO;
import com.np.dam2.dii.grupo2.modelo.dao.PaisDAO;
import com.np.dam2.dii.grupo2.modelo.dao.PresupuestoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.RecepcionDAO;
import com.np.dam2.dii.grupo2.modelo.dao.SistemaOperativoDAO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.AuditoriaDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.ContactoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EmpresaDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EquipoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.EstadoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.OperacionCompraDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.PaisDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.PresupuestoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.RecepcionDTO;
import com.np.dam2.dii.grupo2.modelo.dao.dto.SistemaOperativoDTO;
import com.np.dam2.dii.grupo2.modelo.dao.factory.AuditoriaDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.ContactoDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.EmpresaDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.EquipoDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.EstadoDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.OperacionCompraDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.PaisDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.PresupuestoDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.RecepcionDAOFactory;
import com.np.dam2.dii.grupo2.modelo.dao.factory.SistemaOperativoDAOFactory;
import com.np.dam2.dii.grupo2.vista.InterfazMaestraUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabregas
 */
public class ControladorInterfazMaestra implements ActionListener {

    InterfazMaestraUI interfazMaestra;
    private String idBuscado;

    public ControladorInterfazMaestra() {
        interfazMaestra = new InterfazMaestraUI();
        //Empresas
        interfazMaestra.nuevaEmpresa.addActionListener(this);
        interfazMaestra.borrarEmpresa.addActionListener(this);
        interfazMaestra.listarEmpresas.addActionListener(this);
        interfazMaestra.updateEmpresa.addActionListener(this);
        interfazMaestra.buscarEmpresa.addActionListener(this);
        //Presupuestos
        interfazMaestra.nuevoPresupuesto.addActionListener(this);
        interfazMaestra.borrarPresupuesto.addActionListener(this);
        interfazMaestra.listarPresupuestos.addActionListener(this);
        interfazMaestra.updatePresupuesto.addActionListener(this);
        interfazMaestra.buscarPresupuesto.addActionListener(this);
        //Contactos
        interfazMaestra.nuevoContacto.addActionListener(this);
        interfazMaestra.borrarContacto.addActionListener(this);
        interfazMaestra.listarContactos.addActionListener(this);
        interfazMaestra.updateContacto.addActionListener(this);
        interfazMaestra.buscarContacto.addActionListener(this);
        //Paises y Estados
        interfazMaestra.nuevoPais.addActionListener(this);
        interfazMaestra.nuevoEstado.addActionListener(this);
        interfazMaestra.borrarPais.addActionListener(this);
        interfazMaestra.borrarEstado.addActionListener(this);
        interfazMaestra.buscarPais.addActionListener(this);
        interfazMaestra.buscarEstado.addActionListener(this);
        //Equipos
        interfazMaestra.nuevoEquipo.addActionListener(this);
        interfazMaestra.borrarEquipo.addActionListener(this);
        interfazMaestra.listarEquipos.addActionListener(this);
        interfazMaestra.updateEquipos.addActionListener(this);
        interfazMaestra.buscarEquipo.addActionListener(this);
        //SO
        interfazMaestra.nuevoSO.addActionListener(this);
        interfazMaestra.borraSO.addActionListener(this);
        interfazMaestra.listarSO.addActionListener(this);
        interfazMaestra.updateSO.addActionListener(this);
        interfazMaestra.buscarSO.addActionListener(this);
        //Auditorias
        interfazMaestra.nuevaAuditoria.addActionListener(this);
        interfazMaestra.borrarAuditoria.addActionListener(this);
        interfazMaestra.listarAuditorias.addActionListener(this);
        interfazMaestra.updateAuditoria.addActionListener(this);
        interfazMaestra.buscarAuditoria.addActionListener(this);
        //Recepciones
        interfazMaestra.nuevaRecepcion.addActionListener(this);
        interfazMaestra.borrarRecepcion.addActionListener(this);
        interfazMaestra.listarPresupuestos.addActionListener(this);
        interfazMaestra.updateRecepcion.addActionListener(this);
        interfazMaestra.buscarRecepcion.addActionListener(this);
        //Compras
        interfazMaestra.nuevaCompra.addActionListener(this);
        interfazMaestra.borrarCompra.addActionListener(this);
        interfazMaestra.listarCompras.addActionListener(this);
        interfazMaestra.updateCompra.addActionListener(this);
        interfazMaestra.buscarCompra.addActionListener(this);

        interfazMaestra.cerrarSesion.addActionListener(this);

        interfazMaestra.salir.addActionListener(this);

        //Aqui irán todos los Listener 
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "cerrarSesion":
                JOptionPane.showMessageDialog(interfazMaestra, "Hasta Pronto!");
                interfazMaestra.dispose();
                ControladorLogin cl = new ControladorLogin();
                break;
            case "salir":
                if (JOptionPane.showConfirmDialog(interfazMaestra, "¿Seguro que quieres salir?", "Salir", 0) == 0) {
                    interfazMaestra.dispose();
                }
                break;
            //Empresas
            case "nuevaEmpresa":
                ControladorEmpresaUI cem = new ControladorEmpresaUI();
                break;
            case "listarEmpresas":
                EmpresaDAO dao = EmpresaDAOFactory.getInstance().createEmpresaDAO();
                LinkedList lista = (LinkedList) dao.listar();
                String[] strArray;
                strArray = (String[]) lista.toArray();
                InterfazMaestraUI.columnNames = (strArray);
                break;
            case "borrarEmpresa":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateEmpresa":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                //Para actualizar la empresa primero se hace buscar empresa y despues se lanza la interfaz con los paraetros llenos
                break;
            case "buscarEmpresa":
                //JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Empresa", "Buscar Empresa", JOptionPane.QUESTION_MESSAGE);
                EmpresaDAO empresaDAO = EmpresaDAOFactory.getInstance().createEmpresaDAO();
                EmpresaDTO empresaDTO = empresaDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, empresaDTO.toString());
                break;
            //Presupuestos
            case "nuevoPresupuesto":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "borrarPresupuesto":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "listarPresupuestos":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updatePresupuesto":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarPresupuesto":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Presupuesto", "Buscar Presupuesto", JOptionPane.QUESTION_MESSAGE);
                PresupuestoDAO presupuestoDAO = PresupuestoDAOFactory.getInstance().createPresupuestoDAO();
                PresupuestoDTO presupuestoDTO = presupuestoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, presupuestoDTO.toString());
                break;
            //Contactos
            case "nuevoContacto":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "borrarContacto":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "listarContactos":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateContacto":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarContacto":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Contacto", "Buscar Contacto", JOptionPane.QUESTION_MESSAGE);
                ContactoDAO contactoDAO = ContactoDAOFactory.getInstance().createContactoDAO();
                ContactoDTO contactoDTO = contactoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, contactoDTO.toString());
                break;
            //Equipos
            case "nuevoEquipo":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "borrarEquipo":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "listarEquipos":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateEquipos":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarEquipo":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Equipo", "Buscar Equipo", JOptionPane.QUESTION_MESSAGE);
                EquipoDAO equipoDAO = EquipoDAOFactory.getInstance().createEquipoDAO();
                EquipoDTO equipoDTO = equipoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, equipoDTO.toString());
                break;
            //SSOO
            case "nuevoSO":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "borraSO":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "listarSO":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateSO":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarSO":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID S.O.", "Buscar S.Operativo", JOptionPane.QUESTION_MESSAGE);
                SistemaOperativoDAO sistemaOperativoDAO = SistemaOperativoDAOFactory.getInstance().createSistemaOperativoDAO();
                SistemaOperativoDTO sistemaOperativoDTO = sistemaOperativoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, sistemaOperativoDTO.toString());
                break;
            //Auditorias
            case "nuevaAuditoria":
                ControladorAuditoria na = new ControladorAuditoria("Descripcion", "Guardar");
                break;
            case "borrarAuditoria":
                ControladorAuditoria ca = new ControladorAuditoria("Id", "Borrar");
                break;
            case "listarAuditorias":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateAuditoria":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarAuditoria":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Auditoria", "Buscar Auditoria", JOptionPane.QUESTION_MESSAGE);
                AuditoriaDAO auditoriaDAO = AuditoriaDAOFactory.getInstance().createAuditoriaDAO();
                AuditoriaDTO auditoriaDTO = auditoriaDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, auditoriaDTO.toString());
                break;
            //Recepciones
            case "nuevaRecepcion":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "borrarRecepcion":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "listarRecepciones":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateRecepcion":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarRecepcion":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Recepcion", "Buscar Recepcion", JOptionPane.QUESTION_MESSAGE);
                RecepcionDAO recepcionDAO = RecepcionDAOFactory.getInstance().createRecepcionDAO();
                RecepcionDTO recepcionDTO = recepcionDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, recepcionDTO.toString());
                break;
            //Compras
            case "nuevaCompra":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "borrarCompra":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "listarCompras":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateCompra":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarCompra":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Compra", "Buscar Compra", JOptionPane.QUESTION_MESSAGE);
                OperacionCompraDAO operacionCompraDAO = OperacionCompraDAOFactory.getInstance().createOperacionCompraDAO();
                OperacionCompraDTO operacionCompraDTO = operacionCompraDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, operacionCompraDTO.toString());
                break;
            //Paises
            case "nuevoPais":
                ControladorPais cp = new ControladorPais();
                break;
            case "buscarPais":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Pais", "Buscar Pais", JOptionPane.QUESTION_MESSAGE);
                PaisDAO paisDAO = PaisDAOFactory.getInstance().createPaisDAO();
                PaisDTO paisDTO = paisDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, paisDTO.toString());
                break;
            //Estados
            case "nuevoEstado":
                ControladorEstado ce = new ControladorEstado();
                break;
            case "buscarEstado":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Estado", "Buscar Estado", JOptionPane.QUESTION_MESSAGE);
                EstadoDAO estadoDAO = EstadoDAOFactory.getInstance().createEstadoDAO();
                EstadoDTO estadoDTO = estadoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, estadoDTO.toString());
                break;
        }

    }

}
