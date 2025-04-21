package bodyindex;

import java.util.Scanner;

public class bodyindexcalculater {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Kullancının veri girmesi için gerekli.

        System.out.print("Lütfen Boyunuzu giriniz(metre cinsinden) : ");

        double boy = scanner.nextDouble();  // Kullanıcıdan boy girdisi isteniyor

        System.out.print("Lütfen Kilonuzu giriniz : ");

        double kg = scanner.nextDouble(); //Kullanıcıdan kilogram girdisi isteniyor

        double index = kg/(boy * boy) ; // İndex Alma işlemi = Kilogram / Boyunuzun karesi

        System.out.print("Vücut Kitle İndeksiniz = " + index); // işlem sonucu yazdırma



    }
}
