/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Esporadica;
import db.model.Periodica;
import db.model.Reserva;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
 */
public class ReservaDao {
    
    private static Session sesion;

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        ReservaDao.sesion = sesion;
    }
    
    public static void crearReserva(Periodica nuevaReserva) {
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Integer reservaID = (Integer) sesion.save(nuevaReserva);
            nuevaReserva.setIdReserva(reservaID);
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
    public static void crearReserva(Esporadica nuevaReserva) {
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Integer reservaID = (Integer) sesion.save(nuevaReserva);
            nuevaReserva.setIdReserva(reservaID);
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
}
