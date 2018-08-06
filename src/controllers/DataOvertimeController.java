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
    public boolean save(String dataId,String karyawanId,String tgl,String jamPulang,String levelId,String statusId,String upahLembur,String keterangan){
        Karyawan karyawan = (Karyawan) this.dodao.getById(Integer.parseInt(karyawanId));
        Level level = (Level) this.dodao.getById(Integer.parseInt(levelId));
        Status status = (Status) this.dodao.getById(Integer.parseInt(statusId));
//        char[] temp_jpulang = jamPulang.toCharArray();
//        int jam_plg = Integer.parseInt(temp_jpulang[0]+""+temp_jpulang[1]);
//        int param = 17;
//        double upah=0;
//        if(jam_plg-param == 1){
//            upah = (karyawan.getGaji()*1/173)*1.5;
//        }else if(jam_plg-param == 2){
//            upah = (karyawan.getGaji()*1/173)*1.5+(karyawan.getGaji()*1/173)*2;
//        }else if(jam_plg-param >= 3){
//            upah = (karyawan.getGaji()*1/173)*1.5+(karyawan.getGaji()*1/173)*2+(karyawan.getGaji()*1/173)*2;
//        }
//        
        
        return this.dodao.insert(new DataOvertime(Integer.parseInt(dataId),karyawan,tgl,jamPulang,level,status,Integer.parseInt(upahLembur),keterangan));
                
    }
    
    public boolean edit(String dataId,String karyawanId,String tgl,String jamPulang,String levelId,String statusId,String upahLembur,String keterangan){
        Karyawan karyawan = (Karyawan) this.dodao.getById(Integer.parseInt(karyawanId));
        Level level = (Level) this.dodao.getById(Integer.parseInt(levelId));
        Status status = (Status) this.dodao.getById(Integer.parseInt(statusId));
        return this.dodao.update(new DataOvertime(Integer.parseInt(dataId),karyawan,tgl,jamPulang,level,status,Integer.parseInt(upahLembur),keterangan));
    }
    
    public boolean drop(int id){
        return this.dodao.delete(id);
    }
    
    public List<Object[]> binding(){
        return this.dodao.getAll();
    }
    
    public List<Object[]> bindingSort(String category,String sort){
        return this.dodao.getAllSort(category, sort);
    }
    
    public List<Object[]> find(String category, String data){
        return this.dodao.search(category, data);
    }
    
    public Object findById(String id){
        return this.dodao.getById(Integer.parseInt(id));
    }
    
    public String getAutoId(){
        return this.dodao.getAutoId();
    }
}
