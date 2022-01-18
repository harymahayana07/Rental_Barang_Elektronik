
import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.sql.ResultSet;
import javax.swing.JOptionPane;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidiq
 */
public class Form_Barang extends javax.swing.JInternalFrame {
    
    ResultSet rs;
    KoneksiDatabase con;
    

    /**
     * Creates new form Form_mobil
     */
    public Form_Barang() {
        
        con =new KoneksiDatabase(new Database.Parameter().HOST_DB,new Database.Parameter().USERNAME_DB,new Database.Parameter().PASSWORD_DB);
        initComponents();
        loadTabel(); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass1 = new usu.widget.glass.PanelGlass();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_merkBarang_addItem = new javax.swing.JTextField();
        txt_TypeBarang_addItem = new javax.swing.JTextField();
        combotahun = new javax.swing.JComboBox();
        txt_Noitem_addItem = new javax.swing.JTextField();
        txt_Harga_addItem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combo_Status = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        btn_create_addItem = new usu.widget.ButtonGlass();
        btn_Edit_addItem = new usu.widget.ButtonGlass();
        btn_Refresh__addItem = new usu.widget.ButtonGlass();
        btn_Delete__addItem = new usu.widget.ButtonGlass();
        panelGlass7 = new usu.widget.glass.PanelGlass();
        txt_search_AddItem1 = new javax.swing.JTextField();
        btn_Search_AddItem1 = new usu.widget.ButtonGlass();
        panelGlass6 = new usu.widget.glass.PanelGlass();
        txt_search_AddItem = new javax.swing.JTextField();
        btn_Search_AddItem = new usu.widget.ButtonGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tahun Produksi");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Type Barang");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Merek Barang");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No. Item");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Harga Sewa");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(":");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(":");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(":");

        combotahun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));

        txt_Noitem_addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Noitem_addItemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");

        combo_Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tersedia", "Keluar" }));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barang-elektronik-bekas.png"))); // NOI18N

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_merkBarang_addItem, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_TypeBarang_addItem))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combotahun, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Noitem_addItem)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(combo_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_Harga_addItem))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(35, 35, 35))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txt_merkBarang_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txt_TypeBarang_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(combotahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(txt_Noitem_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txt_Harga_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(combo_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 940, 270));

        btn_create_addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_create_addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btn_create_addItem.setText("Add");
        btn_create_addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_addItemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create_addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 190, -1));

        btn_Edit_addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_Edit_addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pencil_edit.png"))); // NOI18N
        btn_Edit_addItem.setText("Edit");
        btn_Edit_addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Edit_addItemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Edit_addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 190, -1));

        btn_Refresh__addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_Refresh__addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        btn_Refresh__addItem.setText("Refresh");
        btn_Refresh__addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Refresh__addItemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh__addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 190, -1));

        btn_Delete__addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete__addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_box.png"))); // NOI18N
        btn_Delete__addItem.setText("Delete");
        btn_Delete__addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Delete__addItemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete__addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 190, -1));

        txt_search_AddItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_AddItem1ActionPerformed(evt);
            }
        });

        btn_Search_AddItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_lense.png"))); // NOI18N
        btn_Search_AddItem1.setRoundRect(true);
        btn_Search_AddItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Search_AddItem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass7Layout = new javax.swing.GroupLayout(panelGlass7);
        panelGlass7.setLayout(panelGlass7Layout);
        panelGlass7Layout.setHorizontalGroup(
            panelGlass7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass7Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(txt_search_AddItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Search_AddItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGlass7Layout.setVerticalGroup(
            panelGlass7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass7Layout.createSequentialGroup()
                .addComponent(btn_Search_AddItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelGlass7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_search_AddItem1)
                .addContainerGap())
        );

        getContentPane().add(panelGlass7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 320, 40));

        txt_search_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_AddItemActionPerformed(evt);
            }
        });

        btn_Search_AddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_lense.png"))); // NOI18N
        btn_Search_AddItem.setRoundRect(true);
        btn_Search_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Search_AddItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass6Layout = new javax.swing.GroupLayout(panelGlass6);
        panelGlass6.setLayout(panelGlass6Layout);
        panelGlass6Layout.setHorizontalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_search_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Search_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGlass6Layout.setVerticalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass6Layout.createSequentialGroup()
                .addComponent(btn_Search_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelGlass6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_search_AddItem)
                .addContainerGap())
        );

        getContentPane().add(panelGlass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 480, 40));

        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Merek Barang", "Type Barang", "Tahun Produksi", "No.Item", "Harga Sewa", "Status"
            }
        ));
        tableBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 940, 220));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("FORM BARANG");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backOk.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Edit_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Edit_addItemActionPerformed
      try {
            if( !txt_merkBarang_addItem.getText().isEmpty() && !txt_TypeBarang_addItem.getText().isEmpty() && !txt_Noitem_addItem.getText().isEmpty() && !txt_Harga_addItem.getText().isEmpty()){
                String kolom[] = {"merek","tipe","tahun","noitem","harga","status"};
                String isi[] = { txt_merkBarang_addItem.getText(),txt_TypeBarang_addItem.getText(),combotahun.getSelectedItem().toString(),txt_Noitem_addItem.getText(),txt_Harga_addItem.getText(),combo_Status.getSelectedItem().toString()};
                con.queryUpdate("tb_barang", kolom, isi,"id_barang='"+String.valueOf(tableBarang.getValueAt(tableBarang.getSelectedRow(),0))+"'");
                JOptionPane.showMessageDialog(this, "Data Berhasil Diedit");
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error edit data");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_Edit_addItemActionPerformed

    private void txt_Noitem_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Noitem_addItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Noitem_addItemActionPerformed

    private void btn_create_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_addItemActionPerformed
        create();
    }//GEN-LAST:event_btn_create_addItemActionPerformed

    private void btn_Search_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Search_AddItemActionPerformed
      if(txt_search_AddItem.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        }else{
            try {
                rs=con.querySelectAll("tb_barang", "id_barang LIKE '%"+txt_search_AddItem.getText()+"%' OR merek LIKE '%"+txt_search_AddItem.getText()+"%' OR tipe LIKE '%"+txt_search_AddItem.getText()+"%' OR noitem LIKE '%"+txt_search_AddItem.getText()+"%' OR harga LIKE '%"+txt_search_AddItem.getText()+"%' OR tahun LIKE '%"+txt_search_AddItem.getText()+"%'" );
                tableBarang.setModel(new Database.ResultSetTable(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
        clear();
    }//GEN-LAST:event_btn_Search_AddItemActionPerformed

    private void btn_Delete__addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Delete__addItemActionPerformed
      try {
            String id=String.valueOf(tableBarang.getValueAt(tableBarang.getSelectedRow(),0));
                if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("tb_barang","id_barang="+id);

            }else{
                return;
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pilih id terlebih dahulu");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_Delete__addItemActionPerformed

    private void btn_Refresh__addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Refresh__addItemActionPerformed
        loadTabel();
    }//GEN-LAST:event_btn_Refresh__addItemActionPerformed

    private void tableBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBarangMouseClicked
        txt_merkBarang_addItem.setText(String.valueOf(tableBarang.getValueAt(tableBarang.getSelectedRow(),1)));
        txt_TypeBarang_addItem.setText(String.valueOf( tableBarang.getValueAt(tableBarang.getSelectedRow(),2)));
        combotahun.setSelectedItem(String.valueOf(tableBarang.getValueAt(tableBarang.getSelectedRow(),3)));
        txt_Noitem_addItem.setText(String.valueOf( tableBarang.getValueAt(tableBarang.getSelectedRow(),4)));
        txt_Harga_addItem.setText(String.valueOf( tableBarang.getValueAt(tableBarang.getSelectedRow(),5)));
    }//GEN-LAST:event_tableBarangMouseClicked

    private void txt_search_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_AddItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_AddItemActionPerformed

    private void txt_search_AddItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_AddItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_AddItem1ActionPerformed

    private void btn_Search_AddItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Search_AddItem1ActionPerformed
        if(txt_search_AddItem1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        }else{
            try {
                rs=con.querySet("tb_barang",txt_search_AddItem1.getText());
                tableBarang.setModel(new Database.ResultSetTable(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
        clear();
    }//GEN-LAST:event_btn_Search_AddItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Form_Barang().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_Delete__addItem;
    private usu.widget.ButtonGlass btn_Edit_addItem;
    private usu.widget.ButtonGlass btn_Refresh__addItem;
    private usu.widget.ButtonGlass btn_Search_AddItem;
    private usu.widget.ButtonGlass btn_Search_AddItem1;
    private usu.widget.ButtonGlass btn_create_addItem;
    private javax.swing.JComboBox combo_Status;
    private javax.swing.JComboBox combotahun;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass6;
    private usu.widget.glass.PanelGlass panelGlass7;
    private javax.swing.JTable tableBarang;
    private javax.swing.JTextField txt_Harga_addItem;
    private javax.swing.JTextField txt_Noitem_addItem;
    private javax.swing.JTextField txt_TypeBarang_addItem;
    private javax.swing.JTextField txt_merkBarang_addItem;
    private javax.swing.JTextField txt_search_AddItem;
    private javax.swing.JTextField txt_search_AddItem1;
    // End of variables declaration//GEN-END:variables



  

    private void loadTabel() {
        String namaKolom[] = {"id_barang","merek","tipe","tahun","noitem","harga","status"};
        rs=con.querySelect(namaKolom,"tb_barang");
        tableBarang.setModel(new ResultSetTable(rs));
    }

    private void create() {
      
        try {
 
            if( !txt_merkBarang_addItem.getText().isEmpty() && !txt_TypeBarang_addItem.getText().isEmpty() && !txt_Noitem_addItem.getText().isEmpty() && !txt_Harga_addItem.getText().isEmpty()){
                String kolom[] = {"merek","tipe","tahun","noitem","harga","status"};
                String isi[] = { txt_merkBarang_addItem.getText(),txt_TypeBarang_addItem.getText(),combotahun.getSelectedItem().toString(),txt_Noitem_addItem.getText(),txt_Harga_addItem.getText(),combo_Status.getSelectedItem().toString()};
                
                System.out.println( con.queryInsert("tb_barang",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error input data");
             System.out.println("salah");
        }
        loadTabel();
        clear();
    }

    private void clear() {
        
        txt_merkBarang_addItem.setText("");
        txt_TypeBarang_addItem.setText("");
        combotahun.setSelectedItem("2022");
        txt_Noitem_addItem.setText("");
        txt_Harga_addItem.setText("");
        
       
    }
   
}
