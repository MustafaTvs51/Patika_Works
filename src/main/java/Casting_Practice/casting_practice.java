package Casting_Practice;

import java.util.Scanner;

public class casting_practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir tam sayı giriniz  : ");//Kullanıcıdan girdi alıyoruz.
        int tamsayi = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz : ");//Kullanıcıdan girdi alıyoruz.
        double ondalıklısayi = scanner.nextDouble();

        double castondalıklısayi = tamsayi; //Tam sayıyı ondalıklı hale getiriyor
        int casttamsayi = (int)ondalıklısayi; //ondalıklı sayıyı tam sayı haline getiriyor

        System.out.println("Tam sayının ondalık hali : " + castondalıklısayi);
        System.out.println("Ondalık sayının tam sayı hali : " + casttamsayi);

    }

}
