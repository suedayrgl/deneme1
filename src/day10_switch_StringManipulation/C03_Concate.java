package day10_switch_StringManipulation;

public class C03_Concate {

    public static void main(String[] args) {

    String str1="Java";
    String str2="Candir";

    //Java Candir yazdiralim

        System.out.println(str1+" "+str2);
        
        String cumle= str1.concat(str2);
        // str1 yazdircak str2 yapistiracak
        
        cumle= str1.concat(" ").concat(str2);
        System.out.println("cumle = " + cumle);




    }
}
