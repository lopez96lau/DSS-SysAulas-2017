/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysaulas;

import Forms.Inicio;
import Gestores.AdministradorSesion;
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
        
        AdministradorSesion adminSesion = new AdministradorSesion();
        
        Inicio init = new Inicio();
        adminSesion.setMenuInicio(init);
        adminSesion.setSesion(sesion);
        init.setVisible(true);
        init.setAdminSesion(adminSesion);
    }
    
}
