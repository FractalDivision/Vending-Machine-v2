/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpackage;

import javax.swing.*;
import static projectpackage.StockFrame.*;

public class Project extends javax.swing.JFrame {

    public static int phonestockiphone = 0; //declares phone1stock as a variable
    public static int phonestocksamsung = 0; //declares phone2stock as a variable
    public static int phonestocnokia = 0; //declares phone3stock as a variable
    public static int phonestockhuewai = 0;
    public static int phonecash10 = 0;
    public static int phonecash20 = 0;
    public static int phonecash50 = 0;
    public static int phonecash100 = 0;
    public static int moneyinserted = 0;
    public static int totalcash = 0;
    

    public Project() {
        initComponents();

    }

    Project(String phonestockiphone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Project(int phonestockiphone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1Samsung = new javax.swing.JButton();
        jButton2Iphone = new javax.swing.JButton();
        jButton3Nokia = new javax.swing.JButton();
        jButton4Huewei = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jButton6Stock = new javax.swing.JButton();
        jButton610 = new javax.swing.JButton();
        jButton720 = new javax.swing.JButton();
        jButton850 = new javax.swing.JButton();
        jButton9100 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1Selected = new javax.swing.JTextArea();
        jButton1Clear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1CurrentCash = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel8MachineCash = new javax.swing.JLabel();
        jTextField1CurrentMachineCash = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1InsertCash = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField110 = new javax.swing.JTextField();
        jTextField120 = new javax.swing.JTextField();
        jTextField350 = new javax.swing.JTextField();
        jTextField4100 = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phone Vending Machine");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1Samsung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectpackage/rsz_logo-samsung.png"))); // NOI18N
        jButton1Samsung.setText("Samsung Galaxy (500$)");
        jButton1Samsung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SamsungActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Samsung);
        jButton1Samsung.setBounds(0, 140, 320, 116);

        jButton2Iphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectpackage/rsz_apple-logo-png-5a37e212dfda183311147015136117949169.jpg"))); // NOI18N
        jButton2Iphone.setText("Iphone  3 (500$)");
        jButton2Iphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2IphoneMouseClicked(evt);
            }
        });
        jButton2Iphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2IphoneActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Iphone);
        jButton2Iphone.setBounds(0, 60, 370, 90);

        jButton3Nokia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectpackage/rsz_nokia_wordmarksvg.png"))); // NOI18N
        jButton3Nokia.setText("Nokia 3301 (500$)");
        jButton3Nokia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3NokiaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Nokia);
        jButton3Nokia.setBounds(0, 250, 270, 80);

        jButton4Huewei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectpackage/rsz_kisspng-logo-huawei-169126-network-2311cxh-bc2mfgec-sm212-huawei-logo-vector-ai-svg-eps-pdf-free-graphic-5ba376489e54b75526720415374393046485.jpg"))); // NOI18N
        jButton4Huewei.setText("Huewai 3609 (500$)");
        jButton4Huewei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4HueweiActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4Huewei);
        jButton4Huewei.setBounds(0, 330, 270, 90);

        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 530, 300, 32);

        jTextPane1.setEditable(false);
        jTextPane1.setText("Please choose the phone you wish to buy then hit confirm");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 0, 360, 30);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(140, 0, 10, 10);

        jButton6Stock.setText("Restock");
        jButton6Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6StockActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6Stock);
        jButton6Stock.setBounds(0, 500, 300, 32);

        jButton610.setText("10$");
        buttonGroup1.add(jButton610);
        jButton610.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton610ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton610);
        jButton610.setBounds(470, 320, 51, 32);

        jButton720.setText("20$");
        buttonGroup1.add(jButton720);
        jButton720.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton720ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton720);
        jButton720.setBounds(530, 320, 51, 32);

        jButton850.setText("50$");
        buttonGroup1.add(jButton850);
        jButton850.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton850ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton850);
        jButton850.setBounds(600, 320, 51, 32);

        jButton9100.setText("100$");
        buttonGroup1.add(jButton9100);
        jButton9100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9100ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9100);
        jButton9100.setBounds(660, 320, 58, 32);

        jLabel6.setText("You have currently selected....");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 60, 200, 20);

        jTextArea1Selected.setEditable(false);
        jTextArea1Selected.setColumns(20);
        jTextArea1Selected.setRows(5);
        jScrollPane4.setViewportView(jTextArea1Selected);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(460, 90, 310, 120);

        jButton1Clear.setText("Clear");
        jButton1Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Clear);
        jButton1Clear.setBounds(730, 320, 60, 32);

        jButton2.setText("Clear Selected");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 530, 260, 32);

        jLabel7.setText("Current cash:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 210, 77, 20);

        jTextArea1CurrentCash.setEditable(false);
        jTextArea1CurrentCash.setColumns(20);
        jTextArea1CurrentCash.setRows(5);
        jScrollPane2.setViewportView(jTextArea1CurrentCash);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(460, 240, 310, 40);

        jLabel5.setText("Current Machine Cash:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 360, 180, 16);

        jLabel8MachineCash.setText("               ");
        getContentPane().add(jLabel8MachineCash);
        jLabel8MachineCash.setBounds(790, 450, 80, 16);

        jTextField1CurrentMachineCash.setEditable(false);
        jTextField1CurrentMachineCash.setText("$ 0.00");
        jTextField1CurrentMachineCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1CurrentMachineCashActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1CurrentMachineCash);
        jTextField1CurrentMachineCash.setBounds(600, 380, 230, 24);

        jLabel8.setText("Please insert the following cash:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(600, 420, 230, 16);

        jTextField1InsertCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1InsertCashActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1InsertCash);
        jTextField1InsertCash.setBounds(600, 440, 230, 30);

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 500, 250, 32);

        jTextField110.setText("0");
        getContentPane().add(jTextField110);
        jTextField110.setBounds(470, 290, 40, 24);

        jTextField120.setText("0");
        getContentPane().add(jTextField120);
        jTextField120.setBounds(530, 290, 40, 24);

        jTextField350.setText("0");
        getContentPane().add(jTextField350);
        jTextField350.setBounds(600, 290, 40, 24);

        jTextField4100.setText("0");
        getContentPane().add(jTextField4100);
        jTextField4100.setBounds(660, 290, 50, 24);

        setBounds(0, 0, 942, 604);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SamsungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SamsungActionPerformed
        jTextArea1Selected.append("\n Samsung (500$)  " + phonestocksamsung);
           jTextField1InsertCash.setText("$500");

        if (phonestocksamsung <= 0){
            JOptionPane.showMessageDialog(null, "This is not in stock ");
            
        }else if (phonestocksamsung >= 1){
            phonestocksamsung--;
            JOptionPane.showMessageDialog(null, "You have selected Samsung ,\n Please insert 500$"  +phonestocksamsung);
        }
    }//GEN-LAST:event_jButton1SamsungActionPerformed

    private void jButton6StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6StockActionPerformed
        StockFrame stockframe = new StockFrame();
        stockframe.setVisible(true);


    }//GEN-LAST:event_jButton6StockActionPerformed

    private void jButton2IphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2IphoneActionPerformed
        jTextArea1Selected.append("\n Iphone (500$) only " + phonestockiphone + " Left");
                jTextField1InsertCash.setText("$500");

        if (phonestockiphone <= 0){
            JOptionPane.showMessageDialog(null, "This is not in stock ");
            
        }else if (phonestockiphone >= 1){
            phonestockiphone--;
            JOptionPane.showMessageDialog(null, "You have selected Iphone ,\n Please insert 500$"  +phonestockiphone);
            
        }
     
    }//GEN-LAST:event_jButton2IphoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1Selected.setText(null); //sets the text to null
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3NokiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3NokiaActionPerformed
        jTextArea1Selected.append("\n Nokia (500$)  " + phonestocnokia);
           jTextField1InsertCash.setText("$500");

        if (phonestocnokia <= 0){
            JOptionPane.showMessageDialog(null, "This is not in stock ");
            
        }else if (phonestocnokia >= 1){
            phonestocnokia--;
            JOptionPane.showMessageDialog(null, "You have selected Nokia ,\n Please insert 500$"  +phonestocnokia);
        }
    }//GEN-LAST:event_jButton3NokiaActionPerformed

    private void jButton4HueweiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4HueweiActionPerformed
        jTextArea1Selected.append("\n Huewei (500$)  " + phonestockhuewai);
              jTextField1InsertCash.setText("$500");

        if (phonestockhuewai <= 0){
            JOptionPane.showMessageDialog(null, "This is not in stock ");
            
        }else if (phonestockhuewai >= 1){
            phonestockhuewai--;
            JOptionPane.showMessageDialog(null, "You have selected Huewai ,\n Please insert 500$"  +phonestockhuewai);
        }
    }//GEN-LAST:event_jButton4HueweiActionPerformed

    private void jButton610ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton610ActionPerformed
        
        
        phonecash10++;
        moneyinserted+=10;
        jTextField110.setText(" " +phonecash10);
        jTextArea1CurrentCash.append("\n Your current cash is: $ " + phonecash10); //change to money inserted
        jTextArea1CurrentCash.setText("$" + moneyinserted);
    }//GEN-LAST:event_jButton610ActionPerformed

    private void jButton1ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ClearActionPerformed
        jTextArea1CurrentCash.setText(null);           //Makes the text fields blank
          jTextField110.setText(null);  
          jTextField120.setText(null);  
          jTextField350.setText(null);  
          jTextField4100.setText(null);  
        
    }//GEN-LAST:event_jButton1ClearActionPerformed

    private void jButton720ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton720ActionPerformed
        phonecash20++;
        moneyinserted+=20;
        jTextField120.setText(" " +phonecash20);
        jTextArea1CurrentCash.append("\n Your current cash is: 20$ " + phonecash20);
        jTextArea1CurrentCash.setText("$" + moneyinserted);


    }//GEN-LAST:event_jButton720ActionPerformed

    private void jButton850ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton850ActionPerformed
        
        phonecash50++;
        moneyinserted+=50;
        jTextField350.setText(" " +phonecash50);
        jTextArea1CurrentCash.append("\n Your current cash is: 50$ " + phonecash50);
        jTextArea1CurrentCash.setText("$" + moneyinserted);

    }//GEN-LAST:event_jButton850ActionPerformed

    private void jButton9100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9100ActionPerformed
        
        phonecash100++;     //increments the phonecash etc
        moneyinserted+=100;
        jTextField4100.setText(" "+phonecash100);
        jTextArea1CurrentCash.append("\n Your current cash is: 100$ " + phonecash100);
        jTextArea1CurrentCash.setText("$" + moneyinserted);

    }//GEN-LAST:event_jButton9100ActionPerformed

    private void jButton2IphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2IphoneMouseClicked

    }//GEN-LAST:event_jButton2IphoneMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField110.setText(phonecash10+"");
        jTextField120.setText(phonecash20+"");
        jTextField350.setText(phonecash50+"");
        jTextField4100.setText(phonecash100+"");
        
        jTextField1CurrentMachineCash.setText("€"+projectpackage.StockFrame.currentcash); //imports the stockframe package to use here
    }//GEN-LAST:event_formWindowActivated

    private void jTextField1CurrentMachineCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1CurrentMachineCashActionPerformed
    }//GEN-LAST:event_jTextField1CurrentMachineCashActionPerformed
   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false); //does not display the jframe
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1InsertCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1InsertCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1InsertCashActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
    if(moneyinserted >= 500){           //Outputs enjoy your new phone/not enough money if the conditions are met
    
            JOptionPane.showMessageDialog(null, "Enjoy your new phone \n Your change is "+currentcash);
            
        }else if (moneyinserted <= 499){
            JOptionPane.showMessageDialog(null, "Not enough money");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Clear;
    private javax.swing.JButton jButton1Samsung;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton2Iphone;
    private javax.swing.JButton jButton3Nokia;
    private javax.swing.JButton jButton4Huewei;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton610;
    private javax.swing.JButton jButton6Stock;
    private javax.swing.JButton jButton720;
    private javax.swing.JButton jButton850;
    private javax.swing.JButton jButton9100;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8MachineCash;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea1CurrentCash;
    private javax.swing.JTextArea jTextArea1Selected;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField120;
    private javax.swing.JTextField jTextField1CurrentMachineCash;
    private javax.swing.JTextField jTextField1InsertCash;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField350;
    private javax.swing.JTextField jTextField4100;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
