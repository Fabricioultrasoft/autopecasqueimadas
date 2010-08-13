/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cad_produto.java
 *
 * Created on 10/08/2010, 07:45:32
 */

package autopecas.visao;

import autopecas.logica.data;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Kelly
 */
public class Cad_produto extends javax.swing.JFrame {

    data mostra_data;//variavel que vai chamar os metodos da data e hora
    MaskFormatter formatoPreco, formatoCnpj, formatoCep, formatoFone, formatoData;
    /** Creates new form Cad_produto */
    public Cad_produto() {
        initComponents();

        mostra_data = new data();//objeto inicializado
        mostra_data.le_data();
        jLabel_data.setText(mostra_data.dia_semana + ", " +
                            mostra_data.dia + " de " +
                            mostra_data.mes + " de " +
                            mostra_data.ano);

        timer1.start();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jLabel_codigo = new javax.swing.JLabel();
        tf_cod_produto = new javax.swing.JTextField();
        jLabel_descricao = new javax.swing.JLabel();
        tf_descricao = new javax.swing.JTextField();
        jLabel_conteudo = new javax.swing.JLabel();
        cb_unidade = new javax.swing.JComboBox();
        jLabel_grupo = new javax.swing.JLabel();
        tf_grupo = new javax.swing.JTextField();
        tf_conteudo = new javax.swing.JTextField();
        jLabel_fabricante = new javax.swing.JLabel();
        tf_fabricante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_classificacao = new javax.swing.JTextField();
        jLabel_cod_forn = new javax.swing.JLabel();
        jLabel_fornecedor = new javax.swing.JLabel();
        tf_fornecedor = new javax.swing.JTextField();
        cb_cod_forn = new javax.swing.JComboBox();
        jLabel_dt_ultima_compra = new javax.swing.JLabel();
        try  {    formatoData = new MaskFormatter("##/##/####");  }  catch(Exception erro)  {      JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoData, erro = "+ erro);  }
        tf_dt_ult_compra = new JFormattedTextField(formatoData);
        jLabel_dt_ult_venda = new javax.swing.JLabel();
        try  {    formatoData = new MaskFormatter("##/##/####");  }  catch(Exception erro)  {      JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoData, erro = "+ erro);  }
        tf_dt_ult_venda = new JFormattedTextField(formatoData);
        jLabel_quant_estoq = new javax.swing.JLabel();
        tf_quant_estoq = new javax.swing.JTextField();
        botao_salvar = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        Botao_sair = new javax.swing.JButton();
        jButton_novo_reg = new javax.swing.JButton();
        jLabel_dt_cadastro = new javax.swing.JLabel();
        try  {    formatoData = new MaskFormatter("##/##/####");  }  catch(Exception erro)  {      JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoData, erro = "+ erro);  }
        tf_dt_cadastro = new JFormattedTextField(formatoData);
        jLabel_data = new javax.swing.JLabel();
        jLabel_hora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_sair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Auto Peças - Cadastro de Produtos");

        jLabel_codigo.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_codigo.setText("Código:");

        tf_cod_produto.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_descricao.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_descricao.setText("Descrição:");

        tf_descricao.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_conteudo.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_conteudo.setText("Conteúdo:");

        cb_unidade.setFont(new java.awt.Font("Arial", 0, 14));
        cb_unidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Centímetro", "Grama", "Litro", "Metro", "Metro Cúbico", "Metro Quadrado", "Miligrama", "Mililitro", "Milimetro", "Quilograma", "Unidade", "Centimetro", " " }));

        jLabel_grupo.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_grupo.setText("Grupo:");

        tf_grupo.setFont(new java.awt.Font("Arial", 0, 14));

        tf_conteudo.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_fabricante.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_fabricante.setText("Fabricante:");

        tf_fabricante.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel1.setText("Classificação:");

        tf_classificacao.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_cod_forn.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_cod_forn.setText("Cód. Fornecedor");

        jLabel_fornecedor.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_fornecedor.setText("Fornecedor:");

        tf_fornecedor.setFont(new java.awt.Font("Arial", 0, 14));

        cb_cod_forn.setFont(new java.awt.Font("Arial", 0, 14));
        cb_cod_forn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel_dt_ultima_compra.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_dt_ultima_compra.setText("Ultima Compra:");

        tf_dt_ult_compra.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_dt_ult_venda.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_dt_ult_venda.setText("Ultima Venda:");

        tf_dt_ult_venda.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_quant_estoq.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_quant_estoq.setText("Quant. em Estoque:");

        tf_quant_estoq.setFont(new java.awt.Font("Arial", 0, 14));

        botao_salvar.setFont(new java.awt.Font("Arial", 0, 12));
        botao_salvar.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Kelly\\Meus documentos\\NetBeansProjects\\Auto-Pecas\\imagens\\botoes\\GRAVAR2.jpg")); // NOI18N
        botao_salvar.setText("Salvar");
        botao_salvar.setToolTipText("");
        botao_salvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_salvar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botao_salvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botao_alterar.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Kelly\\Meus documentos\\NetBeansProjects\\Auto-Pecas\\imagens\\botoes\\alterar_dados.jpg")); // NOI18N
        botao_alterar.setText("Alterar Registro");
        botao_alterar.setToolTipText("");
        botao_alterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_alterar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botao_alterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botao_excluir.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Kelly\\Meus documentos\\NetBeansProjects\\Auto-Pecas\\imagens\\botoes\\EXCLUIR.jpg")); // NOI18N
        botao_excluir.setText("Excluir Registro");
        botao_excluir.setToolTipText("");
        botao_excluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_excluir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botao_excluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Botao_sair.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Kelly\\Meus documentos\\NetBeansProjects\\Auto-Pecas\\imagens\\botoes\\SAIR.jpg")); // NOI18N
        Botao_sair.setText("Sair");
        Botao_sair.setToolTipText("");
        Botao_sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Botao_sair.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Botao_sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Botao_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_sairActionPerformed(evt);
            }
        });

        jButton_novo_reg.setFont(new java.awt.Font("Arial", 0, 12));
        jButton_novo_reg.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Kelly\\Meus documentos\\NetBeansProjects\\Auto-Pecas\\imagens\\botoes\\novo_reg.gif")); // NOI18N
        jButton_novo_reg.setText("Novo Registro");
        jButton_novo_reg.setToolTipText("");
        jButton_novo_reg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_novo_reg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_novo_reg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_novo_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_novo_regActionPerformed(evt);
            }
        });

        jLabel_dt_cadastro.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_dt_cadastro.setText("Data do Cadastro:");

        tf_dt_cadastro.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_data.setText("data");

        jLabel_hora.setText("hora");

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 51));

        jMenu1.setBackground(new java.awt.Color(0, 204, 51));
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu_sair.setBackground(new java.awt.Color(0, 204, 51));
        jMenu_sair.setText("Sair");
        jMenu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel_codigo)
                                                .addGap(5, 5, 5)
                                                .addComponent(tf_cod_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel_grupo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tf_grupo)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel_descricao)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel_fabricante)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_fabricante))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_classificacao)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_conteudo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel_cod_forn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_cod_forn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel_quant_estoq)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_quant_estoq)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_fornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_fornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel_dt_cadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_dt_cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel_dt_ultima_compra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_dt_ult_compra, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel_dt_ult_venda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_dt_ult_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton_novo_reg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_data)
                            .addComponent(jLabel_hora))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_dt_ult_compra, tf_dt_ult_venda});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Botao_sair, botao_alterar, botao_excluir, botao_salvar, jButton_novo_reg});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cod_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_codigo)
                    .addComponent(jLabel_descricao)
                    .addComponent(tf_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_conteudo)
                    .addComponent(tf_conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_grupo)
                    .addComponent(tf_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_fabricante)
                    .addComponent(tf_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cod_forn)
                    .addComponent(jLabel_fornecedor)
                    .addComponent(tf_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_cod_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dt_ultima_compra)
                    .addComponent(tf_dt_ult_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_dt_ult_venda)
                    .addComponent(tf_dt_ult_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_dt_cadastro)
                    .addComponent(tf_dt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_quant_estoq)
                    .addComponent(tf_quant_estoq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botao_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_novo_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jLabel_data)
                .addGap(4, 4, 4)
                .addComponent(jLabel_hora))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_dt_ult_compra, tf_dt_ult_venda});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_sairMouseClicked
        // evento do menu sair
        dispose();
    }//GEN-LAST:event_jMenu_sairMouseClicked

    private void Botao_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_sairActionPerformed
        // evento do menu sair
        dispose();
    }//GEN-LAST:event_Botao_sairActionPerformed

    private void jButton_novo_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_novo_regActionPerformed
         // evento do botão novo/inserir
        tf_cod_produto.setText("");//limpa o campo código
        tf_descricao.setText("");//limpa o campo nome
        tf_conteudo.setText(""); //limpa o campo conteudo
        tf_grupo.setText("");
        tf_fabricante.setText("");
        tf_classificacao.setText("");
        tf_fornecedor.setText("");
        tf_dt_ult_compra.setText("");
        tf_dt_ult_venda.setText("");
        tf_quant_estoq.setText("");
       //instruções para inserir data atual ao novo registro
        Date data = new Date();
        String dia = ""+data.getDate();
        String mes = ""+String.valueOf(data.getMonth()+1);
        String ano = ""+(1900+data.getYear());
        if (Integer.parseInt(dia)<=9)
            dia = "0"+dia;
        if (Integer.parseInt(mes)<=9)
            mes = "0"+mes;
        tf_dt_cadastro.setText(dia+mes+ano);
        tf_descricao.requestFocus();//foca o cursor no campo descrição
        tf_cod_produto.setEditable(false);//deixa o campo código inativo
    }//GEN-LAST:event_jButton_novo_regActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
         // evento do timer1 que mostra os segundos
        mostra_data.le_hora();
        jLabel_hora.setText(mostra_data.hora);
    }//GEN-LAST:event_timer1OnTime


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_sair;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_salvar;
    private javax.swing.JComboBox cb_cod_forn;
    private javax.swing.JComboBox cb_unidade;
    private javax.swing.JButton jButton_novo_reg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_cod_forn;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_conteudo;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_descricao;
    private javax.swing.JLabel jLabel_dt_cadastro;
    private javax.swing.JLabel jLabel_dt_ult_venda;
    private javax.swing.JLabel jLabel_dt_ultima_compra;
    private javax.swing.JLabel jLabel_fabricante;
    private javax.swing.JLabel jLabel_fornecedor;
    private javax.swing.JLabel jLabel_grupo;
    private javax.swing.JLabel jLabel_hora;
    private javax.swing.JLabel jLabel_quant_estoq;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JTextField tf_classificacao;
    private javax.swing.JTextField tf_cod_produto;
    private javax.swing.JTextField tf_conteudo;
    private javax.swing.JTextField tf_descricao;
    private javax.swing.JTextField tf_dt_cadastro;
    private javax.swing.JTextField tf_dt_ult_compra;
    private javax.swing.JTextField tf_dt_ult_venda;
    private javax.swing.JTextField tf_fabricante;
    private javax.swing.JTextField tf_fornecedor;
    private javax.swing.JTextField tf_grupo;
    private javax.swing.JTextField tf_quant_estoq;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables

}
