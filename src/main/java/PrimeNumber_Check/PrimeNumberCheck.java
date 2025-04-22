package PrimeNumber_Check;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = scanner.nextInt();

        boolean isPrimeNumber = isPrime(number);
        if (isPrimeNumber){
            System.out.println(number + "Bir asal sayıdır.");
        }else {
            System.out.println(number +"Asal sayı değildir.");
        }

    }

    public static boolean isPrime(int number){ //Recursive method ile sayının asal olup olmadığı kontrol ediliyor
      if (number <= 1){  //2'den küçük sayılar asal değildir.
          return false;
      }
        for (int i = 2; i <= number / 2; i++) { // Sayının 2'den number/2 ye kadar olan bölenlerini kontrol eden döngü.
            if (number % i == 0){
                return false;
            }
        }
        return true; // Bir böleni var,asal değil
    }

}

