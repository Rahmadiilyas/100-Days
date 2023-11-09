
package day.pkg100;
import java.util.Scanner;
public class menghitunggajikaryawab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan gaji pokok karyawan: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        int jamKerja = input.nextInt();

        double gajiTotal = 0;

        if (jamKerja > 40) {
            // Jika karyawan bekerja lebih dari 40 jam, hitung gaji lembur
            int jamLembur = jamKerja - 40;
            double gajiLembur = jamLembur * (gajiPokok * 1.5);
            gajiTotal = gajiPokok + gajiLembur;
        } else {
            // Jika karyawan bekerja kurang dari atau sama dengan 40 jam, gaji total adalah gaji pokok
            gajiTotal = gajiPokok;
        }

        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Total: " + gajiTotal);

        input.close();
    }
}
   
