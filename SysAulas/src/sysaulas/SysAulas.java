/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysaulas;

import Forms.Inicio;
import Gestores.AdministradorSesion;

/**
 *
 * @author Laureano
 */
public class SysAulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdministradorSesion adminSesion = new AdministradorSesion();
        
        Inicio init = new Inicio();
        adminSesion.setMenuInicio(init);
        init.setVisible(true);
        init.setAdminSesion(adminSesion);
    }
    
}
