
package day.pkg100;
import java.util.Scanner;
public class luasdankelilinglingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double PHI = 3.14;
        System.out.println("Menghitung luas dan keliling Lingkaran");
        System.out.print("Masukkkan jari jari : ");
        double jari = input.nextDouble();
        
        double luas = PHI*jari*jari;
        double keliling = 2*PHI*jari;
        System.out.println("Luas = " +luas);
        System.out.println("Keliling = " +keliling);
        
    }
    }

