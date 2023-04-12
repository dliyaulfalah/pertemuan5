import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah baris pola: ");
        int n = Integer.parseInt(br.readLine());

        // loop untuk setiap kolom
        for (int i = 1; i <= n; i++) {
            // menampilkan simbol * atau #
            if (i % 2 == 0) {
                System.out.print("# ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
