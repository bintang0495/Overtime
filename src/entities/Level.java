/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


/**
 *
 * @author BINTANG
 */
public class Level {
    private int levelId;
    private String waktuLembur;

    public Level() {
    }

    public Level(int levelId, String waktuLembur) {
        this.levelId = levelId;
        this.waktuLembur = waktuLembur;
    }

    /**
     * @return the levelId
     */
    public int getLevelId() {
        return levelId;
    }

    /**
     * @param levelId the levelId to set
     */
    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    /**
     * @return the waktuLembur
     */
    public String getWaktuLembur() {
        return waktuLembur;
    }

    /**
     * @param waktuLembur the waktuLembur to set
     */
    public void setWaktuLembur(String waktuLembur) {
        this.waktuLembur = waktuLembur;
    }
    
}
