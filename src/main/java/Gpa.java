import java.util.Scanner;

public class Gpa {

    public static void main(String[] args) {

        // // Kullanıcıdan sayıyı almak için Scanner ekliyoruz.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        int counter = 0;
        int sum = 0;


            //0 dan sayıya kadar döngü
        for (int i = 0; i <= number; i++) {
           // hem 3 e hem 4 bölünüyor mu ? Kontrol et.
            if (i % 3 == 0 && i % 4 == 0){
               sum += i;
              counter++;
            }

        }
         // Ortalamayı hesapla ve yazdır
            if (counter > 0 ){
                double gpa = (double) sum / counter;
                System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + gpa);
            }else {
                System.out.println("3 ve 4'e tam bölünen yok.");

                scanner.close();
            }
    }

}
