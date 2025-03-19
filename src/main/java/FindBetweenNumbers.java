import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindBetweenNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //Liste oluşturuyoruz.


        list.add(4); //0 index //Pozitif elemanları giriyoruz.
        list.add(14);
        list.add(28);
        list.add(564);
        list.add(82);
        list.add(88);
        list.add(92);
        list.add(45);
        list.add(30);
        list.add(17);

        Collections.sort(list); //Listeyi küçükten büyüğe sıralama yapan metot.

        int minDifference = Integer.MAX_VALUE; //Başlangıç farkı en büyük olan değer.
        int closenumber1 = -1, closenumber2 = -1; //En yakın iki elemanı bulmak için -1 değerden başlatıyoruz.

        //Eğer şuanki listedeki değerler arasındaki fark,şu ana kadar bulduğumuz en küçük farktan küçükseyi kontrol eden blok
        for (int i = 0; i < list.size() - 1 ; i++) {
                int first = list.get( i );
                int second = list.get(i + 1 );

            int diff = second - first;
                 if (diff < minDifference){
                    minDifference = diff;
                    closenumber1 = first;
                    closenumber2 = second;
            }
        }
        // Sonucu ekrana yazdıran blok.
        System.out.println("En yakın iki eleman " + closenumber1 +"ve" + closenumber2);

    }
}

