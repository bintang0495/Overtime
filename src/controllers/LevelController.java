/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.LevelDAO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class LevelController {
    private final LevelDAO ldao;
    public LevelController(Connection connection) {
        this.ldao = new LevelDAO(connection);
    }
    
    /**
     * 
     * @param category
     * @param sort
     * @return 
     */
    public List<Object[]> bindingSort(String category,String sort){
        return this.ldao.getAllSort(category, sort);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public Object findById(String id){
        return this.ldao.getById(Integer.parseInt(id));
    }
}
