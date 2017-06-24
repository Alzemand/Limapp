/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoFuncao;
import java.sql.SQLException;
import java.util.List;
import model.Funcao;

/**
 *
 * @author edilson
 */
public class ControleFuncao {
     dao.DaoFuncao daoFuncao = new DaoFuncao();
    
    public void cadastrar(Funcao o) throws SQLException {
        daoFuncao.cadastrar(o);
        
    }
    
    public void excluir (Integer o)  throws SQLException {
        daoFuncao.excluir(o);
    
    }
    
    public void alterar(Funcao o) throws SQLException {
        daoFuncao.alterar(o);
    
    }
     
    public List listar() throws SQLException{
        return daoFuncao.listarTodos();
    
    }
}
