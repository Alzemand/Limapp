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

    @Override
    public void cadastrar(Object o) throws SQLException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("limappPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
    @Override
    public void alterar(Object o) throws SQLException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("limappPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
        em.close();
        emf.close();    
    }

    @Override
    public void excluir(Integer o) throws SQLException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("limappPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cliente c = em.find(Cliente.class, o);
        em.remove(c);
        em.getTransaction().commit();
        em.close();
    }
    @Override
    public List listarTodos() throws SQLException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("limappPU");
        EntityManager em = emf.createEntityManager();  
        TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
        List<Cliente> lista = query.getResultList();
     
        em.close();
        emf.close();
        
        return lista;
    }
}
    
    
                    
     
