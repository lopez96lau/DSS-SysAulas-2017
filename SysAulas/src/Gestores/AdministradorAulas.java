/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.AulaDao;
import Dao.FechaDao;
import db.model.Aula;
import db.model.Dia;
import db.model.Esporadica;
import db.model.Fecha;
import db.model.InfoAulasDisponibles;
import db.model.Informatica;
import db.model.Multimedios;
import db.model.Periodica;
import db.model.SinRecursos;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.hibernate.Hibernate;

/**
 *
 * @author luciano
 */
public class AdministradorAulas {
    public static ArrayList<InfoAulasDisponibles> obtenerAulas(Periodica nuevaReserva, String tipoAula) {
        
        ArrayList<InfoAulasDisponibles> opciones = new ArrayList<>();
        
        ArrayList<Fecha> fechas = new ArrayList<>();
        for (Object o : nuevaReserva.getDias()) {
            Dia d = (Dia) o;
            fechas.addAll(d.getFechas());
            
            for (Fecha f : fechas) {
                HashSet<Integer> rechazadas = new HashSet<>();
                //System.out.println("-------------------------------------------------------------------------");
                //System.out.println((java.sql.Date) f.getFecha());
                //System.out.println("-------------------------------------------------------------------------");
                
                ArrayList<Fecha> fechasRechazadas = FechaDao.findBetween((java.sql.Date) f.getFecha(), (Time) f.getHoraInicio(), f.getDuracion());
                for(Fecha fec : fechasRechazadas) {
                    rechazadas.add(fec.getAula().getIdAula());
                }
                
                //System.out.println(rechazadas);

                ArrayList<Integer> rechazadasAux = new ArrayList<>();
                rechazadasAux.addAll(rechazadas);
                
                ArrayList<Aula> aulas = AulaDao.findComplemento(rechazadasAux);
                //System.out.println(aulas);
                
                ArrayList<Aula> quitar = new ArrayList<>();
                if (!aulas.isEmpty()) {
                    for(Aula a : aulas) {
                        //System.out.print(a.getIdAula());
                        if (a.getCapacidad() < nuevaReserva.getCantidadAlumnos()) {
                            quitar.add(a);
                            //System.out.println(" borrado(1)");
                        }
                        switch(tipoAula) {
                            case "multi":
                                if (!(Hibernate.getClass(a) == Multimedios.class)) {
                                    quitar.add(a);//System.out.println(" borrado(2)");
                                }
                                break;
                            case "info":
                                if (!(Hibernate.getClass(a) == Informatica.class)) {
                                    quitar.add(a);//System.out.println(" borrado(3)");
                                }
                                break;
                            case "sinrec":
                                if (!(Hibernate.getClass(a) == SinRecursos.class)) {
                                    quitar.add(a);//System.out.println(" borrado(4)");
                                }
                                break;
                        }
                    }
                    for(Aula a : quitar) {
                        aulas.remove(a);
                    }
                    if (aulas.size() >= 2) {
                        Collections.sort(aulas, new Comparator<Aula>() {
                            public int compare(Aula a1, Aula a2){
                               return a1.getCapacidad() - a2.getCapacidad();
                            }
                        });
                    }

                    //System.out.println(rechazadas);

                    ArrayList<Aula> ultimasTres = new ArrayList<>();
                    if (aulas.size() >= 1) { ultimasTres.add(aulas.get(0)); };
                    if (aulas.size() >= 2) { ultimasTres.add(aulas.get(1)); };
                    if (aulas.size() >= 3) { ultimasTres.add(aulas.get(2)); };
                    InfoAulasDisponibles iAD = new InfoAulasDisponibles(f);
                    iAD.setOpcionesAulas(ultimasTres);
                    opciones.add(iAD);
                } else {
                    ArrayList<Aula> ultimasTres = new ArrayList<>();
                    InfoAulasDisponibles iAD = new InfoAulasDisponibles(f);
                    iAD.setOpcionesAulas(ultimasTres);
                    opciones.add(iAD);
                }
            }
            fechas = new ArrayList<>();
        }
        
        return opciones;
    }

