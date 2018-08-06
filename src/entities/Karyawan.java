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
public class Karyawan {
    private int karyawanId;
    private Role roleId;
    private String karyawanName;
    private String tglLahir;
    private String tglMasuk;
    private String alamat;
    private int gaji;

    public Karyawan() {
    }

    public Karyawan(int karyawanId, Role roleId, String karyawanName, String tglLahir, String tglMasuk, String alamat, int gaji) {
        this.karyawanId = karyawanId;
        this.roleId = roleId;
        this.karyawanName = karyawanName;
        this.tglLahir = tglLahir;
        this.tglMasuk = tglMasuk;
        this.alamat = alamat;
        this.gaji = gaji;
    }

    /**
     * @return the karyawanId
     */
    public int getKaryawanId() {
        return karyawanId;
    }

    /**
     * @param karyawanId the karyawanId to set
     */
    public void setKaryawanId(int karyawanId) {
        this.karyawanId = karyawanId;
    }

    /**
     * @return the roleId
     */
    public Role getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the karyawanName
     */
    public String getKaryawanName() {
        return karyawanName;
    }

    /**
     * @param karyawanName the karyawanName to set
     */
    public void setKaryawanName(String karyawanName) {
        this.karyawanName = karyawanName;
    }

    /**
     * @return the tglLahir
     */
    public String getTglLahir() {
        return tglLahir;
    }

    /**
     * @param tglLahir the tglLahir to set
     */
    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    /**
     * @return the tglMasuk
     */
    public String getTglMasuk() {
        return tglMasuk;
    }

    /**
     * @param tglMasuk the tglMasuk to set
     */
    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the gaji
     */
    public int getGaji() {
        return gaji;
    }

    /**
     * @param gaji the gaji to set
     */
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    
}
