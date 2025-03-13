import java.util.Scanner;

public class Valid_Password_Checker {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sifre;
        System.out.println("Şifre Kuralları ; \n En az 8 karakter içermeli. \n Boşluk içermemeli. \n İlk harf büyük olmalı. \n Son karakteri ? olmalı.");

        while (true){
            System.out.print("Lütfen şifrenizi giriniz : ");
            sifre = scanner.nextLine();

            if(gecerlisifre(sifre)){
                System.out.println("Geçerli Şifre,Hoşgeldiniz!");
                break;
            }else {
                System.out.println("Geçersiz Şifre,tekrar deneyin");
            }

        }
        scanner.close();
    }

    public static boolean gecerlisifre(String sifre) {

        if (sifre.length() < 8) {
            return false;

        }
        if (sifre.contains(" ")) {
            return false;
        }

        if (!Character.isUpperCase(sifre.charAt(0))) {
            return false;
        }


        if (sifre.charAt(sifre.length() - 1) != '?') {
            return false;
        }
        return true;


    }
}
