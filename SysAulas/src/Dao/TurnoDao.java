/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Turno;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
 */
public class TurnoDao {
    private static Session sesion;
    

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        TurnoDao.sesion = sesion;
    }

    public static Turno find(Integer turnoID) {
        Transaction tx = null;
        Turno turno = null;
        try {

            tx = sesion.beginTransaction();
            turno = (Turno) sesion.load(Turno.class, (int) turnoID);
            

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return turno;
    }
    
    
    public static ArrayList<String> findAllTurnos() {
        Transaction tx = null;
        List turnos = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            turnos = sesion.createQuery("FROM Turno").list();
            
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        if (turnos.isEmpty()) {
            return null;
        } else {
            ArrayList<String> t = new ArrayList<>();
            for (Object o : turnos) {
                t.add(((Turno) o).getNombreTurno());
            }
            return t;
        }
    }
}
