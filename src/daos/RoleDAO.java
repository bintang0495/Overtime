/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author BINTANG
 */
public class RoleDAO {
    private FunctionDAO fdao;

    public RoleDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public Object getById(int dataId) {
        return this.fdao.getAll("SELECT * FROM Role WHERE id=" + dataId);
    }
    
    public List<Object[]> getAllSort(String category, String sort) {
        return this.fdao.getAll("SELECT * FROM Role ORDER BY "+category+" "+sort);
    }
    
}
