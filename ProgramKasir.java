
package day.pkg100;
import java.util.Scanner;
public class ProgramKasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBelanja = 0;

        while (true) {
            System.out.println("=== SELAMAT DATANG DI KASIR ===");
            System.out.println("Pilihan barang:");
            System.out.println("1. Barang A - Rp 5000");
            System.out.println("2. Barang B - Rp 7500");
            System.out.println("3. Barang C - Rp 10000");
            System.out.println("4. Selesai");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            double hargaBarang = 0;

            switch (pilihan) {
                case 1:
                    hargaBarang = 5000;
                    break;
                case 2:
                    hargaBarang = 7500;
                    break;
                case 3:
                    hargaBarang = 10000;
                    break;
                case 4:
                    System.out.println("Terima kasih telah berbelanja.");
                    System.out.println("Total belanja Anda: Rp " + totalBelanja);
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            totalBelanja += hargaBarang;
            System.out.println("Barang berhasil ditambahkan ke keranjang.");
        }
    }
}

