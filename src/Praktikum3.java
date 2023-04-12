import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah kolom: ");
        int n = input.nextInt(); // jumlah kolom

        // loop untuk setiap kolom
        for (int i = 1; i <= n; i++) {
            // menampilkan simbol * atau #
            if (i % 2 == 0) {
                System.out.print("# ");
            } else {
                System.out.print("* ");
            }
        }
        input.close();
}
}