package OOP;
// lớp Sinh viên
import java.util.Scanner;

public class Test_BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BT2 bt1 = new BT2(1, "phan tai", 5, 6);
        BT2 bt2 = new BT2(2, "duc tai", 5, 6);
        BT2 bt3 = new BT2();

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
