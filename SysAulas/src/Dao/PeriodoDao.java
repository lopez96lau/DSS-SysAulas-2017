/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import db.model.Periodo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lucia
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
}
