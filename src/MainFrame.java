/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        celsiusLabel = new javax.swing.JLabel();
        celsiusDataField = new javax.swing.JTextField();
        fahrenheitDataLabel = new javax.swing.JLabel();
        fahrenheitDataField = new javax.swing.JTextField();
        kelvinDataLabel = new javax.swing.JLabel();
        kelvinDataField = new javax.swing.JTextField();
        authorLabel = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        celsiusLabel.setText("Temperatura (Celsius)");

        celsiusDataField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                celsiusDataFieldInputMethodTextChanged(evt);
            }
        });
        celsiusDataField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusDataFieldActionPerformed(evt);
            }
        });
        celsiusDataField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                celsiusDataFieldPropertyChange(evt);
            }
        });
        celsiusDataField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                celsiusDataFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celsiusDataFieldKeyTyped(evt);
            }
        });

        fahrenheitDataLabel.setText("Temperatura (Fahrenheit))");

        fahrenheitDataField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitDataFieldActionPerformed(evt);
            }
        });
        fahrenheitDataField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fahrenheitDataFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fahrenheitDataFieldKeyTyped(evt);
            }
        });

        kelvinDataLabel.setText("Temperatura (Kelvin))");

        kelvinDataField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kelvinDataFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kelvinDataFieldKeyTyped(evt);
            }
        });

        authorLabel.setText(" Héctor Garbisu DiU 2015");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(authorLabel)
                    .addComponent(fahrenheitDataField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celsiusLabel)
                    .addComponent(celsiusDataField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fahrenheitDataLabel)
                    .addComponent(kelvinDataField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelvinDataLabel))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(celsiusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(celsiusDataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(fahrenheitDataLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fahrenheitDataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kelvinDataLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kelvinDataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(authorLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void celsiusDataFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celsiusDataFieldActionPerformed

    }//GEN-LAST:event_celsiusDataFieldActionPerformed

    private void celsiusDataFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celsiusDataFieldKeyTyped

    }//GEN-LAST:event_celsiusDataFieldKeyTyped

    private void fahrenheitDataFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitDataFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fahrenheitDataFieldActionPerformed

    private void fahrenheitDataFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fahrenheitDataFieldKeyTyped
         
    }//GEN-LAST:event_fahrenheitDataFieldKeyTyped

    private void kelvinDataFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kelvinDataFieldKeyTyped

    }//GEN-LAST:event_kelvinDataFieldKeyTyped

    private void celsiusDataFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celsiusDataFieldKeyReleased
        String celsiusDataText = celsiusDataField.getText();
        if(!inputIsValid(celsiusDataText)) return;
        Double fahTemp,kelTemp,celTemp = Double.parseDouble(celsiusDataText);
        fahTemp = 1.8*celTemp +32;
        kelTemp = celTemp+273.15;
        fahrenheitDataField.setText(""+fahTemp);
        kelvinDataField.setText(""+kelTemp); 
    }//GEN-LAST:event_celsiusDataFieldKeyReleased

    private void fahrenheitDataFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fahrenheitDataFieldKeyReleased
        String fahDataText = fahrenheitDataField.getText();
        if(!inputIsValid(fahDataText)) return;
        Double kelTemp,celTemp,fahTemp = Double.parseDouble(fahDataText);
        celTemp = (fahTemp-32)/1.8;
        kelTemp = celTemp+273.15;
        celsiusDataField.setText(""+celTemp);
        kelvinDataField.setText(""+kelTemp); 
    }//GEN-LAST:event_fahrenheitDataFieldKeyReleased

    private void kelvinDataFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kelvinDataFieldKeyReleased
        String kelDataText = kelvinDataField.getText();
        if(!inputIsValid(kelDataText)) return;
        Double fahTemp,celTemp,kelTemp = Double.parseDouble(kelDataText);
        celTemp = kelTemp-273.15;
        fahTemp = 1.8*celTemp +32;
        celsiusDataField.setText(""+celTemp);
        fahrenheitDataField.setText(""+fahTemp);
    }//GEN-LAST:event_kelvinDataFieldKeyReleased

    private void celsiusDataFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_celsiusDataFieldPropertyChange

    }//GEN-LAST:event_celsiusDataFieldPropertyChange

    private void celsiusDataFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_celsiusDataFieldInputMethodTextChanged

    }//GEN-LAST:event_celsiusDataFieldInputMethodTextChanged

    private boolean inputIsValid(String inputText){
        if(inputText.isEmpty()) return false;
        if(!isNumeric(inputText)) return false;
        if(isBelowZero(inputText)) return false;
       return true;
    }
    private static boolean isNumeric(String str){  
        try{  
            double d = Double.parseDouble(str);  
        }  
        catch(NumberFormatException nfe){  
            return false;  
        }  
        return true;  
    }
    private boolean isBelowZero(String str) {
        double d = Double.parseDouble(str);  
        return d<-273.15;
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField celsiusDataField;
    private javax.swing.JLabel celsiusLabel;
    private javax.swing.JTextField fahrenheitDataField;
    private javax.swing.JLabel fahrenheitDataLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField kelvinDataField;
    private javax.swing.JLabel kelvinDataLabel;
    // End of variables declaration//GEN-END:variables

 
}
