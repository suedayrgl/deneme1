package day07_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {

            System.out.println("verilen sayilar esit");

        }

        if (a < 100) {

            System.out.println("a yuzden buyuk");

        }
        if (a * b > 5) {

            System.out.println("sayilarin carpimi 5 ten buyuk");
        }
        //bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        //bir sart e sarta bagli sonuca odaklıdır
        //birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisa bilecegi gibi
        // hic birisinin body calismayada bilir


    }
}
