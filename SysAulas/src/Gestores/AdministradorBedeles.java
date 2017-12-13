/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.HistorialContraseniasDao;
import Dao.TurnoDao;
import Dao.UsuarioDao;
import db.model.Bedel;
import db.model.HistorialContrasenias;
import db.model.Turno;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author luciano
 */
public class AdministradorBedeles {
    
    private static ArrayList<Bedel> bedeles = new ArrayList<>();

    public static Integer registrarBedel(String nombre, String apellido, Integer turnoID, String usuario, String contraseña, String contraseñaRepetir) {
        if (contraseña.equals(contraseñaRepetir)) {
            if (turnoID != 0) {
                if (UsuarioDao.find(usuario) == null) {
                    if (AdministradorPolitica.validarUsuario(usuario) && AdministradorPolitica.validarContraseña(contraseña)) {
                        Turno turno = TurnoDao.find(turnoID);
                        Bedel nuevoBedel = new Bedel(turno, usuario, contraseña, nombre, apellido);
                        UsuarioDao.crearBedel(nuevoBedel);
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
    
    public static void buscarBedelPorApellido(String apellido) {
        bedeles = UsuarioDao.findConApellido(apellido);
    }

    public static ArrayList<Bedel> getBedeles() {
        return bedeles;
    }
    
    public static Integer getTamañoBedeles() {
        return bedeles.size();
    }
    
    public static Bedel getBedel(Integer i) {
        return bedeles.get(i);
    }

    public static void buscarBedelPorTurno(Integer idTurno) {
        bedeles = UsuarioDao.findConTurno(idTurno);
    }

    public static Boolean modificarBedel(Integer indice, String nombre, String apellido, Integer idTurno, String contraseña) {
        if (!contraseña.isEmpty()) {
            Bedel modificado = bedeles.get(indice);
            if (AdministradorPolitica.validarContraseña(contraseña) && AdministradorPolitica.validarContraConHistorial(contraseña, modificado)) {  
                Turno nuevoTurno = TurnoDao.find(idTurno);
                
                modificado.setNombreBedel(nombre);
                modificado.setApellidoBedel(apellido);
                modificado.setTurno(nuevoTurno);
                
                HistorialContrasenias nuevoHistorial = new HistorialContrasenias(AdministradorPolitica.getPolitica(), modificado);
                nuevoHistorial.setContraseniaNueva(contraseña);
                nuevoHistorial.setFechaCambio(new Date());

                modificado.addHistorial(nuevoHistorial);
                modificado.setContrasenia(contraseña);

                HistorialContraseniasDao.crearHistorial(nuevoHistorial);

                UsuarioDao.actualizarBedel(modificado);
                return true;
            } else {
                return false;
            }
        } else {
            Turno nuevoTurno = TurnoDao.find(idTurno);
            Bedel modificado = bedeles.get(indice);
            modificado.setNombreBedel(nombre);
            modificado.setApellidoBedel(apellido);
            modificado.setTurno(nuevoTurno);

            UsuarioDao.actualizarBedel(modificado);
            return true;
        }
    }
    
    public static ArrayList<String> getAllTurnos() {
        return TurnoDao.findAllTurnos();
    }

    public static void buscarBedelPorTurnoYApellido(String text, int selectedIndex) {
        bedeles = new ArrayList<>();
        ArrayList<Bedel> bedels = UsuarioDao.findConApellido(text);
        for (Bedel b : bedels) {
            if (b.getTurno().getIdTurno() == selectedIndex) {
                bedeles.add(b);
            }
        }
    }
}
