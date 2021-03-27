package OOP.BT3;

// xuat tam giac
public class Text_BT3 {
    public static void main (String [] args){
        BT3 bt1 = new BT3(6,7,9);
        BT3 bt2 = new BT3(5,6,7);
        BT3 bt3 = new BT3(8,6,7);
        BT3 bt4 = new BT3(5,5,7);
        BT3 bt5 = new BT3(6,6,6);

        System.out.printf("%-10s %-10s %-10s %-20s %-10s %-10s\n", "mA", "mB", "mC", "KTam Giac", "CV", "DT");
        System.out.println(bt1);
        System.out.println(bt2);
        System.out.println(bt3);
        System.out.println(bt4);
        System.out.println(bt5);
    }
}
