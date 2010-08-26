/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autopecas.logica;

import autopecas.persistencia.ProdutoDao;

/**
 *
 * @author Ruan
 */
public class ProdutoFacade {
    
    
    public ProdutoFacade(){
    //FonteDeDados dados = new FonteDeDados();
    //dados.criarBanco();

    }
    public void criarProduto(Produto p){
    ProdutoDao dao = new ProdutoDao();
    dao.salvarProduto(p);
        
       
    }
    public void pesquisaProdutoFacade(Produto p){
       // Produto dao = new ProdutoDao();


    }

}
