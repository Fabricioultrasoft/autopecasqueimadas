/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autopecas.persistencia;

import autopecas.logica.Produto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ruan
 */
public class ProdutoDao extends FonteDeDados {
    private SessionFactory sessions;
   // private Session sessao;


    public ProdutoDao(){
    
    }
    
    //SALVAR FILME ---------------------------------------------------------


    public void salvarProduto(Produto p){
        try{
           sessions = config.buildSessionFactory();
           Session session = sessions.openSession();
           Transaction tx = session.beginTransaction();
           session.save(p);
           tx.commit();
           session.close();
       } catch(Exception e){
           e.printStackTrace();
       }
    }
    public List<Produto> pesquisaProdutoDaoNome(String nome){
        sessions = config.buildSessionFactory();
        Session session =  sessions.openSession();
        Criteria crit=session.createCriteria(Produto.class);
         
        crit.add(Restrictions.ilike("nomeProduto", "%"+nome+"%"));
       
         return crit.list();
        }

    public List<Produto> pesquisaProdutoDaoFabricante(String fabricante){
        
        sessions = config.buildSessionFactory();
        Session session =  sessions.openSession();
        Criteria crit=session.createCriteria(Produto.class);

        crit.add(Restrictions.ilike("fabricanteProduto", fabricante));

         return crit.list();
        }
    }


