package menghitungpersegipanjang;
import java.util.Scanner;
public class MenghitungPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung luas dan Keliling Persegi Panjang ");
        System.out.println("=============================================");
        System.out.print("Masukkan Panjang : ");
        double panjang = input.nextInt();
        System.out.print("Masukkan Lebar : ");
        double lebar = input.nextInt();
        
        double luas = panjang*lebar;
        double keliling = 2*(panjang + lebar);
        
        System.out.println("==============================");
        
        System.out.println("Luas : "+ luas);
        System.out.println("Keliling : "+ keliling);
        
    }
    
}
