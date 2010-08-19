/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autopecas.persistencia;

import autopecas.logica.Produto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ruan
 */
public class ProdutoDao extends FonteDeDados {
    private SessionFactory sessions;


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

}
