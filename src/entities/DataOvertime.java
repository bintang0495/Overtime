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
    private Date tgl;
    private String jamMasuk;
    private String jamPulang;
    private Level levelId;
    private Status statusId;

    public DataOvertime() {
    }

    public DataOvertime(int dataId, Karyawan karyawanId, Date tgl, String jamMasuk, String jamPulang, Level levelId, Status statusId) {
        this.dataId = dataId;
        this.karyawanId = karyawanId;
        this.tgl = tgl;
        this.jamMasuk = jamMasuk;
        this.jamPulang = jamPulang;
        this.levelId = levelId;
        this.statusId = statusId;
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
    public Date getTgl() {
        return tgl;
    }

    /**
     * @param tgl the tgl to set
     */
    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    /**
     * @return the jamMasuk
     */
    public String getJamMasuk() {
        return jamMasuk;
    }

    /**
     * @param jamMasuk the jamMasuk to set
     */
    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

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

    
    
}
