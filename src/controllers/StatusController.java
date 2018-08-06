/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.StatusDAO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class StatusController {
    private final StatusDAO sdao;
    public StatusController(Connection connection) {
        this.sdao = new StatusDAO(connection);
    }
    
    public List<Object[]> bindingSort(String category,String sort){
        return this.sdao.getAllSort(category, sort);
    }
    
    public Object findById(String id){
        return this.sdao.getById(Integer.parseInt(id));
    }
}
