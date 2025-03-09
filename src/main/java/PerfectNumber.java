import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        // // Kullanıcıdan sayıyı almak için Scanner ekliyoruz.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        //Sayının mükemmel olup olmadığını kontrol ediyoruz
        int toplam = 0;

        // Sayının pozitif tam sayı çarpanlarını buluyoruz
        for (int i = 1; i < number; i++) { //Eğer i , sayının böleniyse i'yi toplamı ekliyoruz
            if (number % i == 0  ){
                toplam += i;

            }

        }
        // Mükemmel sayı kontrolü
        if(toplam == number){
            System.out.println("Mükkemel sayıdır.");
        }else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
