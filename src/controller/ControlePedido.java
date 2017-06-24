/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.daoPedido;
import java.sql.SQLException;
import java.util.List;
import model.Pedido;

/**
 *
 * @author edilson
 */
public class ControlePedido {
     dao.daoPedido daoPedido = new daoPedido();
    
    public void cadastrar(Pedido o) throws SQLException {
        daoPedido.cadastrar(o);
        
    }
    
    public void excluir (Integer o)  throws SQLException {
        daoPedido.excluir(o);
    
    }
    
    public void alterar(Pedido o) throws SQLException {
        daoPedido.alterar(o);
    
    }
     
    public List listarTodos() throws SQLException{
        return daoPedido.listarTodos();
    
    }
}
