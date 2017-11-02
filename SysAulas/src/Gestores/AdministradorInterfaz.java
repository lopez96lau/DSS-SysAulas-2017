/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Forms.Inicio;
import Forms.MenuAdmin;
import Forms.RegistrarBedel;

/**
 *
 * @author lucia
 */
public class AdministradorInterfaz {
    private static Inicio menuInicio;
    private static MenuAdmin menuAdmin;
    private static RegistrarBedel registarBedel;
    
    public static MenuAdmin getMenuAdmin() {
        return menuAdmin;
    }

    public static void setMenuAdmin(MenuAdmin mAdmin) {
        menuAdmin = mAdmin;
    }

    public static Inicio getMenuInicio() {
        return menuInicio;
    }

    public static void setMenuInicio(Inicio mInicio) {
        menuInicio = mInicio;
    }

    public static RegistrarBedel getRegistarBedel() {
        return registarBedel;
    }

    public static void setRegistarBedel(RegistrarBedel registarBedel) {
        AdministradorInterfaz.registarBedel = registarBedel;
    }
    
}
