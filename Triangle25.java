import java.util.Scanner;
public class Triangle25 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = user.nextInt();
        int i = 0;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

// public class Triangle25 {
//     public static void main(String[] args) {
//         Scanner user = new Scanner(System.in);

//         System.out.print("Masukkan nilai N = ");
//         int N = user.nextInt();
//         int i = 0;
//         while (i <= N) {
//             int j = 0;
//             while (j < i) {
//                 System.out.print("*");
//                 j++;
//             }
//             i++;
//             System.out.println();
//         }
//     }
// }
