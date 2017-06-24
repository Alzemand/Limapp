/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author edilson
 */
public class ConexaoDAO {

    private static EntityManager jpaconexao = null;

    private ConexaoDAO() throws SQLException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("limappPU");
        ConexaoDAO.jpaconexao = emf.createEntityManager();
    }

    public static EntityManager getConnection() throws SQLException {
        if (ConexaoDAO.jpaconexao == null) {
            new ConexaoDAO();
            return ConexaoDAO.jpaconexao;
        } else {
            return ConexaoDAO.jpaconexao;
        }
    }
}
