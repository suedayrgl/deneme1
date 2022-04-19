package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {

    public static void main(String[] args) {

        // verilen bir array in tekrar eden elementini
        // sadece bir kere yazdiran bir method olusturun

        Integer arr[]={3,5,1,2,6,1,7,8,9,3,5,7,6};
        arrayiTekrarsizYazdir(arr);






    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi=new HashSet<>();
        for (Integer each:arr
             ) {
            tekrarsizElementKumesi.add(each);
        }
        System.out.println(tekrarsizElementKumesi);
    }


}
