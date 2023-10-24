package day.pkg100;
import java.util.Scanner;
public class menghitungluasbelahketupat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Belah Ketupat");
        System.out.print("Masukkan Diagonal 1 : ");
        double diagonal1 = input.nextDouble();
        System.out.print("Masukkan Diagonal 2 : ");
        double diagonal2 = input.nextDouble();
        
        double luas = diagonal1*diagonal2*1/2;
        System.out.println("Luas Belah Ketupat Adalah : "+luas);
    }
    
}
