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
public class DataOvertimeDAO {
    private final FunctionDAO fdao;
    private final Karyawan karyawan;

    public DataOvertimeDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
        this.karyawan = new Karyawan();
    }
    
//    public boolean insert(DataOvertime dataOvertime) {
//        return this.fdao.executeDML("INSERT INTO data_overtime VALUES("
//                + dataOvertime.getDataId()+ "," 
//                + dataOvertime.getKaryawanId().getKaryawanId()+ ",to_date('"                 
//                + dataOvertime.getTgl()+ "','mm/dd/yyyy'),"
//                +"to_date('" 
//                + dataOvertime.getJamPulang()
//                + "','HH24:MI')," 
//                + dataOvertime.getLevelId().getLevelId()
//                + ",'"
//                + dataOvertime.getStatusId().getStatusId()+"',"+dataOvertime.getUpahLembur()+",'"+dataOvertime.getKeterangan()+"')");
//    }
    
//    public boolean update(DataOvertime dataOvertime) {
//        return this.fdao.executeDML("UPDATE data_overtime SET id_karyawan="
//                + dataOvertime.getKaryawanId()+ ",tgl=to_date('" 
//                + dataOvertime.getTgl()+ "','mm/dd/yyyy'),jam_keluar= to_date('" + dataOvertime.getJamPulang()+ "','HH24:MI'),id_level=" + dataOvertime.getLevelId().getLevelId()
//                + ",id_status = '"+ dataOvertime.getStatusId().getStatusId()+"',upah_lembur="+dataOvertime.getUpahLembur()+
//                ",keterangan='"+dataOvertime.getKeterangan()+"' WHERE id="+dataOvertime.getDataId());
//    }
    
    public boolean delete(int dataId) {
        return this.fdao.executeDML("DELETE data_overtime WHERE id_karyawan = " + dataId);
    }
    
    /**
     * Mendapatkan nilai semua atribut pada tabel
     * @return 
     */
    public List<Object[]> getAll() {
        return this.fdao.getAll("SELECT d.id,k.nama,to_char(d.tgl,'mm/dd/yyyy'),to_char(d.jam_pulang,'HH24:MI'),d.id_level,s.status,upah_lembur,keterangan FROM data_overtime d JOIN Karyawan k ON \n" +
"d.id_karyawan = k.id JOIN Status_overtime s ON d.id_status=s.id");
    }
    
    /**
     * fungsi ini digunakan untuk menampilkan semua data berdasarkan parameter tertentu
     * @param category String
     * @param sort String
     * @return nilai atribut yang berurutan berdasarkan parameter kategori
     */
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT d.id,k.nama,to_char(d.tgl,'mm/dd/yyyy'),to_char(d.jam_pulang,'HH24:MI'),d.id_level,s.status,upah_lembur,keterangan FROM data_overtime d JOIN Karyawan k ON \n" +
"d.id_karyawan = k.id JOIN Status_overtime s ON d.id_status=s.id ORDER BY " + category + " " + sort);
    }

    /**
     * fungsi ini digunakan untuk mencari data pada tabel Departments yang memiliki persamaan dengan karakter yang ada pada data 
     * @param category String
     * @param data String
     * @return nilai 
     */
    public List<Object[]> search(String category, String data) {
        return this.fdao.getAll("SELECT d.id,k.nama,tgl,to_char(d.jam_pulang,'HH24:MI'),d.id_level,s.status,upah_lembur,keterangan FROM data_overtime d JOIN Karyawan k ON \n" +
"d.id_karyawan = k.id JOIN Status_overtime s ON d.id_status=s.id WHERE " + category + " LIKE '%" + data + "%'");
    }

    /**
     * fungsi ini digunakan untuk menampilkan nilai berdasarkan id
     * @param dataId Integer
     * @return nilai atribut id
     */
    public Object getById(int dataId) {
        return this.fdao.getAll("SELECT d.id,k.nama,tgl,to_char(d.jam_pulang,'HH24:MI'),d.id_level,s.status,upah_lembur,keterangan FROM data_overtime d JOIN Karyawan k ON \n" +
"d.id_karyawan = k.id JOIN Status_overtime s ON d.id_status=s.id WHERE id=" + dataId);
    }

    /**
     * fungsi ini digunakan untuk mendapatkan niali id maksimal yang ditambahkan 1
     * @return nilai id maksimal yang ditambah 1
     */
    public String getAutoId() {
        return this.fdao.getAutoID("SELECT MAX(id)+1 AS MAXID FROM data_overtime");
    }
}
