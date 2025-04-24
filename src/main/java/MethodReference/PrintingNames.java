package MethodReference;

import java.util.Arrays;
import java.util.List;

public class PrintingNames {

    public static void main(String[] args) {

        // Bir String listesi oluşturuluyor ve isimleri ekliyoruz.
        List<String> names = Arrays.asList("Mehmet ", "Zeynep", "Ayşe ", "Ahmet");

        // Her bir ismi konsola yazdırmak için method referansı kullanılıyoruz.
        // System.out::println, her elemanı println metoduna geçirerek yazdıyoruz.
        names.forEach(System.out::println);
    }
}

