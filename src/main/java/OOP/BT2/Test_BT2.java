package OOP.BT2;
// lớp Sinh viên
import java.util.Scanner;

public class Test_BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien bt1 = new SinhVien(1, "phan tai", 5, 6);
        SinhVien bt2 = new SinhVien(2, "duc tai", 5, 6);
        SinhVien bt3 = new SinhVien();

        System.out.print("Nhập mã số của sinh viên sv3: ");
        int masv = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập họ và tên của sinh viên sv3: ");
        String hoten = sc.nextLine();
        System.out.print("Nhập điểm lý thuyết của sinh viên sv3: ");
        float diemlt = sc.nextFloat();
        System.out.print("Nhập điểm thực hành của sinh viên sv3: ");
        float diemth = sc.nextFloat();

        bt3.setMaSV(masv);
        bt3.setHoten(hoten);
        bt3.setDiemLT(diemlt);
        bt3.setDiemTH(diemth);

        System.out.println(String.format("%-5s %-30s %10s %10s %10s", "masv",
                "hoten", "diemlt", "diemth", "diemtb"));

        System.out.println(bt1);
        System.out.println(bt2);
        System.out.println(bt3);
    }
}
