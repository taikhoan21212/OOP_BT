package OOP.Bt4;

public class Text_BT4 {
    public static void main (String[] args) {
        BT4 xe1 = new BT4("Nguyen Thu Loan", "Future Neo", 35000000f, 100f);
        BT4 xe2 = new BT4("Le Minh Tinh", "Ford Ranger", 250000000f, 3000f);
        BT4 xe3 = new BT4("Nguyen Minh Triet", "Landscape", 1000000000f, 1500f);

        System.out.printf("%-30s %-20s %14.2f %20.2f %18.2f\n", "Ten Chu Xe", "Loai Xe", "Dung Tich", "Gia Tri", "Thue Phai Nop");
        System.out.println("=======================================================================================================");
        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);
    }
}