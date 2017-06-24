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
import model.Empregado;

/**
 *
 * @author edilson
 */
public class daoEmpregado implements IDAO {

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
        Empregado e = ConexaoDAO.getConnection().find(Empregado.class, o);
        ConexaoDAO.getConnection().remove(e);
        ConexaoDAO.getConnection().getTransaction().commit();

    }

    @Override
    public List listarTodos() throws SQLException {

        TypedQuery<Empregado> query = ConexaoDAO.getConnection().createQuery("SELECT e FROM Empregado e", Empregado.class);
        List<Empregado> lista = query.getResultList();
        return lista;
    }
}
    
    
                    
     
