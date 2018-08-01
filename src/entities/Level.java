/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author BINTANG
 */
public class Level {
    private int levelId;
    private Date waktuLembur;
    private int upahLembur;

    public Level() {
    }

    public Level(int levelId, Date waktuLembur, int upahLembur) {
        this.levelId = levelId;
        this.waktuLembur = waktuLembur;
        this.upahLembur = upahLembur;
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
    public Date getWaktuLembur() {
        return waktuLembur;
    }

    /**
     * @param waktuLembur the waktuLembur to set
     */
    public void setWaktuLembur(Date waktuLembur) {
        this.waktuLembur = waktuLembur;
    }

    /**
     * @return the upahLembur
     */
    public int getUpahLembur() {
        return upahLembur;
    }

    /**
     * @param upahLembur the upahLembur to set
     */
    public void setUpahLembur(int upahLembur) {
        this.upahLembur = upahLembur;
    }
    
}
