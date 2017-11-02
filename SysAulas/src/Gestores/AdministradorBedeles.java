/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.TurnoDao;
import Dao.UsuarioDao;
import db.model.Bedel;
import db.model.Turno;
import db.model.Usuario;

/**
 *
 * @author lucia
 */
public class AdministradorBedeles {

    public static Integer registrarBedel(String nombre, String apellido, Integer turnoID, String usuario, String contraseña, String contraseñaRepetir) {
        if (contraseña.equals(contraseñaRepetir)) {
            if (turnoID != 0) {
                if (UsuarioDao.find(usuario) == null) {
                    if (AdministradorPolitica.validarLongitudUsuario(usuario) && AdministradorPolitica.validarLongitudContraseña(contraseña)) {

                        Usuario nuevoUsuario = new Usuario(usuario, contraseña);
                        Turno turno = TurnoDao.find(turnoID);
                        Bedel nuevoBedel = new Bedel(turno, nuevoUsuario, nombre, apellido, null /*Set reservas*/);
                        UsuarioDao.crearBedel(nuevoUsuario, nuevoBedel);

                        return 0;
                    } else {
                        return 4;
                    }

                } else {
                    return 3;
                }
            } else {
                return 1;
            }
        } else {
            return 2;
        }
    }
}
