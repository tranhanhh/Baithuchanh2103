package Slide16;

import java.util.Scanner;

public class hinhchunhat {
    float chieuRong;
    float ChieuDai;
    float CV;
    float DT;

    void nhapChieuRong() {
        System.out.println("nhập chiều rộng hình chữ nhật: ");//in ra yêu cầu nhập chiều rộng 
        try (Scanner sc = new Scanner(System.in)) {
            chieuRong = sc.nextFloat();
        }
    }

    void nhapChieuDai() {
        System.out.println("nhập chiều dai hình chữ nhật: ");
        try (Scanner sc = new Scanner(System.in)) {
            ChieuDai = sc.nextFloat();
        }
    }

    void chuVi() {
        CV = (chieuRong + ChieuDai) * 2;
    }

    void dienTich() {
        DT = chieuRong * ChieuDai;
    }

    void InChuVi() {
        System.out.println("chu vi hình chữ nhật là : " + CV);
    }

    void InDienTich() {
        System.out.println("diện tích hình chữ nhật là : " + DT);
    }
}
