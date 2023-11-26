
package day.pkg100;
import java.util.Scanner;
public class MengerjakanSoalPerhitunganGajiKaryawan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();

        double gajiKotorPerHari = 120000; // Gaji kotor per hari
        double uangMakanPerHari = 15000; // Uang makan per hari

        double totalGajiBersih = 0;
        double totalBiayaPerusahaan = 0;

        for (int i = 1; i <= jumlahKaryawan; i++) {
            System.out.print("Masukkan jumlah hari kerja untuk karyawan ke-" + i + ": ");
            int jumlahHariKerja = input.nextInt();

            // Menghitung gaji kotor dan uang makan
            double gajiKotor = gajiKotorPerHari * jumlahHariKerja;
            double uangMakan = uangMakanPerHari * jumlahHariKerja;

            // Menghitung gaji bersih
            double gajiBersih = gajiKotor - uangMakan;

            // Menampilkan gaji bersih untuk karyawan ke-i
            System.out.println("Gaji bersih karyawan ke-" + i + " adalah: " + gajiBersih);

            // Menambahkan gaji bersih karyawan ke total gaji bersih
            totalGajiBersih += gajiBersih;
        }

        // Menghitung total biaya perusahaan untuk menggaji karyawan
        totalBiayaPerusahaan = totalGajiBersih + (jumlahKaryawan * uangMakanPerHari * 30); // Mengasumsikan 30 hari dalam sebulan

        // Menampilkan total gaji bersih dan total biaya perusahaan
        System.out.println("\nTotal gaji bersih untuk " + jumlahKaryawan + " karyawan adalah: " + totalGajiBersih);
        System.out.println("Total biaya perusahaan untuk menggaji karyawan adalah: " + totalBiayaPerusahaan);

        input.close();
    }
}

