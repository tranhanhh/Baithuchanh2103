
import java.util.Scanner;

public class giaiphuongtrinhb2 {
    float a;
    float b;
    float c;

    void Nhap() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập hệ số bậc 2, a = ");
            a = scanner.nextFloat();
            System.out.print("Nhập hệ số bậc 1, b = ");
            b = scanner.nextFloat();
            System.out.print("Nhập hằng số tự do, c = ");
            c = scanner.nextFloat();
        }
    }

    void giaiphuongtrinh() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }

    }

    public static void main(String[] args) throws Exception {
        person person = new person();
        sinhvien sinhvien = new sinhvien();
        giaiphuongtrinhb2 phuongTrinhBacHai = new giaiphuongtrinhb2();
        person.nhap();
        person.Inthongtin();
        sinhvien.NhapThongTin();
        sinhvien.InthongtinSV();
        phuongTrinhBacHai.Nhap();
        phuongTrinhBacHai.giaiphuongtrinh();
    }

}
