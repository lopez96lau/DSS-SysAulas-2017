/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import db.model.Periodo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
 */
public class PeriodoDao {
    private static Session sesion;

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        PeriodoDao.sesion = sesion;
    }
    
    public static Periodo find(Integer periodoID) {
        Transaction tx = null;
        Periodo periodo = null;
        try {

            tx = sesion.beginTransaction();
            periodo = (Periodo) sesion.load(Periodo.class, (int) periodoID);
            

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return periodo;
    }
    
    
    public static ArrayList<String> findAllPeriodos() {
        Transaction tx = null;
        List periodos = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            periodos = sesion.createQuery("FROM Periodo").list();
            
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        if (periodos.isEmpty()) {
            return null;
        } else {
            ArrayList<String> pe = new ArrayList<>();
            for (Object o : periodos) {
                pe.add(((Periodo) o).getTipoPeriodo());
            }
            return pe;
        }
    }
}
