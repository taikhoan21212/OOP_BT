package OOP;

public class BT4 {
    private String name;
    private String loaiXe;
    private float giaTri;
    private float dungTich;

    @Override
    public String toString() {
        return String.format("%-30s %-20s %10f %20.2f %18.2f" , name, loaiXe, dungTich, giaTri, tax());
    }

    public BT4() {
        name = "NULL";
        loaiXe = "NULL";
        giaTri = 0f;
        dungTich = 0f;
    }

    public BT4(String name, String loaiXe, float giaTri, float capacity) {
        if (!name.equals(""))
            this.name = name;
        else
            this.name = "NULL";

        if (!loaiXe.equals(""))
            this.loaiXe = loaiXe;
        else
            this.loaiXe = "NULL";

        if (giaTri >= 0f)
            this.giaTri = giaTri;
        else
            this.giaTri = 0f;

        if (capacity >= 0f)
            this.dungTich = capacity;
        else
            this.dungTich = 0f;
    }

    public float tax() {
        if (dungTich < 100f)
            return 0.01f * giaTri;
        else if (dungTich >= 100f && dungTich <= 200f)
            return 0.03f * giaTri;
        else
            return 0.05f * giaTri;
    }
}

