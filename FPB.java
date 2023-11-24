
package day.pkg100;
import java.util.Scanner;
public class FPB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1,bil2;
        int sisa;
        System.out.print("Masukkan bilangan pertama : ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        bil2 = input.nextInt();
        
        if (bil1<bil2){
            int temp = bil1;
            bil1=bil2;
            bil2=temp;
        }
        do{
            sisa = bil1 % bil2;
            bil1 = bil2;
            bil2 = sisa;
        } while (sisa != 0);
           System.out.println("Faktor persekutuan terbesar = "+bil1);
            
        }
    }


