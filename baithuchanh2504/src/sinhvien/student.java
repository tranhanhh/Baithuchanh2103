package sinhvien;

import java.util.Scanner;

public class student extends person {

    public boolean gioitinh; //luu gioi tinh
    public String quequan;
    public int namsinh;

    public void nhap() {
        System.out.println("nhập năm sinh = ");
        Scanner scanner = new Scanner(System.in); //ham de luu
        namsinh = scanner.nextInt(); //gan nam sinh vua nhap vtu ban phim vao bien ten nam sinh
    }

    public void tinhtuoi() {
        int tuoi = 2022 - namsinh; //phuong thuc tinh tuoi (thuat toan)
        System.out.println(+tuoi);
    }
}
