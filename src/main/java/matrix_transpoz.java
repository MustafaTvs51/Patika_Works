import java.util.Scanner;

public class matrix_transpoz {
    public static void main(String[] args) {
        // Kullanıcıdan matrisin boyutlarını al
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satir = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        // Matrisin elemanlarını al
        int[][] matris = new int[satir][sutun];
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu hesapla
        int[][] transpoz = new int[sutun][satir]; // Transpoz matrisinin boyutları ters olur

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Verilen matrisi yazdır
        System.out.println("\nVerilen Matris:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // Transpoz matrisini yazdır
        System.out.println("\nTranspoze Matris:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
