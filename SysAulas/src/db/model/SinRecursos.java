package db.model;
// Generated 24/10/2017 16:38:54 by Hibernate Tools 4.3.1



/**
 * SinRecursos generated by hbm2java
 */
public class SinRecursos  implements java.io.Serializable {


     private int idAula;
     private Aula aula;
     private String ventiladores;

    public SinRecursos() {
    }

	
    public SinRecursos(Aula aula) {
        this.aula = aula;
    }
    public SinRecursos(Aula aula, String ventiladores) {
       this.aula = aula;
       this.ventiladores = ventiladores;
    }
   
    public int getIdAula() {
        return this.idAula;
    }
    
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }
    public Aula getAula() {
        return this.aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public String getVentiladores() {
        return this.ventiladores;
    }
    
    public void setVentiladores(String ventiladores) {
        this.ventiladores = ventiladores;
    }




}


