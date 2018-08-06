/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.KaryawanController;
import controllers.RoleController;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class KaryawanOvertimeView extends javax.swing.JInternalFrame {
    
    private final KaryawanController karyawanController;
    private final RoleController roleController;
    private final ViewProccess viewProccess;
    private final String[] header = {"ID Karyawan","Role","Nama Karyawan","Tanggal Lahir","Tanggal Gaubung","Alamat","Gaji"};
    private final String[] categories;
    private final List<Object[]> RoleTemp;
    private final DataOvertimeView dataOvertimeView;
    
    
    /**
     * Creates new form KaryawanView
     */
    public KaryawanOvertimeView(Connection connection) {
        initComponents();
        this.categories = new String[]{"id","id_role","nama","tgl_lahir","tgl_masuk","alamat","gaji"};
        this.karyawanController = new KaryawanController(connection);
        this.roleController = new RoleController(connection);
        this.dataOvertimeView = new DataOvertimeView(connection);
        this.viewProccess = new ViewProccess();
        this.RoleTemp = this.getDataRole();
        this.loadRole();
        this.loadSearchComboBox();        
        this.bindingTable();
        this.reset();
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
        tblKaryawan = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKaryawanNama = new javax.swing.JTextField();
        txtTglLahir = new javax.swing.JTextField();
        txtTglMasuk = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDrop = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGaji = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtKaryawanId = new javax.swing.JTextField();
        cmbRole = new javax.swing.JComboBox<>();
        cmbCategory = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Karyawan");

        tblKaryawan.setBorder(new javax.swing.border.MatteBorder(null));
        tblKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKaryawan);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Karyawan ID");

        jLabel2.setText("Nama Karyawan");

        jLabel3.setText("Tangal Lahir");

        jLabel4.setText("Tanggal Masuk");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDrop.setText("Drop");
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });

        jLabel7.setText("Alamat");

        jLabel8.setText("Gaji");

        jLabel9.setText("Role");

        txtKaryawanId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKaryawanIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKaryawanId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKaryawanNama, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKaryawanId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKaryawanNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnSearch.setText("Cari");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        this.searchTable(this.viewProccess.getCategory(this.categories, cmbCategory), txtSearch.getText());
    }//GEN-LAST:event_cmbCategoryActionPerformed

    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        this.drop(Integer.parseInt(txtKaryawanId.getText()));
    }//GEN-LAST:event_btnDropActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.searchTable(this.viewProccess.getCategory(this.categories, cmbCategory), txtSearch.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKaryawanMouseClicked
        this.mouseClicked(tblKaryawan.getSelectedRow());
    }//GEN-LAST:event_tblKaryawanMouseClicked

    private void txtKaryawanIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKaryawanIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKaryawanIdActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (this.viewProccess.keyPressed(evt)) {
            this.searchTable(this.viewProccess.getCategory(this.categories, cmbCategory), txtSearch.getText());
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        this.saveOrEdit(txtKaryawanId.isEnabled());
        this.bindingTable();
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKaryawan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtKaryawanId;
    private javax.swing.JTextField txtKaryawanNama;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTglLahir;
    private javax.swing.JTextField txtTglMasuk;
    // End of variables declaration//GEN-END:variables

    public void bindingTable() {
        this.viewProccess.viewTable(tblKaryawan, header,
                this.karyawanController.bindingSort(categories[0], "asc"));
    }
    
    public void saveOrEdit(boolean isSave) {
        boolean flag = true;
        if (isSave) {
            flag = this.karyawanController.save(txtKaryawanId.getText(), this.getRoleId(),txtKaryawanNama.getText(),
                    txtTglLahir.getText(),txtTglMasuk.getText(),txtAlamat.getText(),txtGaji.getText());
        } else {
            flag = this.karyawanController.edit(txtKaryawanId.getText(),this.getRoleId(),txtKaryawanNama.getText(),
                    txtTglLahir.getText(),txtTglMasuk.getText(),txtAlamat.getText(),txtGaji.getText());
        }
        this.viewProccess.saveData(this, flag, isSave);
        this.reset();
    }
    
    public void reset() {        
        txtKaryawanId.setEditable(false);
        btnDrop.setEnabled(false);
        txtKaryawanId.setText(this.karyawanController.getAutoId());
        txtKaryawanNama.setText("");
        txtTglLahir.setText("");
        txtTglMasuk.setText("");
        txtAlamat.setText("");
        txtGaji.setText("");
        txtSearch.setText("");
        this.bindingTable();
    }
    
    public void searchTable(String category, String data) {
        this.viewProccess.viewTable(tblKaryawan, header,
                this.karyawanController.find(category, data));
    }

    /**
     * Fungsi untuk menampilkan tulisan/pilihan pada combo box
     */
    public void loadSearchComboBox() {
        this.viewProccess.loadSearchComboBox(cmbCategory, header);
    }
    
    public void drop(int id) {
        if (this.viewProccess.dropConfirm(this)) {
            this.viewProccess.dropData(this, this.karyawanController.drop(id));
        }
        this.reset();
    }
    
    public void mouseClicked(int row) {
        txtKaryawanId.setEnabled(false);
        btnDrop.setEnabled(true);
        txtKaryawanId.setText(tblKaryawan.getValueAt(row, 0).toString());
        cmbRole.setSelectedItem(tblKaryawan.getValueAt(row, 1).toString());
        txtKaryawanNama.setText(tblKaryawan.getValueAt(row, 2).toString());
        txtTglLahir.setText(tblKaryawan.getValueAt(row, 3).toString());
        txtTglMasuk.setText(tblKaryawan.getValueAt(row, 4).toString());
        txtAlamat.setText(tblKaryawan.getValueAt(row, 5).toString());
        txtGaji.setText(tblKaryawan.getValueAt(row, 6).toString());
    }
    
    private List<Object[]> getDataRole() {
        return roleController.bindingSort("id", "asc");
    }
    
    /**
     * fungsi yang digunakan untuk menampilkan objek dari region ketika memasukkan data
     */
    public void loadRole() {
        this.viewProccess.loadDetails(cmbRole, roleController.bindingSort("id", "asc"), 1);
    }
    
    /**
     * fungsi yang digunakan untuk menampilkan Region ID
     * @return 
     */
    private String getRoleId(){
        return this.viewProccess.getIdfromComboBox(this.RoleTemp, cmbRole.getSelectedIndex());
    }
    
}
