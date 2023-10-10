package aritmatika;
import java.util.Scanner;
public class Aritmatika {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a,b;
        System.out.print("Masukkan angka a : ");
        a = input.nextInt();
        System.out.print("Masukkan angka b : ");
        b = input.nextInt();
        
        System.out.println("=====================");
        System.out.println("Penjumlahan\t : " +(a+b));
        System.out.println("Pengurangan\t : " +(a-b));
        System.out.println("Perkalian\t : " +(a*b));
        System.out.println("Pembagian\t : " +(a/b));
        System.out.println("Sisa bagi\t : " +(a%b));
       
       
       
    }
    
}
