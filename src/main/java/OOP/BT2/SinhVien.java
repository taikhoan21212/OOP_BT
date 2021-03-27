package OOP.BT2;

public class SinhVien {
    private int maSV;
    private String Hoten;
    private float diemTH, DiemLT;

    public SinhVien() {
        this(0, "", 0.0f, 0.0f);
    }

    public String toString() {
        String sf = String.format("%-5d %-30s %10.2f %10.2f %10.2f", maSV, Hoten,
                DiemLT, diemTH,getDiemTB());
        return sf;
    }
    // Diem Trung Binh
    public float getDiemTB() {

        return (DiemLT + diemTH)/2;
    }

    public SinhVien(int maSV, String hoten, float diemTH, float diemLT) {
        this.maSV = maSV;
        Hoten = hoten;
        this.diemTH = diemTH;
        DiemLT = diemLT;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(float diemLT) {
        DiemLT = diemLT;
    }
}
