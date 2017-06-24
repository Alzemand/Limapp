/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Cliente;

/**
 *
 * @author edilson
 */
public class daoCliente implements IDAO {

    public void CloseConnection() throws SQLException {
        ConexaoDAO.getConnection().close();
    }

    @Override
    public void cadastrar(Object o) throws SQLException {
        ConexaoDAO.getConnection().getTransaction().begin();
        ConexaoDAO.getConnection().persist(o);
        ConexaoDAO.getConnection().getTransaction().commit();

    }

    @Override
    public void alterar(Object o) throws SQLException {

        ConexaoDAO.getConnection().getTransaction().begin();
        ConexaoDAO.getConnection().merge(o);
        ConexaoDAO.getConnection().getTransaction().commit();

    }

    @Override
    public void excluir(Integer o) throws SQLException {

        ConexaoDAO.getConnection().getTransaction().begin();
        Cliente c = ConexaoDAO.getConnection().find(Cliente.class, o);
        ConexaoDAO.getConnection().remove(c);
        ConexaoDAO.getConnection().getTransaction().commit();

    }

    @Override
    public List listarTodos() throws SQLException {

        TypedQuery<Cliente> query = ConexaoDAO.getConnection().createQuery("SELECT c FROM Cliente c", Cliente.class);
        List<Cliente> lista = query.getResultList();
        return lista;
    }
}
    
    
                    
     
