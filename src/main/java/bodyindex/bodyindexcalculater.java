package bodyindex;

import java.util.Scanner;

public class bodyindexcalculater {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu giriniz(metre cinsinden) : ");

        double boy = scanner.nextDouble();

        System.out.println("Lütfen Kilonuzu giriniz : ");

        double kg = scanner.nextDouble();

        double v = kg/(boy * boy) ;

        System.out.println("Vücut Kitle İndeksiniz = " + v);



    }
}
