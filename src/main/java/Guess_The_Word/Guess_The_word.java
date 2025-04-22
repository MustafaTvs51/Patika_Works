package Guess_The_Word;

import java.util.*;

public class Guess_The_word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        Random random = new Random();

        char [] alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        // 4 tane ratgele harf ekliyoruz

        for (int i = 0; i < 4; i++) {

            char randomChar = alfabe[random.nextInt(alfabe.length)];
            list.add(String.valueOf(randomChar));
        }

    boolean isFound = false;

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1)+". Harfi girin :");
            String userWord = scanner.nextLine().toUpperCase();

            for (int j = 0; j < list.size(); j++) {
                if (userWord.equalsIgnoreCase(list.get(j))) {

                    list.set(j,userWord + " = Found");
                    isFound = true;
                    break;
                }
            }
            if (!isFound){
                list.add(userWord);
            }
          }
        System.out.println("Güncel Liste" + list);
    }
}
