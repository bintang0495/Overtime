/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.KaryawanDAO;
import daos.RoleDAO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class RoleController {
    private final RoleDAO rdao;

    public RoleController(Connection connection) {
        this.rdao = new RoleDAO(connection);
    }
    
    public List<Object[]> bindingSort(String category,String sort){
        return this.rdao.getAllSort(category, sort);
    }
    
    public Object findById(String id){
        return this.rdao.getById(Integer.parseInt(id));
    }
}
