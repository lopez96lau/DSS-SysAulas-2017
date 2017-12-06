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
    
    
    public static Boolean validarLongitudContraseña(String contraseña) {
        PoliticaContrasenias politicaActual = PoliticaDao.find(politicaActualID);
        Integer limiteSuperior = Integer.parseInt(politicaActual.getTipoPolitica().split("-")[1]);
        Integer limiteInferior = Integer.parseInt(politicaActual.getTipoPolitica().split("-")[0]);
        return(contraseña.length() <= limiteSuperior && contraseña.length() >= limiteInferior);
    }
    
    public static Boolean validarLongitudUsuario(String usuario) {
        PoliticaContrasenias politicaActual = PoliticaDao.find(politicaActualID);
        Integer limiteSuperior = Integer.parseInt(politicaActual.getTipoPolitica().split("-")[3]);
        Integer limiteInferior = Integer.parseInt(politicaActual.getTipoPolitica().split("-")[2]);
        return(usuario.length() <= limiteSuperior && usuario.length() >= limiteInferior);
    }
    
    
    public static PoliticaContrasenias getPolitica() {
        return PoliticaDao.find(politicaActualID);
    }
}
