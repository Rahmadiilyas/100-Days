package luassegitiga;
import java.util.Scanner;
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas,tinggi,luas;
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("==========================");
        System.out.print("Masukkan Alas\t : ");
        alas = input.nextInt();
        System.out.print("Masukkan Tinggi\t : ");
        tinggi = input.nextInt();
        
        System.out.println("==========================");
        
        luas = (alas*tinggi)*1/2;
        System.out.println("Luas : " + luas);
        
        
        
        
        
        
    }
    
}
