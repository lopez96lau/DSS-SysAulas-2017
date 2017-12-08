/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Dia;
import db.model.Fecha;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
 */
public class DiaDao {
    private static Session sesion;

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        DiaDao.sesion = sesion;
    }

    public static Dia find(String nombre, String horaInicio) {

        Transaction tx = null;
        List fechas = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            fechas = sesion.createQuery("FROM Fecha f WHERE f.horaInicio ='" + horaInicio+":00' AND f.dia.nombreDia ='" + nombre+"'").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        if (fechas.size() > 0) {
            return ((Fecha) fechas.get(0)).getDia();
        } else {
            return null;
        }
    }
    
}
