/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.DataOvertime;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class DataOvertimeDAO {
    private final FunctionDAO fdao;

    public DataOvertimeDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public boolean insert(DataOvertime dataOvertime) {
        return this.fdao.executeDML("INSERT INTO data_overtime VALUES("
                + dataOvertime.getDataId()+ "," 
                + dataOvertime.getKaryawanId().getKaryawanId()+ ",'"                 
                + dataOvertime.getTgl()+ "',"
                +"to_date('"
                + dataOvertime.getJamMasuk()
                +"','HH24:MI'),"
                +"to_date('" 
                + dataOvertime.getJamPulang()
                + "','HH24:MI')," 
                + dataOvertime.getLevelId().getLevelId()
                + ","
                + dataOvertime.getStatusId().getStatusId()+")");
    }
    public boolean update(DataOvertime dataOvertime) {
        return this.fdao.executeDML("UPDATE data_overtime SET id_karyawan="
                + dataOvertime.getKaryawanId()+ ",tgl='" 
                + dataOvertime.getTgl()+ "',jam_masuk= to_date('"+ dataOvertime.getJamMasuk() 
                +"','HH24:MI'),jam_keluar= to_date('" + dataOvertime.getJamPulang()+ "','HH24:MI'),id_level=" + dataOvertime.getLevelId().getLevelId()
                + ",id_status = "+ dataOvertime.getStatusId().getStatusId()+
                " WHERE id="+dataOvertime.getDataId());
    }
    
    public boolean delete(int dataId) {
        return this.fdao.executeDML("DELETE data_overtime WHERE id_karyawan = " + dataId);
    }
    
    public List<Object[]> getAll() {
        return this.fdao.getAll("Select * FROM data_overtime");
    }
    
    /**
     * fungsi ini digunakan untuk menampilkan semua data berdasarkan parameter tertentu
     * @param category String
     * @param sort String
     * @return nilai atribut yang berurutan berdasarkan parameter kategori
     */
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("Select * FROM data_overtime ORDER BY " + category + " " + sort);
    }

    /**
     * fungsi ini digunakan untuk mencari data pada tabel Departments yang memiliki persamaan dengan karakter yang ada pada data 
     * @param category String
     * @param data String
     * @return nilai 
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT * FROM data_overtime WHERE " + category + " LIKE '%" + data + "%'");
    }

    /**
     * fungsi ini digunakan untuk menampilkan nilai berdasarkan id
     * @param dataId Integer
     * @return nilai atribut id
     */
    public Object getById(int dataId) {
        return this.fdao.getAll("SELECT * FROM data_overtime WHERE id=" + dataId);
    }

    /**
     * fungsi ini digunakan untuk mendapatkan niali id maksimal yang ditambahkan 1
     * @return nilai id maksimal yang ditambah 1
     */
    public String getAutoId() {
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM data_overtime");
    }
}
