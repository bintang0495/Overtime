/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author BINTANG
 */
public class DataOvertime {
    private int dataId;
    private Karyawan karyawanId;
    private String tgl;
    private String jamPulang;
    private Level levelId;
    private Status statusId;
    private int upahLembur;
    private String keterangan;

    public DataOvertime() {
    }
    /**
     * Konstruktor dataOvertime
     * @param dataId
     * @param karyawanId
     * @param tgl
     * @param jamMasuk
     * @param jamPulang
     * @param levelId
     * @param statusId
     * @param upahLembur
     * @param keterangan 
     */
    public DataOvertime(int dataId, Karyawan karyawanId, String tgl, String jamPulang, Level levelId, Status statusId, int upahLembur,String keterangan) {
        this.dataId = dataId;
        this.karyawanId = karyawanId;
        this.tgl = tgl;
        this.jamPulang = jamPulang;
        this.levelId = levelId;
        this.statusId = statusId;
        this.upahLembur = upahLembur;
        this.keterangan = keterangan;
    }
    
    /**
     * @return the dataId
     */
    public int getDataId() {
        return dataId;
    }

    /**
     * @param dataId the dataId to set
     */
    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    /**
     * @return the karyawanId
     */
    public Karyawan getKaryawanId() {
        return karyawanId;
    }

    /**
     * @param karyawanId the karyawanId to set
     */
    public void setKaryawanId(Karyawan karyawanId) {
        this.karyawanId = karyawanId;
    }

    /**
     * @return the tgl
     */
    public String getTgl() {
        return tgl;
    }

    /**
     * @param tgl the tgl to set
     */
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    /**
     * @return the jamMasuk
     */

    /**
     * @param jamMasuk the jamMasuk to set
     */


    /**
     * @return the jamPulang
     */
    public String getJamPulang() {
        return jamPulang;
    }

    /**
     * @param jamPulang the jamPulang to set
     */
    public void setJamPulang(String jamPulang) {
        this.jamPulang = jamPulang;
    }

    /**
     * @return the levelId
     */
    public Level getLevelId() {
        return levelId;
    }

    /**
     * @param levelId the levelId to set
     */
    public void setLevelId(Level levelId) {
        this.levelId = levelId;
    }

    /**
     * @return the statusId
     */
    public Status getStatusId() {
        return statusId;
    }

    /**
     * @param statusId the statusId to set
     */
    public void setStatusId(Status statusId) {
        this.statusId = statusId;
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

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    
    
}
