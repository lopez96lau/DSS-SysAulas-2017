/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Aula;
import db.model.Fecha;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.proxy.HibernateProxy;

/**
 *
 * @author luciano
 */
public class AulaDao {
    private static Session sesion;

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        AulaDao.sesion = sesion;
    }
    
    public static ArrayList<Aula> findComplemento(ArrayList<Integer> rechazadas) {
        Transaction tx = null;
        List aulas = new ArrayList<>();
        String ids = "";
        if (!rechazadas.isEmpty()) {
            for (Integer i: rechazadas) {
                if (rechazadas.indexOf(i) == rechazadas.size()-1) {
                    ids += i+"";
                } else {
                    ids += i+", ";
                }
            }
        }
        try {
            tx = sesion.beginTransaction();
            if (!rechazadas.isEmpty()) {
                aulas = sesion.createQuery("FROM Aula a WHERE a.idAula NOT IN(" + ids+")").list();
            } else {
                aulas = sesion.createQuery("FROM Aula").list();
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        ArrayList<Aula> retorno = new ArrayList<>();
        for (Object o : aulas) {
            retorno.add((Aula) o);
            
        }
        return retorno;
    }
    
    @SuppressWarnings("unchecked")
	public static <T> T unProxy(T entity) {
		if (entity instanceof HibernateProxy) {
	        entity =  (T) ((HibernateProxy) entity).getHibernateLazyInitializer()
	                .getImplementation();
	    } 
		
		return entity;
	}
	
	/**
	 * Transforms a hibernate proxy object to the desired clazz, if possible.  <br />
	 * For when the entity is an instance of clazz. 
	 * 
	 * @param entity
	 * @param clazz
	 * @return entity cast to clazz
	 */
	@SuppressWarnings("unchecked")
	public static <T, Y> Y unProxyToClass(T entity, Class<Y> clazz) {
		return (Y) AulaDao.unProxy(entity);
	}
}
