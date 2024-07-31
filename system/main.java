package baitap1.system;


import baitap1.entity.*;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();

        SinhVien sinhVienXH1 = new SinhVienXH("012","Nguyễn Xuân Hải Nam", 24, "Long An");
        SinhVien sinhVienXH2 = new SinhVienXH("011","Đào Công Hùng", 26, "Bảo Lộc");
        SinhVien sinhVienXH3 = new SinhVienXH("023","Trần Hoàng Tuấn", 24, "TPHCM");

        SinhVien sinhVienTN1 = new SinhVienTN("044", "Phan Huy Hoàng", 24, "Long An");
        SinhVien sinhVienTN2 = new SinhVienTN("105", "Nguyễn Gia Minh", 26, "Bảo Lộc");
        SinhVien sinhVienTN3 = new SinhVienTN("026", "Khầy Đạt", 23, "Đồng Nai");

        danhSachSinhVien.add(sinhVienXH1);
        danhSachSinhVien.add(sinhVienXH2);
        danhSachSinhVien.add(sinhVienXH3);
        danhSachSinhVien.add(sinhVienTN1);
        danhSachSinhVien.add(sinhVienTN2);
        danhSachSinhVien.add(sinhVienTN3);

        QuanLySinhVien quanLySinhVien = new QuanLySinhVien(danhSachSinhVien);
        quanLySinhVien.run();

    }
}
