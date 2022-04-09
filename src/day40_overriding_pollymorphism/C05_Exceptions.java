package day40_overriding_pollymorphism;

import java.util.Scanner;

public class C05_Exceptions {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alip toplayan bir program yaziniz
        // kullanici bitirmek istediginde Q ya basmalidir

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz \nbitirmek icin Q ya basiniz");
            int sayi = 0;


            try {
                sayi = scan.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }


            toplam += sayi ;
        }while (toplam<500);
    }


}
