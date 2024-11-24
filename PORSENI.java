import java.util.Scanner;

public class PORSENI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int totalCabor = cabor.length;

        int jumlahAtlet = 5;

        String[][] atlet = new String[totalCabor][jumlahAtlet];

        for (int i = 0; i < totalCabor; i++) {
            System.out.println("Masukkan nama-nama atlet untuk cabor " + cabor[i] + ":");

            for (int j = 0; j < jumlahAtlet; j++) {
                System.out.print("Atlet ke-" + (j+1) + ": ");
                atlet[i][j] = scanner.nextLine();
            }
            System.out.println(); 
        }

        System.out.println("\nDaftar Atlet yang Terdaftar di Porseni 2024:");

        for (int i = 0; i < totalCabor; i++) {
            System.out.println("Cabor: " + cabor[i]);
            for (int j = 0; j < jumlahAtlet; j++) {
                System.out.println("Atlet ke-" + (j+1) + ": " + atlet[i][j]);
            }
            System.out.println(); 
        }

        // Menutup scanner
        scanner.close();
    }
}
