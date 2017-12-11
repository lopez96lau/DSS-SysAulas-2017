/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Fecha;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
 */
public class FechaDao {
    private static Session sesion;

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        FechaDao.sesion = sesion;
    }
    public static void crearFecha(Fecha nuevaFecha) {
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Integer fechaID = (Integer) sesion.save(nuevaFecha);
            nuevaFecha.setIdFecha(fechaID);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        /*finally {
                session.close(); 
                }*/
    }
    
    
    public static ArrayList<Fecha> findBetween(java.sql.Date fecha, Time hora, Integer duracion) {
        System.out.println("fecha: "+fecha);
        System.out.println("hora: "+hora);
        Calendar dateCal = Calendar.getInstance();
        dateCal.setTime(fecha);
        Calendar timeCal = Calendar.getInstance();
        timeCal.setTime(hora);
        dateCal.set(Calendar.HOUR_OF_DAY, timeCal.get(Calendar.HOUR_OF_DAY));
        dateCal.set(Calendar.MINUTE, timeCal.get(Calendar.MINUTE));
        dateCal.set(Calendar.SECOND, timeCal.get(Calendar.SECOND));
        Date inicio = dateCal.getTime();
        System.out.println("YoI: "+inicio);
        
        Date fin = new Date(inicio.getTime()+3600*duracion);
        System.out.println("YoF: "+fin);
        
        
        
        Transaction tx = null;
        List fechas = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            fechas = sesion.createQuery("FROM Fecha f").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        ArrayList<Fecha> rechazadas = new ArrayList<>();
        for(Object o: fechas) {
            Fecha f = (Fecha) o;
            Calendar dateFCal = Calendar.getInstance();
            dateFCal.setTime(f.getFecha());
            Calendar timeFCal = Calendar.getInstance();
            timeFCal.setTime(f.getHoraInicio());
            dateFCal.set(Calendar.HOUR_OF_DAY, timeFCal.get(Calendar.HOUR_OF_DAY));
            dateFCal.set(Calendar.MINUTE, timeFCal.get(Calendar.MINUTE));
            dateFCal.set(Calendar.SECOND, timeFCal.get(Calendar.SECOND));
            Date inicioF = dateFCal.getTime();

            
            Date finF = new Date(inicioF.getTime()+3600*f.getDuracion());
            
            System.out.println("I: "+inicioF);
            System.out.println("F: "+finF);
            if (!((fin.compareTo(inicioF) < 0) || (inicio.compareTo(finF) > 0))) {
                rechazadas.add(f);
            }
            
            /*if(fin.compareTo(inicioF) < 0) { //fin es menor a inicioF
                
            } else if(inicio.compareTo(finF) > 0) { //inicio es mayor a finF
                
            } else {
                //Otro...
            }*/
            
        }
        
        return rechazadas;
    }
    
}
