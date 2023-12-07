
package day.pkg100;
import java.util.Scanner;
public class ResepObat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sakit kepala\n2. Sakit Pinggang\n3. sakit dada\n4. Sakit perut\n5. sakit hati\n");
        System.out.print("Masukkan Keluhan sakit Anda : ");
        int pilihan = input.nextInt();
        
        if(pilihan == 1){
            System.out.println("==========================================");
            System.out.println("Resep Obat : Paracetamol dan ampisilin 3x1");
        }else if(pilihan ==2){
            System.out.println("==========================================");
            System.out.println("Resep Obat : Bodrex 2x1");
            
        }else if (pilihan ==3){
            System.out.println("==========================================");
            System.out.println("Resep Obat : Pracetamol 1x1");
        }else if (pilihan==4){
            System.out.println("==========================================");
            System.out.println("Resep Obat : Promag 3x1");
        }else if (pilihan==5){
            System.out.println("==========================================");
            System.out.println("Resep Obat : Lupakan yang berlalu");
        }else {
            System.out.println("==========================================");
            System.out.println("Pilihan tidak ada");
        }
        
    }
}
