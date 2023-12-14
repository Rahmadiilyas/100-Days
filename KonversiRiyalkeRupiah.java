
package day.pkg100;
import java.util.Scanner;
public class KonversiRiyalkeRupiah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Konversi mata uang riyal ke rupiah");
        System.out.println("");
      
        System.out.print("Masukkan jumlah uang dalam bentuk riyal: ");
        int riyal = input.nextInt();
      
        int rupiah = riyal * 4100;
      
        System.out.println(riyal+" jika dikonversi ke rupiah adalah Rp."+rupiah);
    }
}

