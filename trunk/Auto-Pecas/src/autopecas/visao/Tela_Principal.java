/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tela_Principal.java
 *
 * Created on 09/08/2010, 16:23:05
 */

package autopecas.visao;

/**
 *
 * @author Kelly
 */
public class Tela_Principal extends javax.swing.JFrame {
    data mostra_data;//variavel que vai chamar os metodos da data e hora
    /** Creates new form Tela_Principal */
    public Tela_Principal() {
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
        jPanel1 = new javax.swing.JPanel();
        jButton_produtos = new javax.swing.JButton();
        jButton_sair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel_hora = new javax.swing.JLabel();
        jLabel_data = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_cadastros = new javax.swing.JMenu();
        jMenuItem_cad_produtos = new javax.swing.JMenuItem();
        jMenuItem_clientes = new javax.swing.JMenuItem();
        jMenu_sair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Peças");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton_produtos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton_produtos.setText("Entrada de Material");

        jButton_sair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton_sair.setText("Sair");
        jButton_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sairActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Vendas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_sair, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton_produtos});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_sair)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton_produtos, jButton_sair});

        jLabel_hora.setText("hora");

        jLabel_data.setText("data");

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 51));

        jMenu_cadastros.setBackground(new java.awt.Color(0, 204, 0));
        jMenu_cadastros.setText("Cadastros");

        jMenuItem_cad_produtos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem_cad_produtos.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Kelly\\Meus documentos\\NetBeansProjects\\Auto-Pecas\\imagens\\botoes\\produto.gif")); // NOI18N
        jMenuItem_cad_produtos.setText("Cadastro de Produtos");
        jMenuItem_cad_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem_cad_produtosMousePressed(evt);
            }
        });
        jMenu_cadastros.add(jMenuItem_cad_produtos);

        jMenuItem_clientes.setFont(new java.awt.Font("Arial", 0, 14));
        jMenuItem_clientes.setIcon(new javax.swing.ImageIcon("C:\\Documents and Settings\\Kelly\\Meus documentos\\NetBeansProjects\\Auto-Pecas\\imagens\\botoes\\cliente.gif")); // NOI18N
        jMenuItem_clientes.setText("Cadastro de Clientes");
        jMenu_cadastros.add(jMenuItem_clientes);

        jMenuBar1.add(jMenu_cadastros);

        jMenu_sair.setBackground(new java.awt.Color(0, 204, 0));
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_data)
                    .addComponent(jLabel_hora))
                .addContainerGap(603, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(536, Short.MAX_VALUE)
                .addComponent(jLabel_data)
                .addGap(4, 4, 4)
                .addComponent(jLabel_hora)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-808)/2, (screenSize.height-634)/2, 808, 634);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_sairMouseClicked
        // Evento do menu_sair
        System.exit(0);
    }//GEN-LAST:event_jMenu_sairMouseClicked

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        // TODO add your handling code here:
        mostra_data.le_hora();
        jLabel_hora.setText(mostra_data.hora);
    }//GEN-LAST:event_timer1OnTime

    private void jButton_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sairActionPerformed
        // Evento do botão sair
        System.exit(0);
}//GEN-LAST:event_jButton_sairActionPerformed

    private void jMenuItem_cad_produtosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_cad_produtosMousePressed
        //evento do menuItem_cad_produtos
        new Cad_produto().show();
    }//GEN-LAST:event_jMenuItem_cad_produtosMousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_produtos;
    private javax.swing.JButton jButton_sair;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_hora;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_cad_produtos;
    private javax.swing.JMenuItem jMenuItem_clientes;
    private javax.swing.JMenu jMenu_cadastros;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JPanel jPanel1;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables

}