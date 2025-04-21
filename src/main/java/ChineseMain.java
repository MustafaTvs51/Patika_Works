import java.util.Scanner;

public class ChineseMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum yılı alınır
        System.out.print("Doğum Yılı Giriniz : ");

        // Kullanıcıdan alınan input kontrol edilir
        if (scanner.hasNextInt()) {          //scanner.hasNextInt methodu kullanıcıdan alınan girişin integer bir değer olup olmadığını kontrol ediyor.
            int byear = scanner.nextInt();

            // Çin zodyağını hesaplamak için switch bölümünde 12'ye bölümünden kalan sonucu case ile eşleştirecektir.
            String zodiac = switch (byear % 12) {
                case 0 -> "Maymun";   // Yukarıdaki açıklamaya örnek olarak = 12'ye bölüm sonrası kalan 0'sa Maymun case i devreye girecektir.
                case 1 -> "Horoz";
                case 2 -> "Köpek";
                case 3 -> "Domuz";
                case 4 -> "Fare";
                case 5 -> "Öküz";
                case 6 -> "Kaplan";
                case 7 -> "Tavşan";
                case 8 -> "Ejderha";
                case 9 -> "Yılan";
                case 10 -> "At";
                case 11 -> "Koyun";
                default -> "Hatalı girdiniz.";  // Bu durumda hiç bir şey yapılmaz çünkü switch sadece 0-11 arasında çalışır
            };

            // Sonucu ekrana yazdır
            System.out.println("Çin Zodyağı Burcunuz : " + zodiac);

        } else {
            System.out.println("Geçersiz giriş yaptınız. Lütfen geçerli bir yıl girin."); // Eğer Kullanıcı Kesirli bir değer girerse çalışacaktır.
        }
    }
}
