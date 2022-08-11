package Herhalingen_1_10;

import java.util.Scanner;

public class H03_ScannerIlkHarf {
    public static void main(String[] args) {
        // kullanicidan ismini alip, ilk harfini buyuk harf olarak yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char isim=scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Ismin ilk harfi : "+isim+".");
    }
}
