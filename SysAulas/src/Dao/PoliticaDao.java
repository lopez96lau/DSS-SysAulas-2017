/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.PoliticaContrasenias;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lucia
 */
public class PoliticaDao {
    private static Session sesion;
    

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        PoliticaDao.sesion = sesion;
    }

    public static PoliticaContrasenias find(Integer politicaID) {
        Transaction tx = null;
        PoliticaContrasenias politica = null;
        try {

            tx = sesion.beginTransaction();
            politica = (PoliticaContrasenias) sesion.load(PoliticaContrasenias.class, politicaID);
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return politica;
    }

}
