package day05_matematikselislemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;
        System.out.println(sayi1 + ", " + sayi2 + " , " + sayi3);

        sayi3=++sayi1;
        System.out.println(sayi1 + ", " + sayi2 + " , " + sayi3);

        System.out.println(sayi3++);// once yazdıracak sonra arttiracak
        // once 12 yazdiracak sonra sayi3=13

        System.out.println(--sayi2);//once azalt sonra yazdir sayi2=9

    }
}
