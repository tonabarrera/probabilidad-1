/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import calculos.Integracion;
import excepciones.SigmaMenorQueCero;
import java.awt.Color;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author ianMJ
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    
    static final int nfinal = 1000;
    resultados res;
    int posx,posy;
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        res = new resultados();
        res.frame();
        
        /*aTxt.setText("número a");
        bTxt.setText("número b");
        miuTxt.setText("Miu: promedio");
        sigmaTxt.setText("sigma");*/
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aTxt = new javax.swing.JTextField();
        bTxt = new javax.swing.JTextField();
        miuTxt = new javax.swing.JTextField();
        sigmaTxt = new javax.swing.JTextField();
        calcularBtn = new javax.swing.JButton();
        autoTxt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        miuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miuTxtActionPerformed(evt);
            }
        });

        calcularBtn.setBackground(new java.awt.Color(255, 255, 255));
        calcularBtn.setText("Calcular");
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });

        autoTxt.setBackground(new java.awt.Color(255, 255, 255));
        autoTxt.setText("Tablas de Distribución Normal");
        autoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("a");

        jLabel2.setText("b");

        jLabel3.setText("µ");

        jLabel4.setText("σ");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setText("Integraciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(autoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(28, 28, 28)
                            .addComponent(bTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(aTxt)
                                .addComponent(miuTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(sigmaTxt)))))
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sigmaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(58, 58, 58)
                .addComponent(calcularBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autoTxt)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miuTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miuTxtActionPerformed

    //String a,b,miu,sigma;
    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        
        String error="";
        int flag = 0;
        double a1=0,a2=0,a3=0,a4=0;
        
        
        try{ 
            
            a1 = Double.parseDouble(aTxt.getText());
            aTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.green));
        }
        catch(NumberFormatException e){
            flag = 1;
            error += "Introduce solo dígitos en \"a\" \n";
            aTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
        }
        
        try{  
            
            a2 = Double.parseDouble(bTxt.getText());
            
                bTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.green));
            
        }
        catch(NumberFormatException e){
            flag = 1;
            error += "Introduce solo dígitos en \"b\" \n";
            bTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
        }
        
        try{  
            a3 = Double.parseDouble(miuTxt.getText());
            miuTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.green));
        }
        catch(NumberFormatException e){
            flag = 1;
            error += "Introduce solo dígitos en \"miu\" \n";
            
            miuTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
        }
        
        
        try{  
            a4 = Double.parseDouble(sigmaTxt.getText());
            if(a4>0)
            {              
                sigmaTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.green));     
            }else
            {
                error += "Introduzca solo dígitos positivos mayores a cero en sigma";    
                sigmaTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
                flag = 1;
            }
            
            
        }
        catch(NumberFormatException e)
        {
            flag = 1;
            error += "Introduce un numero en \"sigma\" \n";
            sigmaTxt.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.red));
        }
            if(flag==0)
            {

                res.mostrar(true);
                res.mostrarResultados(a1,a2,a3,a4);
                    
                mover();
                
            }else
            {
                  JOptionPane.showMessageDialog(rootPane, error);
        
            }
        /**/
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void mover()
    {
        posx = this.getX();
                posy = this.getY();

                try
                {
                    while(posx >= 300)
                    {
                        this.setLocation(posx,posy);
                        posx-=3;
                        Thread.sleep(1);
                    }
                    
                }catch(Exception ex)
                {
                    System.out.println("No movimos nada jaja");
                }
    }
    
    
    private void autoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoTxtActionPerformed
        
        res.modoAutomatico();
        res.mostrar(true);
        mover();
        
    }//GEN-LAST:event_autoTxtActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aTxt;
    private javax.swing.JButton autoTxt;
    private javax.swing.JTextField bTxt;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField miuTxt;
    private javax.swing.JTextField sigmaTxt;
    // End of variables declaration//GEN-END:variables
}
