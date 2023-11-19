
package day.pkg100;
import java.util.Scanner;
public class TabelPenjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.println("Table penjumlahan");
        System.out.print("Masukka angka : ");
        int angka = input.nextInt();
        
for (int i = 0; i < angka; i++){
    System.out.println(angka + "+"+ (i+1)+" = "+(angka+(i+1)));
}
    }
}

