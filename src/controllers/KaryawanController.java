/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.KaryawanDAO;
import entities.Karyawan;
import entities.Role;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class KaryawanController {
    private final KaryawanDAO kdao;

    public KaryawanController(Connection connection) {
        this.kdao = new KaryawanDAO(connection);
    }
    
    public boolean save(String karyawanId,String roleId, String karyawanName,String tglLahir,String tglMasuk,String alamat,String gaji){
        return this.kdao.insert(new Karyawan(Integer.parseInt(karyawanId), new Role(Integer.parseInt(roleId), "")
                , karyawanName, java.sql.Date.valueOf(tglLahir), java.sql.Date.valueOf(tglMasuk), alamat, Integer.parseInt(gaji)));
    }
    
    public boolean edit(String karyawanId,String roleId, String karyawanName,String tglLahir,String tglMasuk,String alamat,String gaji){
        return this.kdao.update(new Karyawan(Integer.parseInt(karyawanId), new Role(Integer.parseInt(roleId), "")
                , karyawanName, java.sql.Date.valueOf(tglLahir), java.sql.Date.valueOf(tglMasuk), alamat, Integer.parseInt(gaji)));
    }
    
    public boolean drop(int id){
        return this.kdao.delete(id);
    }
    
    public List<Object[]> binding(){
        return this.kdao.getAll();
    }
    
    public List<Object[]> bindingSort(String category,String sort){
        return this.kdao.getAllSort(category, sort);
    }
    
    public List<Object[]> find(String category, String data){
        return this.kdao.search(category, data);
    }
    
    public Object findById(String id){
        return this.kdao.getById(Integer.parseInt(id));
    }
    
    public String getAutoId(){
        return this.kdao.getAutoId();
    }  
}
