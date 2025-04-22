package RoundedMain;

import java.util.Scanner;

public class RoundedNumMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Ondalıklı bir sayı giriniz : ");
        double number = scanner.nextDouble(); //Kullanıcıdan ondalıklı sayı alma.

        System.out.println("Aşağıı yuvarlama :" + Math.floor(number)); //Aşağı Yuvarlama metodu
        System.out.println("Yukarı yuvarlama :" + Math.ceil(number));  // Yukarı Yuvarlama metodu
        System.out.println("En yakın tam sayı :" + Math.round(number)); // Yuvarlama metodu.

        scanner.close();
    }
}
