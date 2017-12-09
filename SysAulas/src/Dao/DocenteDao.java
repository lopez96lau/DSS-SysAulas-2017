package Dao;

import db.model.Docente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luciano
 */
public class DocenteDao {
    private static Session sesion;
    

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        DocenteDao.sesion = sesion;
    }

    public static Docente find(String nombreDocente, String apellidoDocente) {
        Transaction tx = null;
        List docentes = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            docentes = sesion.createQuery("FROM Docente d WHERE d.nombreDocente ='" + nombreDocente+"' AND d.apellidoDocente='" + apellidoDocente+"'").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        if (docentes.size() == 1) {
            return (Docente) docentes.get(0);
        } else {
            return null;
        }
    }
}
