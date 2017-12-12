/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.PoliticaDao;
import db.model.PoliticaContrasenias;

/**
 *
 * @author lucia
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
        
        return(contraseña.length() <= limiteSuperior && contraseña.length() >= limiteInferior && !tieneInvalidos);
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
