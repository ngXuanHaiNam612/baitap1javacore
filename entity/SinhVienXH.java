package baitap1.entity;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SinhVienXH extends SinhVien {

    private double Su;
    private double Dia;
    private double GDCD;

    public SinhVienXH(String maSinhVien, String tenSinhVien, int tuoi, String queQuan) {
        super(maSinhVien, tenSinhVien, tuoi, queQuan);
    }

    public double getSu() {
        return Su;
    }

    public void setSu(double su) {
        Su = su;
    }

    public double getDia() {
        return Dia;
    }

    public void setDia(double dia) {
        Dia = dia;
    }

    public double getGDCD() {
        return GDCD;
    }

    public void setGDCD(double GDCD) {
        this.GDCD = GDCD;
    }

    @Override
    public void diHoc() {
        System.out.println("Sinh viên đang học ở khoa Xã Hội");

    }

    @Override
    public void diThi() {
        Scanner sc = new Scanner(System.in);
        super.diThi();

        do{
            System.out.println("Điểm Sử: ");
            this.setSu(sc.nextDouble());
            if (this.getSu() < 0 || this.getSu() > 10){
                System.out.println("Điểm không hợp lệ, vui lòng nhập lại !!");
            }else break;
        }while (true);

        do{
            System.out.println("Điểm Địa: ");
            this.setDia(sc.nextDouble());
            if (this.getDia() < 0 || this.getDia() > 10){
                System.out.println("Điểm không hợp lệ, vui lòng nhập lại !!");
            }else break;
        }while (true);

        do{
            System.out.println("Điểm GDCD: ");
            this.setGDCD(sc.nextDouble());
            if (this.getGDCD() < 0 || this.getGDCD() > 10){
                System.out.println("Điểm không hợp lệ, vui lòng nhập lại !!");
            }else break;
        }while (true);

        double diemTrungBinh = (((this.getSu() + this.getDia() + this.getGDCD()) * 2)
                                + this.getToan()
                                + this.getVan())/8;

        super.setDiemTrungBinh(diemTrungBinh);
    }

    @Override
    public void xuatThongTinSinhVien() {
        super.xuatThongTinSinhVien();
        this.diHoc();
        if(super.isDaThi()){
            super.xuatKetQuaHocTap();
            System.out.println("+ Điểm sử: " + this.getSu());
            System.out.println("+ Điểm địa: " + this.getDia());
            System.out.println("+ Điểm GDCD: " + this.getGDCD());
            System.out.println("+ Điểm trung bình: " + super.getDiemTrungBinh());
        } else{
            System.out.println("Sinh vien nay chua thi");
        }
    }
}
