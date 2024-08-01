package baitap1.entity;

import java.util.Scanner;

public class SinhVienTN extends SinhVien {

    private double ly;
    private double hoa;
    private double sinh;

    public SinhVienTN(String maSinhVien, String tenSinhVien, int tuoi, String queQuan) {
        super(maSinhVien, tenSinhVien, tuoi, queQuan);
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getSinh() {
        return sinh;
    }

    public void setSinh(double sinh) {
        this.sinh = sinh;
    }

    @Override
    public void diHoc() {
        System.out.println("Sinh viên đang học ở khoa Tự nhiên");
    }

    @Override
    public void diThi() {

        Scanner sc = new Scanner(System.in);
        super.diThi();

        do{
            System.out.println("Điểm Lý: ");
            this.setLy(sc.nextDouble());
            if (this.getLy() < 0 || this.getLy() > 10){
                System.out.println("Điểm không hợp lệ, vui lòng nhập lại !!");
            }else break;
        }while (true);

        do{
            System.out.println("Điểm Hóa: ");
            this.setHoa(sc.nextDouble());
            if (this.getHoa() < 0 || this.getHoa() > 10){
                System.out.println("Điểm không hợp lệ, vui lòng nhập lại !!");
            }else break;
        }while (true);

        do{
            System.out.println("Điểm Sinh: ");
            this.setSinh(sc.nextDouble());
            if (this.getSinh() < 0 || this.getSinh() > 10){
                System.out.println("Điểm không hợp lệ, vui lòng nhập lại !!");
            }else break;
        }while (true);

        double diemTrungBinh = (((this.getToan() + this.getLy()) * 2)
                                + this.getSinh()
                                + this.getHoa()
                                + this.getVan())/7;

        super.setDiemTrungBinh(diemTrungBinh);
    }


    @Override
    public void xuatThongTinSinhVien() {

        super.xuatThongTinSinhVien();
        this.diHoc();

        if(super.isDaThi()){
            super.xuatKetQuaHocTap();
            System.out.println("+ Điểm lý: " + this.getLy());
            System.out.println("+ Điểm hóa: " + this.getHoa());
            System.out.println("+ Điểm sinh: " + this.getSinh());
            System.out.println("+ Điểm trung bình: " + super.getDiemTrungBinh());
        }else{
            System.out.println("Sinh vien nay chua thi");
        }

    }


}
