/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on 13/08/2010, 09:52:38
 */

package autopecas.visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Kelly
 */
public class Login extends javax.swing.JFrame {
    private int Login;

    /** Creates new form Login */
    public Login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_usuario = new javax.swing.JLabel();
        jLabel_senha = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        tf_senha = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jButton_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Auto Peças - Login");

        jLabel_usuario.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_usuario.setText("Usuário:");

        jLabel_senha.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel_senha.setText("Senha:");

        jButton_login.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_login.setText("Login");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        jButton_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_loginKeyPressed(evt);
            }
        });

        jButton_sair.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_sair.setText("Sair");
        jButton_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton_login)
                        .addGap(36, 36, 36)
                        .addComponent(jButton_sair))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_senha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tf_senha, tf_usuario});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel_senha, jLabel_usuario});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_login, jButton_sair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_usuario)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_senha)
                    .addComponent(tf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_login)
                    .addComponent(jButton_sair))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf_senha, tf_usuario});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel_senha, jLabel_usuario});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_login, jButton_sair});

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-395)/2, (screenSize.height-178)/2, 395, 178);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sairActionPerformed
        // Evento do botão sair
        System.exit(0);
    }//GEN-LAST:event_jButton_sairActionPerformed

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // evento do botao login
        String login = "caitano", senha = "123";
        String login2 = "ruan", senha2 = "1234";
        String login3 = "robson", senha3 = "12345";
        try{
           switch (Login){
            case 0: login.equals(tf_usuario.getText());new Tela_Principal().show();dispose();
            case 1: senha.equals(tf_senha.getText()); new Tela_Principal().show();dispose();
            case 2: login2.equals(tf_usuario.getText());new Tela_Principal().show();dispose();
            case 3: senha2.equals(tf_senha.getText()); new Tela_Principal().show();dispose();
            case 4: login.equals(tf_usuario.getText());new Tela_Principal().show();dispose();
            case 5: senha.equals(tf_senha.getText()); new Tela_Principal().show();dispose();
        }

        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar fazer login! Erro:"+erro);
        }
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_loginKeyPressed
         // evento do botao login om o teclado
        String login = "caitano", senha = "123";
        String login2 = "ruan", senha2 = "1234";
        String login3 = "robson", senha3 = "12345";
        try{
           switch (Login){
            case 0: login.equals(tf_usuario.getText());new Tela_Principal().show();dispose();
            case 1: senha.equals(tf_senha.getText()); new Tela_Principal().show();dispose();
            case 2: login2.equals(tf_usuario.getText());new Tela_Principal().show();dispose();
            case 3: senha2.equals(tf_senha.getText()); new Tela_Principal().show();dispose();
            case 4: login.equals(tf_usuario.getText());new Tela_Principal().show();dispose();
            case 5: senha.equals(tf_senha.getText()); new Tela_Principal().show();dispose();
        }

        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao tentar fazer login! Erro:"+erro);
        }
    }//GEN-LAST:event_jButton_loginKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_sair;
    private javax.swing.JLabel jLabel_senha;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPasswordField tf_senha;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables

}

