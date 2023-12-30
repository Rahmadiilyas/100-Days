
package day.pkg100;
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        
        String Hasil = nilai >=60&& nilai <=100 ? "Anda Lulus! ": "Anda Tidak Lulus";
        System.out.println(Hasil);
    }
}
