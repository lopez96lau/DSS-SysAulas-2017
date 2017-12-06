/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.UsuarioDao;
import db.model.Usuario;

/**
 *
 * @author lucia
 */
public class AdministradorSesion {
    private static Usuario usuarioActual;
    
    public static Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public static void setUsuarioActual(Usuario userActual) {
        usuarioActual = userActual;
    }

    public static Integer iniciarSesion(String tmpUsuario, String tmpContraseña) {
        if (AdministradorPolitica.validarLongitudUsuario(tmpUsuario)) {
            if (AdministradorPolitica.validarLongitudContraseña(tmpContraseña)) {
                Usuario encontrado = UsuarioDao.find(tmpUsuario);
                if (encontrado != null && encontrado.getContrasenia().equals(tmpContraseña)) {
                    if (UsuarioDao.esAdministrador(encontrado.getIdUsuario())) {
                        AdministradorSesion.setUsuarioActual(encontrado); //Admin
                        return 0;
                    } else {
                        AdministradorSesion.setUsuarioActual(encontrado); //Bedel
                        return 1;
                    }
                } else {
                    return 2;
                }
            } else {
                return 3;
            }
        } else {
            return 4;
        }
    }
}
