package WordFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String word = scanner.nextLine();

        word = word.toLowerCase();

        Map<Character,Integer> wordCount = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (Character.isLetter(letter)){
                wordCount.put(letter,wordCount.getOrDefault(letter,0)+1);
            }
        }


        System.out.println("Harflerin frekansları:");
        for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " =  " + entry.getValue());

        }
    }
}


