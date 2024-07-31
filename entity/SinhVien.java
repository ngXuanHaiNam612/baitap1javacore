package baitap1.entity;

import baitap1.actions.HocTap;

import java.util.Scanner;

public abstract class SinhVien implements HocTap{

    private String maSinhVien;
    private String tenSinhVien;
    private int tuoi;
    private String queQuan;
    private double toan;
    private double van;

    private boolean daThi = false;
    private int lanThi = 0;
    private double diemTrungBinh = 0;


    public SinhVien(String maSinhVien, String tenSinhVien, int tuoi, String queQuan) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getTen() {
        String ten[] = tenSinhVien.split(" ");
        this.tenSinhVien = tenSinhVien;
        return ten[ten.length - 1];
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public boolean isDaThi() {
        return daThi;
    }

    public void setDaThi(boolean daThi) {
        this.daThi = daThi;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void  setDiemTrungBinh(double diemTrungBinh){
        this.diemTrungBinh = diemTrungBinh;
    }


    @Override
    public void diThi() {

        this.setDaThi(true);
        this.setLanThi(this.getLanThi()+1);
        System.out.println("Sinh viên đã thi xong, vui lòng nhập điểm thi");

        Scanner sc = new Scanner(System.in);

        System.out.print("Điểm Toán: ");
        setToan(sc.nextDouble());

        System.out.println("Điểm Văn: ");
        setVan(sc.nextDouble());
    }

    @Override
    public void xuatThongTinSinhVien(){

        System.out.println("+ Họ tên sinh viên: " + this.getTenSinhVien());
        System.out.println("+ Tuổi: " + this.getTuoi());
        System.out.println("+ Quê quán: " + this.getQueQuan());

    }

    @Override
    public void xuatKetQuaHocTap(){

            System.out.println("Sinh vien da thi, so lan thi " + this.getLanThi() );
            System.out.println("+ Điểm toán: " + this.getToan());
            System.out.println("+ Điểm văn: " + this.getVan());

    }




}

