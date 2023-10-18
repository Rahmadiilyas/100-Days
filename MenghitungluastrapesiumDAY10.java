package luastrapesium;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi sejajar atas trapesium: ");
        double a = input.nextDouble();
        
        System.out.print("Masukkan panjang sisi sejajar bawah trapesium: ");
        double b = input.nextDouble();
        
        System.out.print("Masukkan tinggi trapesium: ");
        double h = input.nextDouble();
        
        double luas = (a + b) * h / 2;
        
        System.out.println("Luas trapesium adalah: " + luas);
        
    }
}
    

    


    
    
