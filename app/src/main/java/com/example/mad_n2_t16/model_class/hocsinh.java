package com.example.mad_n2_t16.model_class;

public class hocsinh {
    private int idHS;
    private String ngaySinh;
    private String sdt;
    private String name;
    private String address;

    public hocsinh(int idHS, String ngaySinh, String sdt, String name, String address) {
        this.idHS = idHS;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.name = name;
        this.address = address;
    }

    public hocsinh() {
    }

    public int getIdHS() {
        return idHS;
    }

    public void setIdHS(int idHS) {
        this.idHS = idHS;
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

    public void setSdt(String email) {
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
