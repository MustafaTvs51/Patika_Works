import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // // Kullanıcıdan sayıyı almak için Scanner ekliyoruz.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        int counter = 0;
        int sum = 0;


        // Sayının pozitif tam sayı çarpanlarını buluyoruz
        for (int i = 1; i <= number; i++) { //Eğer i , sayının böleniyse i'yi toplamı ekliyoruz
            if (i % 3 == 0 && i % 4 == 0){
               sum += i;
              counter++;
            }

        }
            if (counter > 0 ){
                double gpa = (double) sum / counter;
                System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + gpa);
            }else {
                System.out.println("3 ve 4'e tam bölünen yok.");

                scanner.close();
            }
    }

}
