import java.util.Scanner;

public class ReverseTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ters üçgen Kaç basamaklı olsun ? ");
        int number_of_digits = scanner.nextInt();

        for (int i = number_of_digits; i >= 1 ; i--) { // ter üçgen için kullanılan döngü
            //Her satırda i kadar yıldız yazılıyor
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println(); // Her satırdan sonra yeni satıra geçmek için.

        }


    }

}
