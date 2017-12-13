/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Bedel;
import db.model.HistorialContrasenias;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
 */
public class HistorialContraseniasDao {
    private static Session sesion;
    

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        HistorialContraseniasDao.sesion = sesion;
    }
    
    public static void crearHistorial(HistorialContrasenias h) {
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Integer historialNuevo = (Integer) sesion.save(h);
            h.setIdCambio(historialNuevo);
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
    
    
    public static ArrayList<HistorialContrasenias> find(Integer usuarioID) {
        Transaction tx = null;
        List historiales = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            historiales = sesion.createQuery("FROM HistorialContrasenias hc WHERE hc.usuario.idUsuario="+usuarioID+"").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        ArrayList<HistorialContrasenias> retorno = new ArrayList<>();
        for (Object o : historiales) {
            retorno.add((HistorialContrasenias) o);
            
        }
        return retorno;
    }
}
