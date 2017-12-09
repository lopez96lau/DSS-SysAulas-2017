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
    
    public static void crearDia(Dia nuevoDia) {
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Integer diaID = (Integer) sesion.save(nuevoDia);
            nuevoDia.setIdDia(diaID);
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
