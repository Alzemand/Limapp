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
import model.Funcao;

/**
 *
 * @author edilson
 */
public class daoFuncao implements IDAO {

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
        Funcao f = ConexaoDAO.getConnection().find(Funcao.class, o);
        ConexaoDAO.getConnection().remove(f);
        ConexaoDAO.getConnection().getTransaction().commit();

    }

    @Override
    public List listarTodos() throws SQLException {

        TypedQuery<Funcao> query = ConexaoDAO.getConnection().createQuery("SELECT f FROM Funcao f", Funcao.class);
        List<Funcao> lista = query.getResultList();
        return lista;
    }
}
    
    
                    
     
