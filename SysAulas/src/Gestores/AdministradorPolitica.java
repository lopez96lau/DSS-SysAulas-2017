/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.HistorialContraseniasDao;
import Dao.PoliticaDao;
import db.model.HistorialContrasenias;
import db.model.PoliticaContrasenias;
import db.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author luciano
 */
public class AdministradorPolitica {
    private static final Integer politicaActualID = 1;
    
    
    public static Boolean validarContraseña(String contraseña) {
        PoliticaContrasenias politicaActual = PoliticaDao.find(politicaActualID);
        Integer limiteSuperior = Integer.parseInt(politicaActual.getTipoPolitica().split("-")[1]);
        Integer limiteInferior = Integer.parseInt(politicaActual.getTipoPolitica().split("-")[0]);
        
        String caracteresInvalidos = politicaActual.getTipoPolitica().split("-")[4];
        boolean tieneInvalidos = false;
        int i = 0;
        while (tieneInvalidos == false && i < caracteresInvalidos.length()) {
            if (contraseña.contains(String.valueOf(caracteresInvalidos.charAt(i)))) {
                tieneInvalidos = true;
            }
            i++;
        }
        
        boolean valida = true;
        String tieneUnaMayus = politicaActual.getTipoPolitica().split("-")[5];
        if (tieneUnaMayus.equals("s")) {
            if (contraseña.equals(contraseña.toLowerCase())) {
                valida = false;
            }
        }
        System.out.println("tieneUnaMayus "+valida);
        String tieneUnDigito = politicaActual.getTipoPolitica().split("-")[6];
        if (tieneUnDigito.equals("s")) {
            if (!contraseña.matches(".*\\d+.*")) {
                valida = false;
            }
        }
        System.out.println("tieneUnDigito "+valida);
        
        return(contraseña.length() <= limiteSuperior && contraseña.length() >= limiteInferior && !tieneInvalidos && valida);
    }
    
    public static Boolean validarContraConHistorial(String contraseña, Usuario usuario) {
        PoliticaContrasenias politicaActual = PoliticaDao.find(politicaActualID);
        Boolean valida = true;
        String puedeSerIgualAAnterior = politicaActual.getTipoPolitica().split("-")[7];
        
        if (puedeSerIgualAAnterior.equals("n")) {
            System.out.println("Historiales "+usuario.getHistorialContraseniases());
            ArrayList<HistorialContrasenias> historiales = HistorialContraseniasDao.find(usuario.getIdUsuario());
        
            for(HistorialContrasenias hc : historiales) {
                
                if (contraseña.equals(hc.getContraseniaNueva())) {
                    valida = false;
                }
            }
            if (usuario.getContrasenia().equals(contraseña)) {
                valida = false;
            }
        }
        System.out.println(valida);
        
        return (valida);
    }
    
    public static Boolean validarUsuario(String usuario) {
        PoliticaContrasenias politicaActual = PoliticaDao.find(politicaActualID);
        Integer limiteSuperior = Integer.parseInt(politicaActual.getTipoPolitica().split("-")[3]);
        Integer limiteInferior = Integer.parseInt(politicaActual.getTipoPolitica().split("-")[2]);
        
        
        String caracteresInvalidos = politicaActual.getTipoPolitica().split("-")[4];
        //System.out.println(caracteresInvalidos);
        boolean tieneInvalidos = false;
        int i = 0;
        while (tieneInvalidos == false && i < caracteresInvalidos.length()) {
            if (usuario.contains(String.valueOf(caracteresInvalidos.charAt(i)))) {
                tieneInvalidos = true;
            }
            i++;
        }
        
        return(usuario.length() <= limiteSuperior && usuario.length() >= limiteInferior && !tieneInvalidos);
    }
    
    
    public static PoliticaContrasenias getPolitica() {
        return PoliticaDao.find(politicaActualID);
    }
}