    public static ArrayList<InfoAulasDisponibles> obtenerAulas(Esporadica nuevaReserva, String tipoAula) {
        
        ArrayList<InfoAulasDisponibles> opciones = new ArrayList<>();
        
        ArrayList<Fecha> fechas = new ArrayList<>();
        fechas.addAll(nuevaReserva.getFechas());

        for (Fecha f : fechas) {
            HashSet<Integer> rechazadas = new HashSet<>();
            //System.out.println("-------------------------------------------------------------------------");
            //System.out.println((java.sql.Date) f.getFecha());
            //System.out.println("-------------------------------------------------------------------------");
            
            ArrayList<Fecha> fechasRechazadas = FechaDao.findBetween((java.sql.Date) f.getFecha(), (Time) f.getHoraInicio(), f.getDuracion());
            for(Fecha fec : fechasRechazadas) {
                rechazadas.add(fec.getAula().getIdAula());
            }
                
            //System.out.println(rechazadas);

            ArrayList<Integer> rechazadasAux = new ArrayList<>();
            rechazadasAux.addAll(rechazadas);

            ArrayList<Aula> aulas = AulaDao.findComplemento(rechazadasAux);
            //System.out.println(aulas);
            if (!aulas.isEmpty()) {
                ArrayList<Aula> quitar = new ArrayList<>();
                for(Aula a : aulas) {
                    //System.out.print(a.getIdAula());
                    if (a.getCapacidad() < nuevaReserva.getCantidadAlumnos()) {
                        quitar.add(a);
                        //System.out.println(" borrado(1)");
                    }
                    switch(tipoAula) {
                        case "multi":
                            if (!(Hibernate.getClass(a) == Multimedios.class)) {
                                quitar.add(a);//System.out.println(" borrado(2)");
                            }
                            break;
                        case "info":
                            if (!(Hibernate.getClass(a) == Informatica.class)) {
                                quitar.add(a);//System.out.println(" borrado(3)");
                            }
                            break;
                        case "sinrec":
                            if (!(Hibernate.getClass(a) == SinRecursos.class)) {
                                quitar.add(a);//System.out.println(" borrado(4)");
                            }
                            break;
                    }
                }
                for(Aula a : quitar) {
                    aulas.remove(a);
                }

                if (aulas.size() >= 2) {
                    Collections.sort(aulas, new Comparator<Aula>() {
                        public int compare(Aula a1, Aula a2){
                           return a1.getCapacidad() - a2.getCapacidad();
                        }
                    });
                }
                //System.out.println(rechazadas);
                ArrayList<Aula> ultimasTres = new ArrayList<>();
                if (aulas.size() >= 1) { ultimasTres.add(aulas.get(0)); };
                if (aulas.size() >= 2) { ultimasTres.add(aulas.get(1)); };
                if (aulas.size() >= 3) { ultimasTres.add(aulas.get(2)); };
                InfoAulasDisponibles iAD = new InfoAulasDisponibles(f);
                iAD.setOpcionesAulas(ultimasTres);
                opciones.add(iAD);
            } else {
                ArrayList<Aula> ultimasTres = new ArrayList<>();
                InfoAulasDisponibles iAD = new InfoAulasDisponibles(f);
                iAD.setOpcionesAulas(ultimasTres);
                opciones.add(iAD);
            }
        }
        return opciones;
    }
    
    public static Multimedios deproxyMultimedios(Aula a) {
        return AulaDao.unProxyToClass(a, Multimedios.class);
    }
    public static Informatica deproxyInformatica(Aula a) {
        return AulaDao.unProxyToClass(a, Informatica.class);
    }
    public static SinRecursos deproxySinRecursos(Aula a) {
        return AulaDao.unProxyToClass(a, SinRecursos.class);
    }
    
    
}
