/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autopecas.persistencia;

import autopecas.logica.Produto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Ruan
 */
public class FonteDeDados {
    private AnnotationConfiguration config;
    private SessionFactory sessions;

    public FonteDeDados(){
        //configuraçoes do banco de dados
        config.addClass(Produto.class);
        config.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
	config.setProperty("hibernate.connection.driver_class", "org.h2.Driver");
	config.setProperty("hibernate.connection.url", "jdbc:h2:tcp://localhost:9092//AutoPecas");
	//o usuario coloquei nuli pra ficar padrao de todas as maquinas
        //por isso que quando criar o BD deixem os valores em banco
        config.setProperty("hibernate.connection.username", "");
	config.setProperty("hibernate.connection.password", "");
	config.setProperty("hibernate.connection.pool_size", "1");
        sessions = config.buildSessionFactory();
    }

    public void criarBanco() {
	//cria as tabela do banco de dados automaticamente
       SchemaExport criador = new SchemaExport(config);
       //Habilita impressao de comando SQL e força a criação do banco
        criador.create(true, true);
	}
    

}
