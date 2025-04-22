import java.util.Scanner;

public class arithmetic_operations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Kullanıcıdan girdi için gerekli method

        System.out.print("1.Sayıyı giriniz : ");
        double num1 = scanner.nextDouble();      //Kullanıcıdan sayı girmesi için gerekli.

        System.out.print("2.Sayıyı giriniz : ");
        double num2 = scanner.nextDouble();      //Kullanıcıdan sayı girmesi için gerekli.

        System.out.print("3.Sayıyı giriniz : ");
        double num3 = scanner.nextDouble();      //Kullanıcıdan sayı girmesi için gerekli.

        System.out.println( num1 + (num2*num3) - num2); // Aritmetik işlemi yapan kod satırı.


    }
}
