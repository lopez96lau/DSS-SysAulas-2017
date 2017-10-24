/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Forms.Inicio;
import Forms.MenuAdmin;

/**
 *
 * @author lucia
 */
public class AdministradorSesion {
    String usuarioActual; //Cambiar esto
    Inicio menuInicio;
    MenuAdmin menuAdmin;

    public MenuAdmin getMenuAdmin() {
        return menuAdmin;
    }

    public void setMenuAdmin(MenuAdmin menuAdmin) {
        this.menuAdmin = menuAdmin;
    }
    
    
    

    public Inicio getMenuInicio() {
        return menuInicio;
    }

    public void setMenuInicio(Inicio menuInicio) {
        this.menuInicio = menuInicio;
    }
    
    
    public String getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(String usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    
    
}
