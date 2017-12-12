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
    String contacto,tipoAula;
    Integer periodoID;

    public InformacionSolicitante(String contacto, String tipoAula, Integer periodoID) {
        this.contacto = contacto;
        this.tipoAula = tipoAula;
        this.periodoID = periodoID;
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
