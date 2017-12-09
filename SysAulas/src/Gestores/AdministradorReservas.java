/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.CatedraDao;
import Dao.DiaDao;
import Dao.DocenteDao;
import Dao.FechaDao;
import Dao.PeriodoDao;
import Dao.ReservaDao;
import Dao.UsuarioDao;
import db.model.Bedel;
import db.model.Catedra;
import db.model.Dia;
import db.model.Docente;
import db.model.Esporadica;
import db.model.Fecha;
import db.model.InformacionSolicitante;
import db.model.Periodo;

/**
 *
 * @author luciano
 */
public class AdministradorReservas {
    public static Periodo buscarPeriodo(Integer periodoID) {
        return PeriodoDao.find(periodoID);
    }

    public static Dia buscarDia(String nombre, String horaInicio) {
        return DiaDao.find(nombre, horaInicio);
    }

    public static void guardarReserva(Esporadica reservaEsporadica, InformacionSolicitante infoSolicitante) {
        Docente docente = DocenteDao.find(infoSolicitante.getNombre(), infoSolicitante.getApellido());
        Catedra cat = CatedraDao.find(infoSolicitante.getCatedra());
        if (cat != null && docente != null && AdministradorSesion.getUsuarioActual() != null) {
            reservaEsporadica.setBedel((Bedel) AdministradorSesion.getUsuarioActual());
            reservaEsporadica.setCatedra(cat);
            reservaEsporadica.setDocente(docente);
            ReservaDao.crearReserva(reservaEsporadica);
            for(Object o : reservaEsporadica.getFechas()) {
                Fecha f = (Fecha) o;
                f.setEsporadica(reservaEsporadica);
                DiaDao.crearDia(f.getDia());
                FechaDao.crearFecha(f);
            }
        } else {
            System.out.println("error");
        }
    }
    
    
}
