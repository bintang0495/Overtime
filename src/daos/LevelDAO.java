/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;

/**
 *
 * @author BINTANG
 */
public class LevelDAO {
    private FunctionDAO fdao;

    public LevelDAO(Connection connection) {
        this.fdao = new FunctionDAO(connection);
    }
    
    public Object getById(int id) {
        return this.fdao.getAll("SELECT * FROM Level WHERE id=" + id);
    }
}
