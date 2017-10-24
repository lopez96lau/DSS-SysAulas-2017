package db.model;
// Generated 24/10/2017 16:38:54 by Hibernate Tools 4.3.1



/**
 * AulaAsociaFecha generated by hbm2java
 */
public class AulaAsociaFecha  implements java.io.Serializable {


     private int idFecha;
     private Aula aula;
     private Fecha fecha;

    public AulaAsociaFecha() {
    }

	
    public AulaAsociaFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public AulaAsociaFecha(Aula aula, Fecha fecha) {
       this.aula = aula;
       this.fecha = fecha;
    }
   
    public int getIdFecha() {
        return this.idFecha;
    }
    
    public void setIdFecha(int idFecha) {
        this.idFecha = idFecha;
    }
    public Aula getAula() {
        return this.aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public Fecha getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }




}


