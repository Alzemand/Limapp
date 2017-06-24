/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoServico;
import java.sql.SQLException;
import java.util.List;
import model.Servico;

/**
 *
 * @author edilson
 */
public class ControleServico {
     dao.DaoServico daoServico = new DaoServico();
    
    public void cadastrar(Servico o) throws SQLException {
        daoServico.cadastrar(o);
        
    }
    
    public void excluir (Integer o)  throws SQLException {
        daoServico.excluir(o);
    
    }
    
    public void alterar(Servico o) throws SQLException {
        daoServico.alterar(o);
    
    }
     
    public List listarTodos() throws SQLException{
        return daoServico.listarTodos();
    
    }
}
