package OOP.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excep {
    public static void main(String[] args) {
        try {
            int tuoi = nhaptuoinhanvien();
            System.out.println("Tuổi đã nhập: " + tuoi);
        } catch (InputMismatchException e) {
            System.out.println("Tuổi nhập vào chưa hợp lệ. Lỗi: " + e.toString());
        }catch (NumberFormatException e) {
            System.out.println("Tuổi nhập vào chưa hợp lệ. Lỗi: " + e.toString());
        }
    }

    private static int nhaptuoinhanvien() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int tuoi = scanner.nextInt();
        if (tuoi < 0) throw new NumberFormatException("tuổi không được nhỏ hơn 0.");
        if (tuoi > 120) throw new InputMismatchException("tuổi không được lon hơn 120.");
        return tuoi;
    }
}
