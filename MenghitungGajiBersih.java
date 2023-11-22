package day.pkg100;
import java.util.Scanner;
public class MenghitungGajiBersih {
    public static void main(String[] args) {
        
   
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji : ");
        double gaji = input.nextDouble();

        System.out.println("Apakah anda seorang PNS?");
        System.out.println("1. iya\n2. tidak\n");
        System.out.print("Pilihan : ");
        int PNS = input.nextInt();

        double diskon = 0;

        if (gaji < 3000000) {
            System.out.println("Tidak mendapatkan pajak");
            diskon = gaji;
        } else if (gaji >= 3000000 && gaji < 5000000) {
            diskon = gaji - (gaji * 0.05);
            System.out.println("Diskon 5%");
        } else if (gaji >= 5000000) {
            diskon = gaji - (gaji * 0.1);
            System.out.println("Diskon 10%");
        }

        // Pengecekan apakah yang input adalah seorang PNS
        if (PNS == 1 && gaji >= 3000000 && gaji < 5000000) {
            // Menambahkan diskon tambahan 5% untuk PNS
            double tambahanDiskonPNS = gaji * 0.05;
            diskon -= tambahanDiskonPNS;
            System.out.println("Diskon tambahan untuk PNS 5%");
        }

        System.out.println("Gaji bersih = Rp. " + diskon);

        input.close();
    
}
}

