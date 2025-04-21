package Generics;

public class GenericMethodArray {


    public static <T> void printArray(T[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1 ){
                System.out.print(",");
            }
        }

        System.out.println();
    }
}
