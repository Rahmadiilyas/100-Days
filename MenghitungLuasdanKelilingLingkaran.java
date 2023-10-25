package day.pkg100;
import java.util.Scanner;
public class MenghitungLuasdanKelilingLingkaran {
    public static void main(String[] args) {
        final double phi = 3.14;
        double l,k,r,d;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari Jari : ");
        r = input.nextDouble();
        System.out.println("=======================");
        d= 2*r;
        
        l = phi*r*r;
        k = phi*d;
        
        System.out.println("Luas     : "+l);
        System.out.println("Keliling : "+k);
        
    }
}
