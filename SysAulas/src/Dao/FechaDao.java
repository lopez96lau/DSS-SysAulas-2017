/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

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
}
