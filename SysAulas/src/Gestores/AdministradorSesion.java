/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.ReservaDao;
import Dao.UsuarioDao;
import db.model.Bedel;
import db.model.Esporadica;
import db.model.Usuario;

/**
 *
 * @author luciano
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
        if (AdministradorPolitica.validarUsuario(tmpUsuario)) {
            if (AdministradorPolitica.validarContraseña(tmpContraseña)) {
                Usuario encontrado = UsuarioDao.find(tmpUsuario);
                if (encontrado != null && encontrado.getContrasenia().equals(tmpContraseña)) {
                    if (UsuarioDao.esAdministrador(encontrado.getIdUsuario())) {
                        AdministradorSesion.setUsuarioActual(encontrado); //Admin
                        return 0;
                    } else {
                        AdministradorSesion.setUsuarioActual(encontrado); //Bedel
                        /*System.out.println(UsuarioDao.findBedel( AdministradorSesion.getUsuarioActual().getIdUsuario() ));
                        Esporadica reservaEsporadica = new Esporadica();
                        reservaEsporadica.setBedel((Bedel) AdministradorSesion.getUsuarioActual());
                        reservaEsporadica.setCatedra(null);
                        reservaEsporadica.setDocente(null);
                        ReservaDao.crearReserva(reservaEsporadica);*/
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
