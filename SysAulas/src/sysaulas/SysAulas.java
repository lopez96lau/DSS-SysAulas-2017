/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysaulas;

import Dao.HistorialContraseniasDao;
import Dao.PeriodoDao;
import Dao.PoliticaDao;
import Dao.TurnoDao;
import Dao.UsuarioDao;
import Forms.BuscarBedel;
import Forms.Inicio;
import Forms.MenuAdmin;
import Forms.MenuBedel;
import Forms.ObtenerDisponibilidadAula;
import Forms.RegistrarBedel;
import Forms.ReservarAula;
import Gestores.AdministradorInterfaz;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Laureano
 */
public class SysAulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration configuracion = new Configuration();
        configuracion.configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuracion.getProperties());
        SessionFactory fabricaSesion = configuracion.buildSessionFactory(ssrb.build());
        Session sesion = fabricaSesion.openSession();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }

        UsuarioDao.setSesion(sesion);
        PoliticaDao.setSesion(sesion);
        TurnoDao.setSesion(sesion);
        PeriodoDao.setSesion(sesion);
        HistorialContraseniasDao.setSesion(sesion);
        
        
        ObtenerDisponibilidadAula obtenerDisp = new ObtenerDisponibilidadAula();
        obtenerDisp.setLocationRelativeTo(null);
        obtenerDisp.setAlwaysOnTop(true);
        AdministradorInterfaz.setObtenerDisp(obtenerDisp);
        
        ReservarAula reservarAula = new ReservarAula();
        reservarAula.setLocationRelativeTo(null);
        //reservarAula.setAlwaysOnTop(true);
        AdministradorInterfaz.setReservarAula(reservarAula);
        
        MenuBedel menuBedel = new MenuBedel();
        menuBedel.setLocationRelativeTo(null);
        //menuBedel.setAlwaysOnTop(true);
        AdministradorInterfaz.setMenuBedel(menuBedel);
        
        BuscarBedel buscarBedel = new BuscarBedel();
        buscarBedel.setLocationRelativeTo(null);
        //buscarBedel.setAlwaysOnTop(true);
        AdministradorInterfaz.setBuscarBedel(buscarBedel);

        RegistrarBedel regBedel = new RegistrarBedel();
        regBedel.setLocationRelativeTo(null);
        //regBedel.setAlwaysOnTop(true);
        AdministradorInterfaz.setRegistarBedel(regBedel);

        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setLocationRelativeTo(null);
        //menuAdmin.setAlwaysOnTop(true);
        AdministradorInterfaz.setMenuAdmin(menuAdmin);

        Inicio init = new Inicio();
        init.setLocationRelativeTo(null);
        //init.setAlwaysOnTop(true);
        AdministradorInterfaz.setMenuInicio(init);

        init.setVisible(true);
    }

}
