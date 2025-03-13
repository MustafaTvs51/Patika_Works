import java.util.Scanner;

public class Valid_Password_Checker {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sifre; //String türünde sifre belirliyoruz.
        System.out.println("Şifre Kuralları ; \n En az 8 karakter içermeli. \n Boşluk içermemeli. \n İlk harf büyük olmalı. \n Son karakteri ? olmalı.");

        while (true){ //Geçerli sifre giriline kadar döngüyü devam ettiriyor.
            System.out.print("Lütfen şifrenizi giriniz : ");
            sifre = scanner.nextLine(); //Kullanıcıdan şifre girdisi alınıyor.

            if(gecerlisifre(sifre)){ //oluşturduğumuz bölümü buraya çağırıyoruz.
                System.out.println("Geçerli Şifre,Hoşgeldiniz!");
                break;  // Doğruysa döngüyü sonlandırmak için kullandık.
            }else {
                System.out.println("Geçersiz Şifre,tekrar deneyin");
            }

        }
        scanner.close();
    }

    public static boolean gecerlisifre(String sifre) {  //şifrede istenenler için bölüm oluşturuyoruz

        if (sifre.length() < 8) { //Bu koşul doğruysa şifre geçerli değildir o yüzden return false kullanıldı.
            return false;

        }
        if (sifre.contains(" ")) {  //Şifrede boşluk(space)varsa şifre geçerli değildir.
            return false;
        }

        if (!Character.isUpperCase(sifre.charAt(0))) { //! koyarak büyük harf kontrolü yapılmalı.
            return false;
        }


        if (sifre.charAt(sifre.length() - 1) != '?') { //Şifrenin sonundaki karakter ? değilse geçersiz şifredir.
            return false;
        }
        return true; //Tüm koşullar sağlanıyorsa şifre geçerlidir.


    }
}
