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

    public DataOvertimeController(Connection connection) {
        this.dodao = new DataOvertimeDAO(connection);
        this.kdao = new KaryawanDAO(connection);
        this.ldao = new LevelDAO(connection);
        this.sdao = new StatusDAO(connection);
    }
    
    
    public boolean save(String dataId,String karyawanId,String tgl,String jamMasuk,String jamPulang,String levelId,String statusId){
        Karyawan karyawan = (Karyawan) this.dodao.getById(Integer.parseInt(karyawanId));
        Level level = (Level) this.dodao.getById(Integer.parseInt(levelId));
        Status status = (Status) this.dodao.getById(Integer.parseInt(statusId));
        return this.dodao.insert(new DataOvertime(Integer.parseInt(dataId),karyawan,java.sql.Date.valueOf(tgl),jamMasuk,jamPulang,level,status));
                
    }
    
    public boolean edit(String dataId,String karyawanId,String tgl,String jamMasuk,String jamPulang,String levelId,String statusId){
        Karyawan karyawan = (Karyawan) this.dodao.getById(Integer.parseInt(karyawanId));
        Level level = (Level) this.dodao.getById(Integer.parseInt(levelId));
        Status status = (Status) this.dodao.getById(Integer.parseInt(statusId));
        return this.dodao.update(new DataOvertime(Integer.parseInt(dataId),karyawan,java.sql.Date.valueOf(tgl),jamMasuk,jamPulang,level,status));
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
