package day38_inheritance_overriding;

public class UstaBasi extends Isci{

    public String statu = "ustabasi";
    public String haklar = "haftada 1 gun ekstara tatil hakki";

    public void mesai() {
        System.out.println("ariza varsa eksta ucret almadan calisir ");
    }

    public void maasHesapla() {
        System.out.println("tum ustabasi 30 gun * 8 saat * 12 euro = " + (30 * 8 * 12) + " euro maas alir");
    }
}
