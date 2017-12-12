/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Catedra;
import db.model.Docente;
import db.model.DocentePerteneceCatedra;
import db.model.DocentePerteneceCatedraId;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
 */
public class CatedraDao {
    private static Session sesion;
    

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        CatedraDao.sesion = sesion;
    }

    public static Catedra find(String nombreCatedra) {
        Transaction tx = null;
        List catedras = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            catedras = sesion.createQuery("FROM Catedra c WHERE c.nombreCatedra ='" + nombreCatedra+"'").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        if (catedras.size() == 1) {
            return (Catedra) catedras.get(0);
        } else {
            return null;
        }
    }
    
    public static ArrayList<Catedra> find(Docente doc) {
        Transaction tx = null;
        List catedrasIDs = new ArrayList<>();
        
        //ArrayList<Integer> idsValidas = new ArrayList<>();
        //List catedras = new ArrayList<>();
        ArrayList<Catedra> cat = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            catedrasIDs = sesion.createQuery("FROM DocentePerteneceCatedra dpc WHERE dpc.docente.idDocente ='" + doc.getIdDocente()+"'").list();
            
            for(Object o : catedrasIDs) {
                DocentePerteneceCatedra dpc = (DocentePerteneceCatedra) o;
                cat.add(dpc.getCatedra());
            }
            
            /*String ids = "";
            if (!idsValidas.isEmpty()) {
                for (Integer i: idsValidas) {
                    if (catedrasIDs.indexOf(i) == catedrasIDs.size()-1) {
                        ids += i+"";
                    } else {
                        ids += i+", ";
                    }
                }
                
                catedras = sesion.createQuery("FROM Catedra c WHERE c.idCatedra IN (" + ids+")").list();
                
            }*/
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        if (cat.isEmpty()) {
            return null;
        } else {
            /*ArrayList<Catedra> cat = new ArrayList<>();
            for (Object o : catedras) {
                cat.add((Catedra) o);
            }*/
            return cat;
        }
    }
}
