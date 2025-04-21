import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hoş geldiniz mesajı
        System.out.println("Hoşgeldiniz!");

        Scanner scanner = new Scanner(System.in);

        // km bilgisini alan blok
        System.out.print("Mesafeyi km türünden giriniz : ");
        double km = scanner.nextDouble();

        // yaş bilgisi alan blok
        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        // yolculuk tipi bilgisi alan blok
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        int flight_type = scanner.nextInt();

        // km veya yaş 0 dan küçükse veya yolculuk tipi girdisi 1 veya 2 değilse kullanıcı hata mesajı alacak.
        if (km <= 0 || age < 0 || (flight_type != 1 && flight_type != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double base_value = km * 0.10; // km başına 0.10 tl
            double discount_age = 0;

            // yaş indirimi hesabı
            if (age < 12)
                discount_age = base_value * 0.50; //12 yaşından küçükse yüzde 50 indirim.
            else if (age >= 12 && age <= 24)
                discount_age = base_value * 0.10; //12-24 yaş arası yüzde 10 indirim.
            else if (age > 65)
                discount_age = base_value * 0.30; //65 yaşından büyükse yüzde 30 indirim.

            double new_value = base_value - discount_age; //tek gidiş uçuşlar için son fiyat hesaplaması

            if (flight_type == 2) {   //Çift yönlü uçuşlar için uygulanacak indirim kontrolü
                double type2discount = new_value * 0.20;        //yüzde 20'lik gidiş dönüş bilet indirimi hesabı
                new_value = (new_value - type2discount) * 2;    //indirim sonrası çift yön için toplam tutar hesabı.

                System.out.println("Toplam indirim tutarınız : " + discount_age + type2discount); // ????
            }

            System.out.println("Toplam Tutar = " + new_value + " TL"); //toplam tutarı ekrana yazdıran kod bloğu

        }
            System.out.println("Bizi Tercih ettiğiniz için teşekkürler."); //Yeşil alanı ekrana yazdıran kod bloğu
    }
}
