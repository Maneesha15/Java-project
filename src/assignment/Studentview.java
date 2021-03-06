/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Studentview extends javax.swing.JFrame {

    /**
     * Creates new form Studentview
     */
    DBoparetion dbops=new DBoparetion();
    
    public Studentview() {
        initComponents();
    }
    
    
    void setfields(students std){
       
        txtnumber1.setText(new Integer(std.getStudent_id()).toString());
        txtFname.setText(std.getFirst_name());
        txtLname.setText(std.getLast_name());
        txtAddress.setText(std.getAddress());
        txtAge.setText(new Integer(std.getAge()).toString());
        cbgender.setSelectedItem(std.getGender());
        txtnumber.setText(new Integer(std.getPhone_number()).toString());
        txtemail.setText(std.getEmail());
        txtsub1.setText(std.getAL_sub1());
        subg1.setText(std.getAL_sub1_grade());
        txtsub2.setText(std.getAL_sub2());
        subg2.setText(std.getAL_sub2_grade());
        txtsub3.setText(std.getAL_sub3());
        subg3.setText(std.getAL_sub3_grade());
        txtzcore.setText(std.getZcore());
        txtindex.setText(new Integer(std.getAL_index()).toString());
        cbfacname.setSelectedItem(std.getFaculty_name());
        cbyear.setSelectedItem(std.getAdmission_year());
        cbmonth.setSelectedItem(std.getIntake_month());
        sub11.setText(std.getCourse_sub1_1());
        sub12.setText(std.getCourse_sub1_2());
        sub13.setText(std.getCourse_sub1_3());
        sub14.setText(std.getCourse_sub1_4());
        sub21.setText(std.getCourse_sub2_1());
        sub22.setText(std.getCourse_sub2_2());
        sub23.setText(std.getCourse_sub2_3());
        sub24.setText(std.getCourse_sub2_4());
        
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbgender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtsub1 = new javax.swing.JTextField();
        subg1 = new javax.swing.JTextField();
        subg2 = new javax.swing.JTextField();
        subg3 = new javax.swing.JTextField();
        txtsub2 = new javax.swing.JTextField();
        txtsub3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtzcore = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtnumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbyear = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbmonth = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        sub11 = new javax.swing.JTextField();
        sub12 = new javax.swing.JTextField();
        sub14 = new javax.swing.JTextField();
        sub13 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        sub21 = new javax.swing.JTextField();
        sub22 = new javax.swing.JTextField();
        sub24 = new javax.swing.JTextField();
        sub23 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtindex = new javax.swing.JTextField();
        cbfacname = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtnumber1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Detail Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 226, 27));

        jLabel2.setText("First Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 97, -1));

        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 385, -1));

        jLabel3.setText("Last Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 97, -1));

        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 385, -1));

        jLabel4.setText("Address :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 97, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 385, -1));

        jLabel5.setText("Age :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 57, -1));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 30, -1));

        jLabel6.setText("Gender :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 57, -1));

        cbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbgenderActionPerformed(evt);
            }
        });
        jPanel1.add(cbgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText(" A/L Results :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel8.setText("Subject");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 72, -1));

        jLabel9.setText("Grade");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        txtsub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsub1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtsub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 99, -1));

        subg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subg1ActionPerformed(evt);
            }
        });
        jPanel1.add(subg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 34, -1));

        subg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subg2ActionPerformed(evt);
            }
        });
        jPanel1.add(subg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 34, -1));

        subg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subg3ActionPerformed(evt);
            }
        });
        jPanel1.add(subg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 34, -1));

        txtsub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsub2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtsub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 99, -1));

        txtsub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsub3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtsub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 99, -1));

        jLabel10.setText("Z-core");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 47, -1));

        txtzcore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzcoreActionPerformed(evt);
            }
        });
        jPanel1.add(txtzcore, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 56, -1));

        jLabel11.setText("Phone Number :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        txtnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 97, -1));

        jLabel12.setText("Emai address :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 285, -1));

        jLabel13.setText("Admission Year :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 101, -1));

        cbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", " " }));
        jPanel1.add(cbyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, -1, -1));

        jLabel14.setText("Intake :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 49, -1));

        cbmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "February", "July" }));
        cbmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmonthActionPerformed(evt);
            }
        });
        jPanel1.add(cbmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("1st semester");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 90, -1));

        sub11.setText(" ");
        jPanel1.add(sub11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 110, -1));

        sub12.setText(" ");
        sub12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub12ActionPerformed(evt);
            }
        });
        jPanel1.add(sub12, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 250, 110, -1));

        sub14.setText(" ");
        sub14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub14ActionPerformed(evt);
            }
        });
        jPanel1.add(sub14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 110, -1));

        sub13.setText(" ");
        jPanel1.add(sub13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 110, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setText("2nd semester");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 90, -1));

        sub21.setText(" ");
        jPanel1.add(sub21, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 110, -1));

        sub22.setText(" ");
        jPanel1.add(sub22, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 110, -1));

        sub24.setText(" ");
        sub24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub24ActionPerformed(evt);
            }
        });
        jPanel1.add(sub24, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 110, -1));

        sub23.setText(" ");
        jPanel1.add(sub23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 110, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Save changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 149, 40));

        jLabel20.setText("Index number: ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        txtindex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtindexActionPerformed(evt);
            }
        });
        jPanel1.add(txtindex, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 95, -1));

        cbfacname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Engineering" }));
        jPanel1.add(cbfacname, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 283, -1));

        jLabel18.setText("Faculty name");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        jLabel21.setText("Student id :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 77, -1, -1));

        txtnumber1.setEditable(false);
        txtnumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumber1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtnumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 74, 97, -1));

        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 550, 520));

        jLabel23.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel23.setText("SSC1101 , SSC1102 are compulsary subjects for semester 1");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 440, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel24.setText("SSC1201,SSC1202,SSC1203 are compulsary subjects for semester 2");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 420, -1));

        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 450, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void cbgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbgenderActionPerformed

    private void txtsub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsub1ActionPerformed

    private void subg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subg1ActionPerformed

    private void subg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subg2ActionPerformed

    private void subg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subg3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subg3ActionPerformed

    private void txtsub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsub2ActionPerformed

    private void txtsub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsub3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsub3ActionPerformed

    private void txtzcoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzcoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzcoreActionPerformed

    private void txtnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumberActionPerformed

    private void cbmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmonthActionPerformed

    private void sub12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub12ActionPerformed

    private void sub14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub14ActionPerformed

    private void sub24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub24ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         students addst=new students();
   
        addst.setStudent_id(0);
        addst.setFirst_name(txtFname.getText());
        addst.setLast_name(txtLname.getText());
        addst.setAge(new Integer(txtAge.getText()).intValue());
        addst.setGender(cbgender.getSelectedItem().toString());
        addst.setAddress(txtAddress.getText());
        addst.setPhone_number(new Integer(txtnumber.getText()).intValue());
        addst.setEmail(txtemail.getText());
        addst.setAL_index(new Integer(txtindex.getText()).intValue());
        addst.setZcore((txtzcore.getText()));
        addst.setAL_sub1(txtsub1.getText());
        addst.setAL_sub1_grade(subg1.getText());
        addst.setAL_sub2(txtsub2.getText());
        addst.setAL_sub2_grade(subg2.getText());
        addst.setAL_sub3(txtsub3.getText());
        addst.setAL_sub3_grade(subg3.getText());
        addst.setAdmission_year(Integer.parseInt((String)cbyear.getSelectedItem()));
        addst.setIntake_month(cbmonth.getSelectedItem().toString());
        addst.setCourse_sub1_1(sub11.getText());
        addst.setCourse_sub1_2(sub12.getText());
        addst.setCourse_sub1_3(sub13.getText());
        addst.setCourse_sub1_4(sub14.getText());
        addst.setCourse_sub2_1(sub21.getText());
        addst.setCourse_sub2_2(sub22.getText());
        addst.setCourse_sub2_3(sub23.getText());
        addst.setCourse_sub2_4(sub24.getText());
        addst.setFaculty_name(cbfacname.getSelectedItem().toString());
        
        if(dbops.updateUnStudent(addst)){
            JOptionPane.showMessageDialog(this,"succesfuly updated");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"not updated");
            this.dispose();
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtindexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtindexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtindexActionPerformed

    private void txtnumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumber1ActionPerformed

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
            java.util.logging.Logger.getLogger(Studentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbfacname;
    private javax.swing.JComboBox<String> cbgender;
    private javax.swing.JComboBox<String> cbmonth;
    private javax.swing.JComboBox<String> cbyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sub11;
    private javax.swing.JTextField sub12;
    private javax.swing.JTextField sub13;
    private javax.swing.JTextField sub14;
    private javax.swing.JTextField sub21;
    private javax.swing.JTextField sub22;
    private javax.swing.JTextField sub23;
    private javax.swing.JTextField sub24;
    private javax.swing.JTextField subg1;
    private javax.swing.JTextField subg2;
    private javax.swing.JTextField subg3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtindex;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txtnumber1;
    private javax.swing.JTextField txtsub1;
    private javax.swing.JTextField txtsub2;
    private javax.swing.JTextField txtsub3;
    private javax.swing.JTextField txtzcore;
    // End of variables declaration//GEN-END:variables
}
