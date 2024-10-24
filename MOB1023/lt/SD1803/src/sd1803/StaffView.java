/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sd1803;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class StaffView extends javax.swing.JFrame {

    /**
     * Creates new form StaffView
     */
    QuanLyStaff st = new QuanLyStaff();

    public StaffView() {
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

        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbn = new javax.swing.JTable();
        btn_load = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_write = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_id = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_name = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_age = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbo_role = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rd_ok = new javax.swing.JRadioButton();
        rd_no = new javax.swing.JRadioButton();

        jLabel4.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Tuổi", "Vai trò", "Trạng thái"
            }
        ));
        tbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbn);

        btn_load.setText("Load");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_write.setText("Ghi file");
        btn_write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_writeActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(txt_id);

        jLabel1.setText("ID");

        jScrollPane6.setViewportView(txt_name);

        jLabel2.setText("Tên");

        jScrollPane7.setViewportView(txt_age);

        jLabel3.setText("Tuổi");

        jLabel5.setText("Vai trò");

        cbo_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Admin", "Moderator" }));

        jLabel6.setText("Trạng thái");

        buttonGroup1.add(rd_ok);
        rd_ok.setText("OK");

        buttonGroup1.add(rd_no);
        rd_no.setText("NO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rd_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd_no, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbo_role, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_load)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_write))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_load)
                            .addComponent(btn_add)
                            .addComponent(btn_write)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_ok)
                    .addComponent(rd_no))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void load3() {
        for (int i = 0; i < st.st.size(); i++) {
            if (i == 2) {
                Staff ls = st.st.get(i);
                txt_id.setText(String.valueOf(ls.getId()));
                txt_age.setText(String.valueOf(ls.getAge()));
                txt_name.setText(ls.getName());
                cbo_role.setSelectedItem(ls.getRole());
                if (ls.getStatus().equals("OK")) {
                    rd_ok.setSelected(true);
                } else {
                    rd_no.setSelected(true);
                }
            }
        }
    }

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadActionPerformed
        // TODO add your handling code here:
        load();
    }//GEN-LAST:event_btn_loadActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        int id, age;
        String name, role, status;

        age = Integer.parseInt(txt_age.getText());
        name = txt_name.getText();
        role = cbo_role.getSelectedItem().toString();
        if (rd_ok.isSelected()) {
            status = "OK";
        } else {
            status = "NO";
        }

        if (st.isNumber(txt_id.getText()).equals("NO")) {
            JOptionPane.showMessageDialog(this, "ID phải là số");
        } else {
            id = Integer.parseInt(txt_id.getText());
            st.st.add(new Staff(id, age, name, role, status));
            load();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void tbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnMouseClicked
        // TODO add your handling code here:
        int row = tbn.getSelectedRow();
        Staff ls = st.st.get(row);

        txt_id.setText(String.valueOf(ls.getId()));
        txt_age.setText(String.valueOf(ls.getAge()));
        txt_name.setText(ls.getName());
        cbo_role.setSelectedItem(ls.getRole());
        if (ls.getStatus().equals("OK"))
            rd_ok.setSelected(true);
        else
            rd_no.setSelected(true);
    }//GEN-LAST:event_tbnMouseClicked

    private void btn_writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_writeActionPerformed
        // TODO add your handling code here:

        try {
            FileWriter file = new FileWriter("abc.txt");
            BufferedWriter bf = new BufferedWriter(file);

            for (Staff list : st.st) {
                System.out.println("DATA" + list.toString());
                bf.write(list.toString());
                bf.newLine();
            }

            bf.close();

            JOptionPane.showMessageDialog(this, "Ghi file thành công");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_writeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        load3();
    }//GEN-LAST:event_formWindowOpened

    void load() {
        DefaultTableModel tb = (DefaultTableModel) tbn.getModel();
        tb.setRowCount(0);
        for (Staff list : st.st) {
            tb.addRow(new Object[]{
                list.getId(),
                list.getName(),
                list.getAge(),
                list.getRole(),
                list.getStatus()
            });
        }
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
            java.util.logging.Logger.getLogger(StaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_write;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JRadioButton rd_no;
    private javax.swing.JRadioButton rd_ok;
    private javax.swing.JTable tbn;
    private javax.swing.JTextPane txt_age;
    private javax.swing.JTextPane txt_id;
    private javax.swing.JTextPane txt_name;
    // End of variables declaration//GEN-END:variables
}
