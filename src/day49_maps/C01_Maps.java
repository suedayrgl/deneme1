package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

    public static void main(String[] args) {
        // javada collection uyesi bbir yapida
        // data turu object secilirse her data turunden deger ekleyebiliriz
        // ancak bu durumda surekli casting probblemleriyle karsilasabiliriz

        List<Object> list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);
        list.set(1,(Integer) list.get(1) + 10);

        Map<Integer,String> sinifList = new HashMap<>();
        // bir sinifta ogrenci no ve isim soyisim ve brans olarak map olusturmak istiyoruz
        // key tek bir unique degerdir
        // ama value/deger birden fazla bilginin birlesiminden olusabilir
        // bu durumda daha sonra istedigimiz blgilere dogru sekilde
        // ulasailmek icin tum elementleri icin value
        // ayni bicimde olusturulmali
        // (eri siralamasi ve sekilsel acidan)
        sinifList.put(101,"Ali,Can,QA");
        sinifList.put(102,"Veli,Yan,Dev");
        sinifList.put(103,"Sueda,Yuregil,Dev");
        System.out.println(sinifList);// {101=Ali,Can,QA, 102=Veli,Yan,Dev, 103=Enes,Baltaci,Dev}
        System.out.println(sinifList.keySet()); // [101, 102, 103]
        System.out.println(sinifList.values()); // [Ali,Can,QA, Veli,Yan,Dev, Sueda,Yuregil,Dev]





    }
}
