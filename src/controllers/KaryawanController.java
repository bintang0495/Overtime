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
    
    /**
     * 
     * @param karyawanId
     * @param roleId
     * @param karyawanName
     * @param tglLahir
     * @param tglMasuk
     * @param alamat
     * @param gaji
     * @return 
     */
    public boolean save(String karyawanId,String roleId, String karyawanName,String tglLahir,String tglMasuk,String alamat,String gaji){
        return this.kdao.insert(new Karyawan(Integer.parseInt(karyawanId), new Role(Integer.parseInt(roleId), "")
                , karyawanName, tglLahir, tglMasuk, alamat, Integer.parseInt(gaji)));
    }
    
    /**
     * 
     * @param karyawanId
     * @param roleId
     * @param karyawanName
     * @param tglLahir
     * @param tglMasuk
     * @param alamat
     * @param gaji
     * @return 
     */
    public boolean edit(String karyawanId,String roleId, String karyawanName,String tglLahir,String tglMasuk,String alamat,String gaji){
        return this.kdao.update(new Karyawan(Integer.parseInt(karyawanId), new Role(Integer.parseInt(roleId), "")
                , karyawanName, tglLahir, tglMasuk, alamat, Integer.parseInt(gaji)));
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean drop(int id){
        return this.kdao.delete(id);
    }
    
    /**
     * 
     * @return 
     */
    public List<Object[]> binding(){
        return this.kdao.getAll();
    }
    
    /**
     * 
     * @param category
     * @param sort
     * @return 
     */
    public List<Object[]> bindingSort(String category,String sort){
        return this.kdao.getAllSort(category, sort);
    }
    
    /**
     * 
     * @param category
     * @param data
     * @return 
     */
    public List<Object[]> find(String category, String data){
        return this.kdao.search(category, data);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public Object findById(String id){
        return this.kdao.getById(Integer.parseInt(id));
    }
    
    /**
     * 
     * @return 
     */
    public String getAutoId(){
        return this.kdao.getAutoId();
    }  
}
