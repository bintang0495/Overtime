/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DataOvertimeDAO;
import daos.KaryawanDAO;
import daos.LevelDAO;
import daos.StatusDAO;
import entities.DataOvertime;
import entities.Karyawan;
import entities.Level;
import entities.Role;
import entities.Status;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class DataOvertimeController {
    private final DataOvertimeDAO dodao;
    private final KaryawanDAO kdao;
    private final LevelDAO ldao;
    private final StatusDAO sdao;
    
    /**
     * Mengkoneksikan controller pada database
     * @param connection Connection
     */
    public DataOvertimeController(Connection connection) {
        this.dodao = new DataOvertimeDAO(connection);
        this.kdao = new KaryawanDAO(connection);
        this.ldao = new LevelDAO(connection);
        this.sdao = new StatusDAO(connection);
    }
    
    /**
     * Fungsi untuk menyimpan data, 
     * @param dataId
     * @param karyawanId
     * @param tgl
     * @param jamMasuk
     * @param jamPulang
     * @param levelId
     * @param statusId
     * @param upahLembur
     * @param keterangan
     * @return 
     */
//    public boolean save(String dataId,String karyawanId,String tgl,String jamPulang,String levelId,String statusId,String upahLembur,String keterangan){
//        Karyawan karyawan = (Karyawan) this.dodao.getById(Integer.parseInt(karyawanId));
//        Level level = (Level) this.dodao.getById(Integer.parseInt(levelId));
//        Status status = (Status) this.dodao.getById(Integer.parseInt(statusId));
//        
//        return this.dodao.insert(new DataOvertime(Integer.parseInt(dataId),karyawan,tgl,jamPulang,level,status,Integer.parseInt(upahLembur),keterangan));
//                
//    }
    
    /**
     * Fungsi untuk menyimpan data Overtime
     * @param dataId
     * @param karyawanId
     * @param tgl
     * @param jamPulang
     * @param levelId
     * @param statusId
     * @param upahLembur
     * @param keterangan
     * @return true/false
     */
//    public boolean edit(String dataId,String karyawanId,String tgl,String jamPulang,String levelId,String statusId,String upahLembur,String keterangan){
//        Karyawan karyawan = (Karyawan) this.dodao.getById(Integer.parseInt(karyawanId));
//        Level level = (Level) this.dodao.getById(Integer.parseInt(levelId));
//        Status status = (Status) this.dodao.getById(Integer.parseInt(statusId));
//        return this.dodao.update(new DataOvertime(Integer.parseInt(dataId),karyawan,tgl,jamPulang,level,status,Integer.parseInt(upahLembur),keterangan));
//    }
    
    /**
     * Fungsi untuk menghapus row pada data overtime
     * @param id
     * @return true/false
     */
    public boolean drop(int id){
        return this.dodao.delete(id);
    }
    
    /**
     * Fungsi untuk menampilkan seluruh data yang ada pada data overtime
     * @return List
     */
    public List<Object[]> binding(){
        return this.dodao.getAll();
    }
    
    /**
     * Fungsi ini menampilkan seluruh data tersortir pada data overtime
     * @param category
     * @param sort
     * @return List
     */
    public List<Object[]> bindingSort(String category,String sort){
        return this.dodao.getAllSort(category, sort);
    }
    /**
     * Fungsi ini dibuat untuk melakukan pencarian pada data
     * @param category
     * @param data
     * @return 
     */
    public List<Object[]> find(String category, String data){
        return this.dodao.search(category, data);
    }
    
    /**
     * Fungsi untuk mencari id dari data \
     * @param id
     * @return Objek
     */
    public Object findById(String id){
        return this.dodao.getById(Integer.parseInt(id));
    }
    
    /**
     * Fungsi untuk mendapatkan id max(id)+1 
     * @return id
     */
    public String getAutoId(){
        return this.dodao.getAutoId();
    }
}
