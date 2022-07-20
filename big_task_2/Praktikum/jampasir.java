package jampasir;
import java.io.*;
public class jampasir {
    public static void main(String[] lock) {
        int a, b, c, d, e, f, g = 0;
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Masukkan jumlah baris");
            int h = Integer.parseInt(masuk.readLine());
            for (a = h; a > g; a--) {
                for (b = h; b >= a; b--) {
                    System.out.print(" ");
                }
                for (c = 0; c < a; c++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
            for (f = h - 1; f > g; f--) {
                for (d = 0; d < f; d++) {
                    System.out.print(" ");
                }
                for (e = h; e >= f; e--) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
        } catch (Exception i) {
            System.out.println("Terjadi Kesalahan ");
        }
    }
}
