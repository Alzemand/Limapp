/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.daoEmpregado;
import java.sql.SQLException;
import java.util.List;
import model.Empregado;

/**
 *
 * @author edilson
 */
public class ControleEmpregado {
     dao.daoEmpregado daoEmpregado = new daoEmpregado();
    
    public void cadastrar(Empregado o) throws SQLException {
        daoEmpregado.cadastrar(o);
        
    }
    
    public void excluir (Integer o)  throws SQLException {
        daoEmpregado.excluir(o);
    
    }
    
    public void alterar(Empregado o) throws SQLException {
        daoEmpregado.alterar(o);
    
    }
     
    public List listarTodos() throws SQLException{
        return daoEmpregado.listarTodos();
    
    }
}
