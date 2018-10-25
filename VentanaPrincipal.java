
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author erick
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
      setIconImage(new ImageIcon(getClass().getResource("NC.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel4 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        login = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NeuroComplex");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(400, 310));
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(password);
        password.setBounds(220, 100, 150, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario2.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 50, 110, 140);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Login:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 60, 50, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 100, 70, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Elija una opción:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 140, 100, 15);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Análisis de Electroencefalograma", "Registros de Actividad eléctrica de R.N." }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 160, 230, 20);

        login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(login);
        login.setBounds(220, 60, 150, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 40, 410, 170);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 210, 10, 10);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Acceder");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(70, 20, 120, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Salir");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(240, 20, 120, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-10, 210, 410, 100);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Acceso al Sistema");
        jPanel5.add(jLabel1);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(-20, 0, 430, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if(login.getText().equals("")==true || password.getText().equals("")==true){
            JOptionPane.showMessageDialog(this, "Introduce un login y un password", "Error de Acceso al Sistema", JOptionPane.ERROR_MESSAGE);
         
        }
        else{
        VentanaAdministracion a =new VentanaAdministracion();
        a.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Sonido() throws LineUnavailableException, IOException, UnsupportedAudioFileException
		{
        Clip sonido=AudioSystem.getClip();
        sonido.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("CLICK.wav")));
        sonido.start();
		}
    public void Sonido2() throws LineUnavailableException, IOException, UnsupportedAudioFileException
		{
        Clip sonido=AudioSystem.getClip();
        sonido.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("LOGON.wav")));
        sonido.start();
		}
		public void Sonido3() throws LineUnavailableException, IOException, UnsupportedAudioFileException
		{
        Clip sonido=AudioSystem.getClip();
        sonido.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("windows.wav")));
        sonido.start();
		}
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
        System.exit(0);
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            public void run() {
                
                new VentanaPrincipal().setVisible(true);
            
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}