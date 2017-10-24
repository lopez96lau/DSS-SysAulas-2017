package db.model;
// Generated 24/10/2017 16:38:54 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Turno generated by hbm2java
 */
public class Turno  implements java.io.Serializable {


     private Integer idTurno;
     private String nombreTurno;
     private Set bedels = new HashSet(0);

    public Turno() {
    }

	
    public Turno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }
    public Turno(String nombreTurno, Set bedels) {
       this.nombreTurno = nombreTurno;
       this.bedels = bedels;
    }
   
    public Integer getIdTurno() {
        return this.idTurno;
    }
    
    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }
    public String getNombreTurno() {
        return this.nombreTurno;
    }
    
    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }
    public Set getBedels() {
        return this.bedels;
    }
    
    public void setBedels(Set bedels) {
        this.bedels = bedels;
    }




}


