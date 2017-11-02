/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Bedel;
import db.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lucia
 */
public class UsuarioDao {

    private static Session sesion;

    public static Session getSesion() {
        return sesion;
    }

    public static void setSesion(Session sesion) {
        UsuarioDao.sesion = sesion;
    }

    public static Usuario find(String nombreUsuario) {
        Transaction tx = null;
        List usuarios = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            usuarios = sesion.createQuery("FROM Usuario u WHERE u.nombreUsuario ='" + nombreUsuario.toLowerCase()+"'").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        if (usuarios.size() == 1) {
            return (Usuario) usuarios.get(0);
        } else {
            return null;
        }
    }

    public static void crearBedel(Usuario nuevoUsuario, Bedel nuevoBedel) {
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Integer usuarioID = (Integer) sesion.save(nuevoUsuario);
            nuevoUsuario.setIdUsuario(usuarioID);
            Integer bedelID = (Integer) sesion.save(nuevoBedel);
            nuevoBedel.setIdBedel(bedelID);

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

    public static Boolean esAdministrador(Integer idUsuario) {
        Transaction tx = null;
        List administradores = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            administradores = sesion.createQuery("FROM Administrador WHERE id_usuario=" + idUsuario).list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return (administradores.size() == 1);
    }

}
