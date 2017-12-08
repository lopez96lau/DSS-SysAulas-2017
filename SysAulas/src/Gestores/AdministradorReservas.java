/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.PeriodoDao;
import db.model.Periodo;

/**
 *
 * @author luciano
 */
public class AdministradorReservas {
    public static Periodo buscarPeriodo(Integer periodoID) {
        return PeriodoDao.find(periodoID);
    }
}
