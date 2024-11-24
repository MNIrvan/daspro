import java.util.Scanner;

public class RataNilai25 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int j, RataNilai, totalNilai = 0;
        for (j=1; j<=5; j++){
            System.out.print("Nilai ke-" +j+ " = ");
            int nilaiMhs = user.nextInt();
            totalNilai += nilaiMhs;
        }
        RataNilai = totalNilai/5;
        j++; 
        System.out.println("Rata rata nilai Mahasiswa " +j+ " adalah " +RataNilai);
    }
}
