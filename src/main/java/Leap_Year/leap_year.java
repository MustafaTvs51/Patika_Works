package Leap_Year;

import java.util.Scanner;

public class leap_year {

    public static void main(String[] args) {
        // Kullanıcıdan yıl girişi almak için Scanner yazıyoruz.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yıl girmesi için yapılan kod.
        System.out.print("Yıl Giriniz: ");
        int year = scanner.nextInt();


        if (year % 100 == 0) {               // Eğer yıl 100'e tam bölünebiliyorsa
            if (year % 400 == 0) {           // Eğer aynı yıl 400'e de bölünebiliyorsa, artık yıldır
                System.out.println(year + " bir artık yıldır.");
            } else {                         // Yıl 100'e bölünüp 400'e bölünemiyorsa, artık yıl değildir
                System.out.println(year + " bir artık yıl değildir.");
            }
        }
        else if (year % 4 == 0) {                            // Yıl 100'e bölünmüyorsa, 4'e bölünebilir mi diye kontrol edilir
            System.out.println(year + " bir artık yıldır."); // Yıl 4'e tam bölünüyorsa, artık yıldır
        } else {

            System.out.println(year + " bir artık yıl değildir."); // Yıl 4'e de bölünmüyorsa, artık yıl değildir
        }
    }
}
