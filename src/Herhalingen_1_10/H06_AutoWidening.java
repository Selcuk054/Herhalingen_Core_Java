package Herhalingen_1_10;

public class H06_AutoWidening {
    /*
    Dar veri turundeki bir degeri, genis veri turundeki variable'a otomatik olarak assign eder.
     */
    public static void main(String[] args) {
        byte num1=87;
        short num2=345;
        int num3=num1*num2;
        System.out.println("num3 = " + num3); //30015
    }
}
