/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Forms.Inicio;
import Forms.MenuAdmin;
import db.model.Usuario;
import org.hibernate.Session;

/**
 *
 * @author lucia
 */
public class AdministradorSesion {
    Usuario usuarioActual;
    Inicio menuInicio;
    MenuAdmin menuAdmin;
    Session sesion;

    public Session getSesion() {
        return sesion;
    }

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }
    

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
    
    
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    
    
}
