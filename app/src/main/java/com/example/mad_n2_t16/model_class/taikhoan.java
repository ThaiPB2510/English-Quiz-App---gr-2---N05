package com.example.mad_n2_t16.model_class;

import java.io.Serializable;

public class taikhoan implements Serializable {

    private int id;
    private String taiKhoan;
    private String matKhau;
    private String email;
    private String ngaySinh = null;
    private String sdt = null;
    private String address = null;

    public taikhoan(int id, String taiKhoan, String matKhau,String email, String ngaySinh, String sdt, String address) {
        this.id = id;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.address = address;
    }

    public taikhoan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
