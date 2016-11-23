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
import com.sun.javafx.event.EventDispatchTreeImpl;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Fabregas
 */
public class ControladorInterfazMaestra implements ActionListener {

    InterfazMaestraUI interfazMaestra;
    private String idBuscado;
    AuditoriaDAO auditoriaDAO;
    AuditoriaDTO auditoriaDTO;
    ContactoDAO contactoDAO;
    ContactoDTO contactoDTO;
    EmpresaDAO empresaDAO;
    EmpresaDTO empresaDTO;
    EquipoDAO equipoDAO;
    EquipoDTO equipoDTO;
    EstadoDAO estadoDAO;
    EstadoDTO estadoDTO;
    OperacionCompraDAO compraDAO;
    OperacionCompraDTO compraDTO;
    PaisDAO paisDAO;
    PaisDTO paisDTO;
    PresupuestoDAO presupuestoDAO;
    PresupuestoDTO presupuestoDTO;
    RecepcionDAO recepcionDAO;
    RecepcionDTO recepcionDTO;
    SistemaOperativoDAO sistemaOperativoDAO;
    SistemaOperativoDTO sistemaOperativoDTO;

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

        //interfazMaestra.salir.addActionListener(this);
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
            //Empresas
            case "nuevaEmpresa":
                ControladorEmpresaUI controladorEmpresaUI = new ControladorEmpresaUI();
                break;
            case "listarEmpresas":

                empresaDAO = EmpresaDAOFactory.getInstance().createEmpresaDAO();
                
                List<EmpresaDTO> lista = empresaDAO.listar();
                
