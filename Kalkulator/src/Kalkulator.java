/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifqi M_R
 */
public class Kalkulator extends javax.swing.JFrame {

    double hasil, bilangan1,bilangan2;
    int pilih;
    String bilangan="";
    public Kalkulator() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        txthasil = new javax.swing.JTextField();
        btnhapusall = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnkoma = new javax.swing.JButton();
        btnhasil = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btnkurang1 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setResizable(false);

        txthasil.setBackground(new java.awt.Color(0, 51, 204));
        txthasil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txthasil.setForeground(new java.awt.Color(0, 255, 255));
        txthasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnhapusall.setBackground(new java.awt.Color(0, 0, 204));
        btnhapusall.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnhapusall.setForeground(new java.awt.Color(0, 255, 255));
        btnhapusall.setText("CE");
        btnhapusall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusallActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 204));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(51, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 204));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(51, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 204));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(51, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 204));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(51, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 204));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(51, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 204));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(51, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnkurang.setBackground(new java.awt.Color(0, 0, 204));
        btnkurang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnkurang.setForeground(new java.awt.Color(51, 255, 255));
        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 204));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(51, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 204));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(51, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 204));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(51, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btntambah.setBackground(new java.awt.Color(0, 0, 204));
        btntambah.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btntambah.setForeground(new java.awt.Color(51, 255, 255));
        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btn00.setBackground(new java.awt.Color(0, 0, 204));
        btn00.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn00.setForeground(new java.awt.Color(51, 255, 255));
        btn00.setText("00");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 204));
        btn0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(51, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnkoma.setBackground(new java.awt.Color(0, 0, 204));
        btnkoma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnkoma.setForeground(new java.awt.Color(51, 255, 255));
        btnkoma.setText(",");
        btnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkomaActionPerformed(evt);
            }
        });

        btnhasil.setBackground(new java.awt.Color(0, 0, 204));
        btnhasil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnhasil.setForeground(new java.awt.Color(51, 255, 255));
        btnhasil.setText("=");
        btnhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhasilActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(0, 0, 204));
        btn10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn10.setForeground(new java.awt.Color(51, 255, 255));
        btn10.setText("%");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(0, 0, 204));
        btn11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn11.setForeground(new java.awt.Color(51, 255, 255));
        btn11.setText("/");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btnkurang1.setBackground(new java.awt.Color(0, 0, 204));
        btnkurang1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnkurang1.setForeground(new java.awt.Color(51, 255, 255));
        btnkurang1.setText("X");
        btnkurang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurang1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txthasil)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnhapusall, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnkurang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnkurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntambah, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnkoma, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhapusall, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkurang1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkoma, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        bilangan +="7";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        bilangan +="9";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        bilangan +="8";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        bilangan +="6";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        bilangan +="5";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        bilangan +="4";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        bilangan +="3";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        bilangan +="2";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        bilangan +="1";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        bilangan +="0";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        bilangan +="00";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(bilangan);
        txthasil.setText("%");
        bilangan="";
        pilih=5; 
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(bilangan);
        txthasil.setText("/");
        bilangan="";
        pilih=4; 
    }//GEN-LAST:event_btn11ActionPerformed

    private void btnhapusallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusallActionPerformed
        // TODO add your handling code here:
        bilangan1=0.0;
        bilangan2=0.0;
        bilangan="";
        txthasil.setText("");
    }//GEN-LAST:event_btnhapusallActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(bilangan);
        txthasil.setText(bilangan);
        bilangan="";
        pilih=1; 
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(bilangan);
        txthasil.setText("-");
        bilangan="";
        pilih=2; 
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnkurang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurang1ActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(bilangan);
        txthasil.setText("*");
        bilangan="";
        pilih=3; 
    }//GEN-LAST:event_btnkurang1ActionPerformed

    private void btnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkomaActionPerformed
        // TODO add your handling code here:
        bilangan +=".";
        txthasil.setText(bilangan);
    }//GEN-LAST:event_btnkomaActionPerformed

    private void btnhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhasilActionPerformed
        // TODO add your handling code here:
        switch(pilih){
            case 1:
                bilangan2=Double.parseDouble(String.valueOf(txthasil.getText()));
                hasil=bilangan1+bilangan2;
                txthasil.setText("+");
                bilangan=Double.toString(hasil);
                break;
            case 2:
                bilangan2=Double.parseDouble(String.valueOf(txthasil.getText()));
                hasil=bilangan1-bilangan2;
                txthasil.setText("-");
                bilangan=Double.toString(hasil);
                break;
            case 3:
                bilangan2=Double.parseDouble(String.valueOf(txthasil.getText()));
                hasil=bilangan1*bilangan2;
                txthasil.setText("*");
                bilangan=Double.toString(hasil);
                break;
            case 4:
                bilangan2=Double.parseDouble(String.valueOf(txthasil.getText()));
                hasil=bilangan1/bilangan2;
                txthasil.setText("?");
                bilangan=Double.toString(hasil);
                break;
            case 5:
                bilangan2=Double.parseDouble(String.valueOf(txthasil.getText()));
                hasil=bilangan1%bilangan2;
                txthasil.setText("mod");
                bilangan=Double.toString(hasil);
        }
        if (pilih == 1){
            txthasil.setText(bilangan1+" + "+bilangan2+"="+bilangan);
        }else if (pilih == 2){
            txthasil.setText(bilangan1+" - "+bilangan2+"="+bilangan);
        }else if (pilih == 3){
            txthasil.setText(bilangan1+" * "+bilangan2+"="+bilangan);
        }else if (pilih == 4){
            txthasil.setText(bilangan1+" / "+bilangan2+"="+bilangan);
        }else {
            txthasil.setText(bilangan1+" mod "+bilangan2+"="+bilangan);
        }
        
    }//GEN-LAST:event_btnhasilActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnhapusall;
    private javax.swing.JButton btnhasil;
    private javax.swing.JButton btnkoma;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnkurang1;
    private javax.swing.JButton btntambah;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField txthasil;
    // End of variables declaration//GEN-END:variables
}
