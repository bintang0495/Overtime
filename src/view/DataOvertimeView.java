/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.DataOvertimeController;
import controllers.KaryawanController;
import controllers.LevelController;
import controllers.StatusController;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class DataOvertimeView extends javax.swing.JInternalFrame {

    private final KaryawanController karyawanController;
    private final StatusController statusController;
    private final LevelController levelController;
    private final DataOvertimeController dataOvertimeController;
    private final ViewProccess viewProccess;
    private final String[] header = {"ID Data","Nama Karyawan","Tanggal Lembur","Jam Berangkat","Jam Pulang","ID Level","Status","Upah Lembur","Keterangan"};
    private final String[] categories;
    private final List<Object[]> StatusTemp;
    private final List<Object[]> LevelTemp;
    private final DataOvertimeView dataOvertimeView;
    
    /**
     * Creates new form DataOvertimeView
     */
    public DataOvertimeView(Connection connection) {
        initComponents();
        this.categories = new String[]{"id","id_karyawan","tgl","jam_masuk","jam_pulang","id_level","id_status","upah_lembur","keterangan"};
        this.karyawanController = new KaryawanController(connection);
        this.statusController = new StatusController(connection);
        this.levelController = new LevelController(connection);
        this.dataOvertimeController = new DataOvertimeController(connection);
        this.viewProccess = new ViewProccess();
        this.StatusTemp = this.getDataStatus();
        this.LevelTemp = this.getDataLevel();
        this.loadLevel();
        this.loadStatus();    
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdData = new javax.swing.JTextField();
        txtIdKaryawan = new javax.swing.JTextField();
        txtTanggalLembur = new javax.swing.JTextField();
        txtJamBrgkt = new javax.swing.JTextField();
        txtJamPlg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbLevel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        btnDrop = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setTitle("Data Overtime");

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblData);

        jLabel1.setText("ID Data");

        jLabel2.setText("ID Karyawan");

        jLabel3.setText("Tanggal Lembur");

        jLabel4.setText("Jam Berangkat");

        jLabel5.setText("Jam Pulang");

        jLabel6.setText("Level");

        jLabel7.setText("Status");

        jLabel8.setText("Keterangan");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane2.setViewportView(txtKeterangan);

        btnDrop.setText("Drop");

        btnSave.setText("Save");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJamPlg, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJamBrgkt)
                    .addComponent(txtTanggalLembur, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(txtIdData))
                .addGap(232, 232, 232)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(btnDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTanggalLembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtJamBrgkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtJamPlg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtIdData;
    private javax.swing.JTextField txtIdKaryawan;
    private javax.swing.JTextField txtJamBrgkt;
    private javax.swing.JTextField txtJamPlg;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtTanggalLembur;
    // End of variables declaration//GEN-END:variables

    public void bindingTable() {
        this.viewProccess.viewTable(tblData, header,
                this.dataOvertimeController.bindingSort(categories[0], "asc"));
    }
    
    public void saveOrEdit(boolean isSave) {
        boolean flag = true;
        if (isSave) {
            flag = this.dataOvertimeController.save(txtIdData.getText(), txtIdKaryawan.getText(),txtTanggalLembur.getText(),
                    txtJamBrgkt.getText(),txtJamPlg.getText(),,txtGaji.getText());
        } else {
            flag = this.karyawanController.edit(txtKaryawanId.getText(),this.getRoleId(),txtKaryawanNama.getText(),
                    txtTglLahir.getText(),txtTglMasuk.getText(),txtAlamat.getText(),txtGaji.getText());
        }
        this.viewProccess.saveData(this, flag, isSave);
        this.reset();
    }
    
    public void reset() {        
        txtIdData.setEditable(false);
        btnDrop.setEnabled(false);
        txtIdData.setText(this.dataOvertimeController.getAutoId());
        txtIdKaryawan.setText("");
        txtTanggalLembur.setText("");
        txtJamBrgkt.setText("");
        txtJamPlg.setText("");
        txtKeterangan.setText("");
        this.bindingTable();
    }
    
    public void searchTable(String category, String data) {
        this.viewProccess.viewTable(tblData, header,
                this.karyawanController.find(category, data));
    }

    /**
     * Fungsi untuk menampilkan tulisan/pilihan pada combo box
     */
    
    
    public void drop(int id) {
        if (this.viewProccess.dropConfirm(this)) {
            this.viewProccess.dropData(this, this.dataOvertimeController.drop(id));
        }
        this.reset();
    }
    
    public void mouseClicked(int row) {
        txtIdData.setEnabled(false);
        btnDrop.setEnabled(true);
        txtIdData.setText(tblData.getValueAt(row, 0).toString());
        txtIdKaryawan.setText(tblData.getValueAt(row, 1).toString());
        txtKaryawanNama.setText(tblKaryawan.getValueAt(row, 2).toString());
        txtTglLahir.setText(tblKaryawan.getValueAt(row, 3).toString());
        txtTglMasuk.setText(tblKaryawan.getValueAt(row, 4).toString());
        txtAlamat.setText(tblKaryawan.getValueAt(row, 5).toString());
        txtGaji.setText(tblKaryawan.getValueAt(row, 6).toString());
    }
    
    private List<Object[]> getDataLevel() {
        return levelController.bindingSort("id", "asc");
    }
    
    /**
     * fungsi yang digunakan untuk menampilkan objek dari region ketika memasukkan data
     */
    public void loadLevel() {
        this.viewProccess.loadDetails(cmbLevel, levelController.bindingSort("id", "asc"), 1);
    }
    
    /**
     * fungsi yang digunakan untuk menampilkan Region ID
     * @return 
     */
    private String getLevelId(){
        return this.viewProccess.getIdfromComboBox(this.LevelTemp, cmbLevel.getSelectedIndex());
    }
}