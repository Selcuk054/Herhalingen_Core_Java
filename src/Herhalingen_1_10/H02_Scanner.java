package Herhalingen_1_10;

import java.util.Scanner;

public class H02_Scanner {
    /*
    Kullanicidan ismini, soyismini ve yasini alip girilen bilgileri
    Girilen bilgiler = Selcuk Kardes 37
    seklinde yazdiriniz.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminiz giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println(isim +" "+soyisim+" "+yas);

    }
}
