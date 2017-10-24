package db.model;
// Generated 24/10/2017 16:38:54 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Docente generated by hbm2java
 */
public class Docente  implements java.io.Serializable {


     private Integer idDocente;
     private String nombreDocente;
     private String apellidoDocente;
     private String emailDocente;
     private Set docentePerteneceCatedras = new HashSet(0);
     private Set reservas = new HashSet(0);

    public Docente() {
    }

    public Docente(String nombreDocente, String apellidoDocente, String emailDocente, Set docentePerteneceCatedras, Set reservas) {
       this.nombreDocente = nombreDocente;
       this.apellidoDocente = apellidoDocente;
       this.emailDocente = emailDocente;
       this.docentePerteneceCatedras = docentePerteneceCatedras;
       this.reservas = reservas;
    }
   
    public Integer getIdDocente() {
        return this.idDocente;
    }
    
    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }
    public String getNombreDocente() {
        return this.nombreDocente;
    }
    
    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }
    public String getApellidoDocente() {
        return this.apellidoDocente;
    }
    
    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }
    public String getEmailDocente() {
        return this.emailDocente;
    }
    
    public void setEmailDocente(String emailDocente) {
        this.emailDocente = emailDocente;
    }
    public Set getDocentePerteneceCatedras() {
        return this.docentePerteneceCatedras;
    }
    
    public void setDocentePerteneceCatedras(Set docentePerteneceCatedras) {
        this.docentePerteneceCatedras = docentePerteneceCatedras;
    }
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }




}


