package Herhalingen_1_10;

import java.util.Scanner;

public class H01_Scanner {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip bu sayilarin carpimini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int num1= scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int num2=scan.nextInt();

        System.out.println("Girilen iki sayinin carpimi : "+(num1*num2));
    }
}
