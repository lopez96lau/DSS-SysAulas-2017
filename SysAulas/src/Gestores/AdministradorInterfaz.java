/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Forms.BuscarBedel;
import Forms.Inicio;
import Forms.MenuAdmin;
import Forms.MenuBedel;
import Forms.ObtenerDisponibilidadAula;
import Forms.RegistrarBedel;
import Forms.ReservarAula;

/**
 *
 * @author lucia
 */
public class AdministradorInterfaz {
    private static Inicio menuInicio;
    private static MenuAdmin menuAdmin;
    private static RegistrarBedel registarBedel;
    private static BuscarBedel buscarBedel;
    private static MenuBedel menuBedel;
    private static ReservarAula reservarAula;
    private static ObtenerDisponibilidadAula obtenerDisp;
    
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

    public static BuscarBedel getBuscarBedel() {
        return buscarBedel;
    }

    public static void setBuscarBedel(BuscarBedel buscarBedel) {
        AdministradorInterfaz.buscarBedel = buscarBedel;
    }

    public static MenuBedel getMenuBedel() {
        return menuBedel;
    }

    public static void setMenuBedel(MenuBedel menuBedel) {
        AdministradorInterfaz.menuBedel = menuBedel;
    }

    public static ReservarAula getReservarAula() {
        return reservarAula;
    }

    public static void setReservarAula(ReservarAula reservarAula) {
        AdministradorInterfaz.reservarAula = reservarAula;
    }

    public static ObtenerDisponibilidadAula getObtenerDisp() {
        return obtenerDisp;
    }

    public static void setObtenerDisp(ObtenerDisponibilidadAula obtenerDisp) {
        AdministradorInterfaz.obtenerDisp = obtenerDisp;
    }
    
    
    
}
