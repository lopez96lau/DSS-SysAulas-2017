/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.model;

import java.util.ArrayList;

/**
 *
 * @author luciano
 */
public class InfoAulasDisponibles {
    private Fecha fecha;
    private ArrayList<Aula> opcionesAulas = new ArrayList<>();

    public InfoAulasDisponibles(Fecha fecha) {
        this.fecha = fecha;
    }

    
    
    
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Aula> getOpcionesAulas() {
        return opcionesAulas;
    }

    public void setOpcionesAulas(ArrayList<Aula> opcionesAulas) {
        this.opcionesAulas = opcionesAulas;
    }
    
    public void addOpcionAulas(Aula opcionAulas) {
        this.opcionesAulas.add(opcionAulas);
    }
}
