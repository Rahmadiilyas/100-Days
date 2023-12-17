
package day.pkg100;
import java.util.Scanner;
public class VolumePrisme {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("menghitung volume prisma");
        System.out.print("masukkan Alas : ");
        double alas = input.nextDouble();
        System.out.print("masukkan tinggi : ");
        double tinggi = input.nextDouble();
        System.out.print("masukkan tingi prisma : ");
        double tinggiprisma = input.nextDouble();
        
        double volume = alas*tinggi*tinggiprisma;
        double volume1 = volume/2;
        System.out.println("Volume Prisma : "+volume1);
    }
 
}
