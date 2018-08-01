/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.DataOvertime;
import entities.Karyawan;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class KaryawanDAO {
    private FunctionDAO fdao;

    public KaryawanDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public boolean insert(Karyawan karyawan) {
        return this.fdao.executeDML("INSERT INTO Karyawan VALUES("
                + karyawan.getKaryawanId()
                + "," + karyawan.getRoleId().getRoleId()+ ",'"+karyawan.getKaryawanName()
                +"','"+ karyawan.getTglLahir()
                +"'," + karyawan.getTglMasuk()+ "','"+ karyawan.getAlamat()+"','"+karyawan.getGaji()+"')");
    }
    public boolean update(Karyawan karyawan) {
         return this.fdao.executeDML("UPDATE Karyawan SET id_role=" + karyawan.getRoleId().getRoleId()+ ",nama='"+karyawan.getKaryawanName()
                +"',tgl_lahir='"+ karyawan.getTglLahir()
                +"',tgl_masuk='"+ karyawan.getTglMasuk()+ "',alamat='"+ karyawan.getAlamat()+"',gaji="+karyawan.getGaji()+" WHERE id ="+ karyawan.getKaryawanId());
    }
    
    public boolean delete(int dataId) {
        return this.fdao.executeDML("DELETE Karyawan WHERE id = " + dataId);
    }
    
    public List<Object[]> getAll() {
        return this.fdao.getAll("Select * FROM Karyawan");
    }
    
    /**
     * fungsi ini digunakan untuk menampilkan semua data berdasarkan parameter tertentu
     * @param category String
     * @param sort String
     * @return nilai atribut yang berurutan berdasarkan parameter kategori
     */
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("Select * FROM Karyawan ORDER BY " + category + " " + sort);
    }

    /**
     * fungsi ini digunakan untuk mencari data pada tabel Departments yang memiliki persamaan dengan karakter yang ada pada data 
     * @param category String
     * @param data String
     * @return nilai 
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM Karyawan WHERE " + category + " LIKE '%" + data + "%'");
    }

    /**
     * fungsi ini digunakan untuk menampilkan nilai berdasarkan id
     * @param dataId Integer
     * @return nilai atribut id
     */
    public Object getById(int dataId) {
        return this.fdao.getAll("SELECT * FROM Karyawan WHERE id=" + dataId);
    }

    /**
     * fungsi ini digunakan untuk mendapatkan niali id maksimal yang ditambahkan 1
     * @return nilai id maksimal yang ditambah 1
     */
    public String getAutoId() {
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM Karyawan");
    }
    
}
