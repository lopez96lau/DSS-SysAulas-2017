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
import db.model.Catedra;
import db.model.Dia;
import db.model.Docente;
import db.model.Esporadica;
import db.model.Fecha;
import db.model.InformacionSolicitante;
import db.model.Periodica;
import db.model.Periodo;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luciano
 */
public class AdministradorReservas {
    public static Periodo buscarPeriodo(Integer periodoID) {
        return PeriodoDao.find(periodoID);
    }

    public static void guardarEsporadica(Esporadica reservaEsporadica, InformacionSolicitante infoSolicitante) {
        if (AdministradorSesion.getUsuarioActual() != null) {
            ReservaDao.crearEsporadica(reservaEsporadica);
            for(Object o : reservaEsporadica.getFechas()) {
                Fecha f = (Fecha) o;
                DiaDao.crearDia(f.getDia());
                FechaDao.crearFecha(f);
            }
        } /*else {
            System.out.println("error");
        }*/
    }
    
    public static void guardarPeriodica(Periodica reservaPeriodica, InformacionSolicitante infoSolicitante) {
        if (AdministradorSesion.getUsuarioActual() != null) {
            ReservaDao.crearPeriodica(reservaPeriodica);
            
            for(Object o : reservaPeriodica.getDias()) {
                Dia d = (Dia) o;
                d.setPeriodica(reservaPeriodica);
                DiaDao.crearDia(d);
                for(Object ob : d.getFechas()) {
                    Fecha f = (Fecha) ob;
                    FechaDao.crearFecha(f);
                }
            }
        } /*else {
            System.out.println("error");
        }*/
    }
    
    public static Dia generarDiaYFechas(Periodo periodo, String nombreDia, String horaInicioText, int duracionIndex) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate inicio = null;
        if (periodo.getFechaInicio().compareTo(new Date()) < 0 && periodo.getFechaFin().compareTo(new Date()) > 0) {
            java.sql.Date hoy = new java.sql.Date((new Date()).getTime());
            inicio = hoy.toLocalDate();
        } else {
            inicio = ((java.sql.Date) periodo.getFechaInicio()).toLocalDate();
        }
        
        
        
        //LocalDate inicio = ((java.sql.Date) periodo.getFechaInicio()).toLocalDate();
        LocalDate fin = ((java.sql.Date) periodo.getFechaFin()).toLocalDate();

        List<LocalDate> totalDates = new ArrayList<>();
        
        
        LocalDate dia = null;
        switch(nombreDia) {
            case "Lunes": dia = inicio.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
                break;
            case "Martes": dia = inicio.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
                break;
            case "Miercoles": dia = inicio.with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
                break;
            case "Jueves": dia = inicio.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
                break;
            case "Viernes": dia = inicio.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
                break;
        }
        
        while (!dia.isAfter(fin)) {
            totalDates.add(dia);
            dia = dia.plusWeeks(1);
        }

        Dia nuevoDia = new Dia();
        nuevoDia.setNombreDia(nombreDia);

        for(LocalDate ld: totalDates) {
            java.sql.Date date = java.sql.Date.valueOf(ld); 
            String str = ld.format(formatter)+ " " + horaInicioText;
            //System.out.println(str);
            //java.sql.Date date = format.parse(str);
            long ms = format.parse(str).getTime();
            Time time = new Time(ms);
            //System.out.println(time);
            Fecha nuevaFecha = new Fecha();
            nuevaFecha.setDia(nuevoDia);
            nuevaFecha.setFecha(date);
            nuevaFecha.setHoraInicio(time);
            //500+500*(x-1) --> x=3 --> 500+500*2 = 1500
            nuevaFecha.setDuracion(500+500*(duracionIndex-1));
            nuevoDia.addFecha(nuevaFecha);
        }
        return nuevoDia;
    }
    
    public static ArrayList<Docente> getAllDocentes() {
        return DocenteDao.getAllDocentes();
    }
    public static ArrayList<Catedra> getAllCatedrasDeDocente(Docente d) {
        return CatedraDao.find(d);
    }

    public static ArrayList<String> getAllPeriodos() {
        return PeriodoDao.findAllPeriodos();
    }
}
