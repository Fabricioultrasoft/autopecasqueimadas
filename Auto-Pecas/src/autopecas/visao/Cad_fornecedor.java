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
public class Cad_fornecedor extends javax.swing.JFrame {

    data mostra_data;//variavel que vai chamar os metodos da data e hora
    MaskFormatter formatoCnpj, formatoCep, formatoFone, formatoData;
    /** Creates new form Cad_produto */
    public Cad_fornecedor() {
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
        tf_cod_forn = new javax.swing.JTextField();
        jLabel_razao_social = new javax.swing.JLabel();
        tf_razao_social = new javax.swing.JTextField();
        jLabel_cgc_cnpj = new javax.swing.JLabel();
        jLabel_insc_estadual = new javax.swing.JLabel();
        try  {      formatoCnpj = new MaskFormatter("###.###.###.###");    }    catch(Exception erro)  {        JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoCnpj, erro = "+ erro);  }
        tf_insc_estadual = new JFormattedTextField(formatoCnpj);
        try  {    
            formatoCnpj = new MaskFormatter("##.###.###/####-##");  
        }  
        catch(Exception erro)  {     
            JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoCnpj, erro = "+ erro);  }
        tf_cgc_cnpj = new JFormattedTextField(formatoCnpj);
        jLabel_numero = new javax.swing.JLabel();
        tf_numero = new javax.swing.JTextField();
        Label_logradouro = new javax.swing.JLabel();
        tf_logradouro = new javax.swing.JTextField();
        jLabel_bairro = new javax.swing.JLabel();
        jLabel_nome_fantasia = new javax.swing.JLabel();
        tf_nome_fantasia = new javax.swing.JTextField();
        cb_uf = new javax.swing.JComboBox();
        jLabel_uf = new javax.swing.JLabel();
        try  {    formatoFone = new MaskFormatter("(0xx##)####-####");  }  catch(Exception erro)  {      JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoFone, erro = "+ erro);  }
        tf_contato2 = new JFormattedTextField(formatoFone);
        jLabel_contato1 = new javax.swing.JLabel();
        try  {    
     formatoFone = new MaskFormatter("(0xx##)####-####");  
     }  catch(Exception erro)  {      
     JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoFone, erro = "+ erro);  }
        tf_contato1 = new JFormattedTextField(formatoFone);
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
        tf_bairro = new javax.swing.JTextField();
        jLabel_cidade = new javax.swing.JLabel();
        tf_cidade = new javax.swing.JTextField();
        jLabel_contato2 = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        try  {      formatoCep = new MaskFormatter("##.###-###");    }    catch(Exception erro)  {        JOptionPane.showMessageDialog(null, "Não foi possível setar a máscara em formatoCep, erro = "+ erro);  }
        jTextField1 = new JFormattedTextField(formatoCep);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_sair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        jLabel_codigo.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_codigo.setText("Código:");

        tf_cod_forn.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_razao_social.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_razao_social.setText("Razão Social:");

        tf_razao_social.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_cgc_cnpj.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_cgc_cnpj.setText("CGC/CNPJ:");

        jLabel_insc_estadual.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_insc_estadual.setText("Insc. Est");

        tf_insc_estadual.setFont(new java.awt.Font("Arial", 0, 14));

        tf_cgc_cnpj.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_numero.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_numero.setText("Nº");

        tf_numero.setFont(new java.awt.Font("Arial", 0, 14));

        Label_logradouro.setFont(new java.awt.Font("Arial", 0, 14));
        Label_logradouro.setText("Logradouro:");

        tf_logradouro.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_bairro.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_bairro.setText("Bairro:");

        jLabel_nome_fantasia.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_nome_fantasia.setText("Nome Fantasia:");

        tf_nome_fantasia.setFont(new java.awt.Font("Arial", 0, 14));

        cb_uf.setFont(new java.awt.Font("Arial", 0, 14));
        cb_uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" }));

        jLabel_uf.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_uf.setText("UF:");

        tf_contato2.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_contato1.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_contato1.setText("Contato I:");

        tf_contato1.setFont(new java.awt.Font("Arial", 0, 14));

        botao_salvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botao_salvar.setText("Salvar");
        botao_salvar.setToolTipText("");
        botao_salvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_salvar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botao_salvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botao_alterar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botao_alterar.setText("Alterar Registro");
        botao_alterar.setToolTipText("");
        botao_alterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_alterar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botao_alterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botao_excluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botao_excluir.setText("Excluir Registro");
        botao_excluir.setToolTipText("");
        botao_excluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botao_excluir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botao_excluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Botao_sair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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

        jButton_novo_reg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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

        tf_bairro.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_cidade.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_cidade.setText("Cidade:");

        tf_cidade.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel_contato2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_contato2.setText("Contato II:");

        jLabel_email.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_email.setText("E-mail:");

        tf_email.setFont(new java.awt.Font("Arial", 0, 14));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel1.setText("CEP:");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14));

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_data)
                            .addComponent(jLabel_hora))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_dt_cadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_dt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel_cidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_cidade))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel_contato1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_contato1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(jLabel_contato2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_contato2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_uf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_email)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_logradouro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_numero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_nome_fantasia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_nome_fantasia)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel_cgc_cnpj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_cgc_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel_insc_estadual)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_insc_estadual, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_bairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(144, 144, 144))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_codigo)
                .addGap(5, 5, 5)
                .addComponent(tf_cod_forn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_razao_social)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_razao_social, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(398, 398, 398))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton_novo_reg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botao_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Botao_sair, botao_alterar, botao_excluir, botao_salvar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_contato1, tf_contato2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_cod_forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_codigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_razao_social)
                    .addComponent(tf_razao_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cgc_cnpj)
                    .addComponent(tf_cgc_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nome_fantasia)
                    .addComponent(tf_nome_fantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_insc_estadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_insc_estadual))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_logradouro)
                    .addComponent(tf_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_numero)
                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bairro)
                    .addComponent(tf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cidade)
                    .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_uf)
                    .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_contato1)
                    .addComponent(tf_contato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_contato2)
                    .addComponent(tf_contato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_email)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dt_cadastro)
                    .addComponent(tf_dt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Botao_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_novo_reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96)
                .addComponent(jLabel_data)
                .addGap(4, 4, 4)
                .addComponent(jLabel_hora))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_contato1, tf_contato2});

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-808)/2, (screenSize.height-634)/2, 808, 634);
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
        tf_cod_forn.setText("");//limpa o campo código
        tf_razao_social.setText("");//limpa o campo nome
        tf_cgc_cnpj.setText(""); //limpa o campo conteudo
        tf_nome_fantasia.setText("");
        tf_insc_estadual.setText("");
        tf_logradouro.setText("");
        tf_numero.setText("");
        tf_bairro.setText("");
        tf_cidade.setText("");
        cb_uf.setSelectedItem("AC");
        tf_contato2.setText("");
        tf_contato1.setText("");
        tf_email.setText("");
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
        tf_razao_social.requestFocus();//foca o cursor no campo razao social
        tf_cod_forn.setEditable(false);//deixa o campo código inativo
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
                new Cad_fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_sair;
    private javax.swing.JLabel Label_logradouro;
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_salvar;
    private javax.swing.JComboBox cb_uf;
    private javax.swing.JButton jButton_novo_reg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_bairro;
    private javax.swing.JLabel jLabel_cgc_cnpj;
    private javax.swing.JLabel jLabel_cidade;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_contato1;
    private javax.swing.JLabel jLabel_contato2;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_dt_cadastro;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_hora;
    private javax.swing.JLabel jLabel_insc_estadual;
    private javax.swing.JLabel jLabel_nome_fantasia;
    private javax.swing.JLabel jLabel_numero;
    private javax.swing.JLabel jLabel_razao_social;
    private javax.swing.JLabel jLabel_uf;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tf_bairro;
    private javax.swing.JTextField tf_cgc_cnpj;
    private javax.swing.JTextField tf_cidade;
    private javax.swing.JTextField tf_cod_forn;
    private javax.swing.JTextField tf_contato1;
    private javax.swing.JTextField tf_contato2;
    private javax.swing.JTextField tf_dt_cadastro;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_insc_estadual;
    private javax.swing.JTextField tf_logradouro;
    private javax.swing.JTextField tf_nome_fantasia;
    private javax.swing.JTextField tf_numero;
    private javax.swing.JTextField tf_razao_social;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables

}
