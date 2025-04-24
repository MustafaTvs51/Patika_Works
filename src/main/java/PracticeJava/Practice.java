package PracticeJava;

import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        List<Integer> referenceNumber = Arrays.asList(1,2,3,4,5,7);

        referenceNumber.stream()
                .map(n -> n*3)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