                InterfazMaestraUI.columnNames = new String[]{"ID", "CIF", "Email", "Direccion", "Movil", "Status"};
                for (int i = 0; i <= lista.size(); i++) {
                    InterfazMaestraUI.data[i][0] = lista.get(i).getIdEmpresa();
                    InterfazMaestraUI.data[i][1] = lista.get(i).getRifEmpresa();
                    InterfazMaestraUI.data[i][2] = lista.get(i).getEmail();
                    InterfazMaestraUI.data[i][3] = lista.get(i).getDireccion();
                    InterfazMaestraUI.data[i][4] = lista.get(i).getMovil();
                    InterfazMaestraUI.data[i][5] = lista.get(i).getStatus();
                }
                break;
            case "borrarEmpresa":
                empresaDAO = EmpresaDAOFactory.getInstance().createEmpresaDAO();
                empresaDTO = new EmpresaDTO();
                empresaDTO.setIdEmpresa(JOptionPane.showInputDialog(interfazMaestra, "ID Empresa", "Borrar Empresa", JOptionPane.QUESTION_MESSAGE));
                empresaDAO.borrar(empresaDTO.getIdEmpresa());
                JOptionPane.showMessageDialog(interfazMaestra, "Empresa Borrada");
                break;
            case "updateEmpresa":
                ControladorEmpresaUI ceui = new ControladorEmpresaUI("Actualizar");
                //Para actualizar la empresa primero se hace buscar empresa y despues se lanza la interfaz con los paraetros llenos
                break;
            case "buscarEmpresa":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Empresa", "Buscar Empresa", JOptionPane.QUESTION_MESSAGE);
                empresaDAO = EmpresaDAOFactory.getInstance().createEmpresaDAO();
                empresaDTO = empresaDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, empresaDTO.toString());
                break;
            //Presupuestos
            case "nuevoPresupuesto":
                ControladorPresupuestoUI controladorPresupuestoUI = new ControladorPresupuestoUI();
                break;
            case "borrarPresupuesto":
                presupuestoDAO = PresupuestoDAOFactory.getInstance().createPresupuestoDAO();
                presupuestoDTO = new PresupuestoDTO();
                presupuestoDTO.setIdPresupuesto(JOptionPane.showInputDialog(interfazMaestra, "ID Presupuesto", "Borrar Presupuesto", JOptionPane.QUESTION_MESSAGE));
                presupuestoDAO.borrar(presupuestoDTO.getIdPresupuesto());
                JOptionPane.showMessageDialog(interfazMaestra, "Presupuesto Borrado");
                //Borrado en cascada
                break;
            case "listarPresupuestos":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updatePresupuesto":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarPresupuesto":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Presupuesto", "Buscar Presupuesto", JOptionPane.QUESTION_MESSAGE);
                presupuestoDAO = PresupuestoDAOFactory.getInstance().createPresupuestoDAO();
                presupuestoDTO = presupuestoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, presupuestoDTO.toString());
                break;
            //Contactos
            case "nuevoContacto":
                ControladorContactoUI ccui = new ControladorContactoUI("Guardar");
                break;
            case "borrarContacto":
                contactoDAO = ContactoDAOFactory.getInstance().createContactoDAO();
                contactoDTO = new ContactoDTO();
                contactoDTO.setIdPContactos(JOptionPane.showInputDialog(interfazMaestra, "ID Contacto", "Borrar Contacto", JOptionPane.QUESTION_MESSAGE));
                contactoDAO.borrar(contactoDTO.getIdPContactos());
                JOptionPane.showMessageDialog(interfazMaestra, "Contacto Borrado");
                break;
            case "listarContactos":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateContacto":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarContacto":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Contacto", "Buscar Contacto", JOptionPane.QUESTION_MESSAGE);
                contactoDAO = ContactoDAOFactory.getInstance().createContactoDAO();
                contactoDTO = contactoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, contactoDTO.toString());
                break;
            //Equipos
            case "nuevoEquipo":
                ControladorEquipoUI controladorEquipoUI = new ControladorEquipoUI();
                break;
            case "borrarEquipo":
                equipoDAO = EquipoDAOFactory.getInstance().createEquipoDAO();
                equipoDTO = new EquipoDTO();
                equipoDTO.setIdEquipo(JOptionPane.showInputDialog(interfazMaestra, "ID Equipo", "Borrar Equipo", JOptionPane.QUESTION_MESSAGE));
                equipoDAO.borrar(equipoDTO.getIdEquipo());
                JOptionPane.showMessageDialog(interfazMaestra, "Equipo Borrado");
                break;
            case "listarEquipos":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateEquipos":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarEquipo":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Equipo", "Buscar Equipo", JOptionPane.QUESTION_MESSAGE);
                equipoDAO = EquipoDAOFactory.getInstance().createEquipoDAO();
                equipoDTO = equipoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, equipoDTO.toString());
                break;
            //SSOO
            case "nuevoSO":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "borraSO":
                sistemaOperativoDAO = SistemaOperativoDAOFactory.getInstance().createSistemaOperativoDAO();
                sistemaOperativoDTO = new SistemaOperativoDTO();
                sistemaOperativoDTO.setIdSO(JOptionPane.showInputDialog(interfazMaestra, "ID S.O.", "Borrar Sistema Operativo", JOptionPane.QUESTION_MESSAGE));
                sistemaOperativoDAO.borrar(sistemaOperativoDTO.getIdSO());
                JOptionPane.showMessageDialog(interfazMaestra, "Sistema Operativo Borrado");
                break;
            case "listarSO":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateSO":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarSO":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID S.O.", "Buscar S.Operativo", JOptionPane.QUESTION_MESSAGE);
                sistemaOperativoDAO = SistemaOperativoDAOFactory.getInstance().createSistemaOperativoDAO();
                sistemaOperativoDTO = sistemaOperativoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, sistemaOperativoDTO.toString());
                break;
            //Auditorias
            case "nuevaAuditoria":
                ControladorAuditoria na = new ControladorAuditoria("Descripcion", "Guardar");
                break;
            case "borrarAuditoria":
                auditoriaDAO = AuditoriaDAOFactory.getInstance().createAuditoriaDAO();
                auditoriaDTO = new AuditoriaDTO();
                auditoriaDTO.setIdAuditoria(JOptionPane.showInputDialog(interfazMaestra, "ID Auditoria", "Borrar Auditoria", JOptionPane.QUESTION_MESSAGE));
                JOptionPane.showMessageDialog(interfazMaestra, "Auditoria Borrada");
                break;
            case "listarAuditorias":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateAuditoria":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarAuditoria":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Auditoria", "Buscar Auditoria", JOptionPane.QUESTION_MESSAGE);
                auditoriaDAO = AuditoriaDAOFactory.getInstance().createAuditoriaDAO();
                auditoriaDTO = auditoriaDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, auditoriaDTO.toString());
                break;
            //Recepciones
            case "nuevaRecepcion":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "borrarRecepcion":
                recepcionDAO = RecepcionDAOFactory.getInstance().createRecepcionDAO();
                recepcionDTO.setIdRecepcion(JOptionPane.showInputDialog(interfazMaestra, "ID Recepcion", "Borrar Recepcion", JOptionPane.QUESTION_MESSAGE));
                recepcionDAO.borrar(recepcionDTO.getIdRecepcion());
                JOptionPane.showMessageDialog(interfazMaestra, "Recepcion Borrada");
                break;
            case "listarRecepciones":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateRecepcion":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarRecepcion":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Recepcion", "Buscar Recepcion", JOptionPane.QUESTION_MESSAGE);
                recepcionDAO = RecepcionDAOFactory.getInstance().createRecepcionDAO();
                recepcionDTO = recepcionDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, recepcionDTO.toString());
                break;
            //Compras
            case "nuevaCompra":
                ControladorOperacionCompraUI controladorOperacionCompraUI = new ControladorOperacionCompraUI();
                break;
            case "borrarCompra":
                compraDAO = OperacionCompraDAOFactory.getInstance().createOperacionCompraDAO();
                compraDTO = new OperacionCompraDTO();
                compraDTO.setIdOpCompra(JOptionPane.showInputDialog(interfazMaestra, "ID Compra", "Borrar Compra", JOptionPane.QUESTION_MESSAGE));
                compraDAO.borrar(compraDTO.getIdOpCompra());
                JOptionPane.showMessageDialog(interfazMaestra, "Compra Borrada");
                break;
            case "listarCompras":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "updateCompra":
                JOptionPane.showMessageDialog(interfazMaestra, "Pendiente");
                break;
            case "buscarCompra":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Compra", "Buscar Compra", JOptionPane.QUESTION_MESSAGE);
                compraDAO = OperacionCompraDAOFactory.getInstance().createOperacionCompraDAO();
                compraDTO = compraDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, compraDTO.toString());
                break;
            //Paises
            case "nuevoPais":
                ControladorPais cp = new ControladorPais();
                break;
            case "buscarPais":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Pais", "Buscar Pais", JOptionPane.QUESTION_MESSAGE);
                paisDAO = PaisDAOFactory.getInstance().createPaisDAO();
                paisDTO = paisDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, paisDTO.toString());
                break;
            //Estados
            case "nuevoEstado":
                ControladorEstado ce = new ControladorEstado();
                break;
            case "buscarEstado":
                idBuscado = JOptionPane.showInputDialog(interfazMaestra, "ID Estado", "Buscar Estado", JOptionPane.QUESTION_MESSAGE);
                estadoDAO = EstadoDAOFactory.getInstance().createEstadoDAO();
                estadoDTO = estadoDAO.leer(idBuscado);
                JOptionPane.showMessageDialog(interfazMaestra, estadoDTO.toString());
                break;
        }

    }

}
