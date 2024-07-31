package baitap1.entity;

import java.util.*;

public class QuanLySinhVien implements baitap1.actions.QuanLySinhVien {

    private ArrayList<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();

    public QuanLySinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public List<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void setDanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }




    @Override
    public void nhapDiemSinhVien() {
        System.out.println("Đợt thi bắt đầu!!!");
        for(SinhVien sv : this.getDanhSachSinhVien()){
            System.out.println("Sinh viên: " + sv.getTenSinhVien());
            sv.diThi();
        }
        System.out.println("Đợt thi kết thúc!!!");

    }

    @Override
    public void xuatDanhSachSinhVien() {

        System.out.println("=========================================");
        System.out.println("=          DANH SÁCH SINH VIÊN          =");
        System.out.println("=========================================");
        for(SinhVien sv : this.getDanhSachSinhVien()){
            System.out.println("\nSinh vien :" + sv.getMaSinhVien());
            sv.xuatThongTinSinhVien();
        }
        System.out.println("=========================================\n");


    }

    @Override
    public void xuatDanhSachSinhVienDiemTrungBinhTrenNamTheoTen() {
        ArrayList<SinhVien> danhSachSinhVienSapXep = (ArrayList<SinhVien>) danhSachSinhVien.clone();
        Collections.sort(danhSachSinhVienSapXep, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        System.out.println("=========================================");
        System.out.println("=          DANH SÁCH SINH VIÊN          =");
        System.out.println("=========================================");
        int count = 0;
        for(SinhVien sv : danhSachSinhVienSapXep){
            if (sv.getDiemTrungBinh() >= 5){
                System.out.println("\nSinh vien :" + sv.getMaSinhVien());
                sv.xuatThongTinSinhVien();
                count++;
            }
        }

        if (count == 0){
            System.out.println("Không có sinh viên có dtb >= 5");
        }
        System.out.println("=========================================\n");

    }

    @Override
    public void xuatDanhSachSinhVienDiemTrungBinhDuoiNamTheoMSSV() {

        ArrayList<SinhVien> danhSachSinhVienSapXep = (ArrayList<SinhVien>) danhSachSinhVien.clone();

        Collections.sort(danhSachSinhVienSapXep, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        System.out.println("=========================================");
        System.out.println("=          DANH SÁCH SINH VIÊN          =");
        System.out.println("=========================================");
        int count = 0;
        for(SinhVien sv : danhSachSinhVienSapXep){
            if (sv.getDiemTrungBinh() < 5){
                System.out.println("\nSinh vien :" + sv.getMaSinhVien());
                sv.xuatThongTinSinhVien();
                count++;
            }
        }

        if (count == 0){
            System.out.println("Không có sinh viên có dtb < 5");
        }
        System.out.println("=========================================\n");

    }

    @Override
    public void xuatDanhSachSinhVienDiemTrungBinhDuoiNamVaCong1DiemTrungBinh() {
        System.out.println("=========================================");
        System.out.println("=          DANH SÁCH SINH VIÊN          =");
        System.out.println("=========================================");
        int count = 0;
        for(SinhVien sv : this.getDanhSachSinhVien()){
            if (sv.getDiemTrungBinh() < 5){
                System.out.println("\nSinh vien :" + sv.getMaSinhVien());
                sv.xuatThongTinSinhVien();
                sv.setDiemTrungBinh(sv.getDiemTrungBinh() + 1);
                System.out.println("+ Đểm trung bình sau khi cộng là: " + sv.getDiemTrungBinh());
                count++;
            }
        }

        if (count == 0){
            System.out.println("Không có sinh viên có dtb >= 5");
        }
        System.out.println("=========================================\n");
    }

    public void run(){
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        do{
            System.out.println("\nVui lòng chọn một trong các lực chọn sau:");
            System.out.println("1. Xuất thông tin sinh viên");
            System.out.println("2. Xuất thông tin sinh viên có điểm trung bình trên 5 và sắp xếp theo tên");
            System.out.println("3. Xuất thông tin sinh viên có điểm trung bình dưới 5 và sắp xếp theo MSSV");
            System.out.println("4. Xuất thông tin sinh viên có điểm trung bình dưới 5 và cộng 1 điểm vào điểm trung bình");
            System.out.println("5. Bắt đầu kỳ thi");
            System.out.println("0. Thoát");

            do{
                System.out.println("Lựa chọn: ");
                choice = sc.nextInt();
            } while (choice <= 0 || choice > 5);

            switch (choice){
                case 1:
                    this.xuatDanhSachSinhVien();
                    break;
                case 2:
                    this.xuatDanhSachSinhVienDiemTrungBinhTrenNamTheoTen();
                    break;
                case 3:
                    this.xuatDanhSachSinhVienDiemTrungBinhDuoiNamTheoMSSV();
                    break;
                case 4:
                    this.xuatDanhSachSinhVienDiemTrungBinhDuoiNamVaCong1DiemTrungBinh();
                    break;
                case 5:
                    this.nhapDiemSinhVien();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while(choice != 0);
        sc.close();
    }
}
