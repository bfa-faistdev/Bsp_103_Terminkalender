
import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class AppointmentDlg extends javax.swing.JDialog {

    private Appointment appointment=null;
    private boolean check=false;
    private int index;

    public Appointment getAppointment() {
        return appointment;
    }

    public boolean isCheck() {
        return check;
    }
    
    public void setIndex(int index,ArrayList<Appointment> list){
        this.index=index;
        Appointment a = list.get(index);
        int year = a.getDateTime().getYear();
        int month = a.getDateTime().getMonthValue();
        int day = a.getDateTime().getDayOfMonth();
        int hour = a.getDateTime().getHour();
        int minute = a.getDateTime().getMinute();
        etDay.setText(""+day);
        etMonth.setText(""+month);
        etYear.setText(""+year);
        etHour.setText(""+hour);
        etMinute.setText(""+minute);
        etText.setText(""+a.getText());
    }
    
    /**
     * Creates new form AppointmentDlg
     */
    public AppointmentDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        etDay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etMonth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        etHour = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        etMinute = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        etText = new javax.swing.JTextField();
        btConfirm = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Termin-Eingabe");
        getContentPane().setLayout(new java.awt.GridLayout(7, 2));

        jLabel1.setText("Tag");
        getContentPane().add(jLabel1);

        etDay.setText("23");
        getContentPane().add(etDay);

        jLabel2.setText("Monat");
        getContentPane().add(jLabel2);

        etMonth.setText("04");
        getContentPane().add(etMonth);

        jLabel3.setText("Jahr");
        getContentPane().add(jLabel3);

        etYear.setText("2002");
        getContentPane().add(etYear);

        jLabel4.setText("Stunde");
        getContentPane().add(jLabel4);

        etHour.setText("02");
        getContentPane().add(etHour);

        jLabel5.setText("Minute");
        getContentPane().add(jLabel5);

        etMinute.setText("15");
        getContentPane().add(etMinute);

        jLabel6.setText("Text");
        getContentPane().add(jLabel6);

        etText.setText("Geburtstag Ben");
        getContentPane().add(etText);

        btConfirm.setText("Übernehmen");
        btConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btConfirm);

        btCancel.setText("Abbrechen");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btCancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmActionPerformed
        // TODO add your handling code here:
        int year = Integer.parseInt(etYear.getText());
        int month = Integer.parseInt(etMonth.getText());
        int day = Integer.parseInt(etDay.getText());
        int hour = Integer.parseInt(etHour.getText());
        int minute = Integer.parseInt(etMinute.getText());
        LocalDateTime date=LocalDateTime.of(year,month,day,hour,minute);
        appointment=new Appointment(date,etText.getText());
        check=true;
        this.dispose();
    }//GEN-LAST:event_btConfirmActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        // TODO add your handling code here:
        check=false;
        this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AppointmentDlg dialog = new AppointmentDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btConfirm;
    private javax.swing.JTextField etDay;
    private javax.swing.JTextField etHour;
    private javax.swing.JTextField etMinute;
    private javax.swing.JTextField etMonth;
    private javax.swing.JTextField etText;
    private javax.swing.JTextField etYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
