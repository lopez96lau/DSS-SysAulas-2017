/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.model;

/**
 *
 * @author lucia
 */
public class InformacionSolicitante {
    String nombre,apellido,catedra,contacto,tipoAula;
    Integer periodoID;

    public InformacionSolicitante(String nombre, String apellido, String catedra, String contacto, String tipoAula, Integer periodoID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.catedra = catedra;
        this.contacto = contacto;
        this.tipoAula = tipoAula;
        this.periodoID = periodoID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCatedra() {
        return catedra;
    }

    public String getContacto() {
        return contacto;
    }

    public String getTipoAula() {
        return tipoAula;
    }

    public Integer getPeriodoID() {
        return periodoID;
    }

    
}
