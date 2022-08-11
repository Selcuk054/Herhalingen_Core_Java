package Herhalingen_1_10;

public class H08_Pre_Post_Increment {
    public static void main(String[] args) {

    int num1=123;
    int num2=345;
    num2=++num1; //once num 2 ye ekleme yapiyor
        System.out.println(num2);
        num2=num1;
        System.out.println(num2);
        num2=++num1;
        System.out.println(num1+"--"+num2);

}
}