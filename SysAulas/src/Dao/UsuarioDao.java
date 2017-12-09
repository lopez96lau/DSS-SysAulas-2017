/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import db.model.Administrador;
import db.model.Bedel;
import db.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luciano
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
    
    
    public static ArrayList<Bedel> findConApellido(String apellido) {
        Transaction tx = null;
        List bedeles = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            bedeles = sesion.createQuery("FROM Bedel b WHERE b.apellidoBedel ='" + apellido+"'").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        ArrayList<Bedel> lista = new ArrayList<>();
        
        for(Integer i=0; i<bedeles.size(); i++) {
            lista.add((Bedel) bedeles.get(i));
        }
        
        return lista;
    }
    
    
    public static ArrayList<Bedel> findConTurno(Integer idTurno) {
        Transaction tx = null;
        List bedeles = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            bedeles = sesion.createQuery("FROM Bedel b WHERE b.turno.idTurno ='" + idTurno+"'").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        ArrayList<Bedel> lista = new ArrayList<>();
        
        for(Integer i=0; i<bedeles.size(); i++) {
            lista.add((Bedel) bedeles.get(i));
        }
        
        return lista;
    }

    public static void crearBedel(Bedel nuevoBedel) {
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            //Usuario nuevoUsuario = new Usuario(nuevoBedel.getNombreUsuario(), nuevoBedel.getContrasenia());
            //Integer usuarioID = (Integer) sesion.save(nuevoUsuario);
            //nuevoUsuario.setIdUsuario(usuarioID);
            Integer bedelID = (Integer) sesion.save(nuevoBedel);
            nuevoBedel.setIdUsuario(bedelID);
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
    
    
    public static void guardarBedel(Bedel bedel) {
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            sesion.update(bedel);
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
            System.out.print(idUsuario);
            administradores = sesion.createQuery("FROM "+Administrador.class.getName()+" a WHERE a.idUsuario="+idUsuario).list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return (administradores.size() == 1);
    }

    /*public static Bedel findBedel(Integer idUsuario) {
        Transaction tx = null;
        List bedeles = new ArrayList<>();
        try {
            tx = sesion.beginTransaction();
            bedeles = sesion.createQuery("FROM Bedel b WHERE b.idUsuario =" + idUsuario).list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        
        if (bedeles.size() == 1) {
            return (Bedel) bedeles.get(0);
        } else {
            return null;
        }
    }*/
}
