
package day.pkg100;
import java.util.Scanner;
public class ProgramHabisBagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        
        if (angka %3 == 0&& angka %5==0){
            System.out.println("Master class");
        }else if (angka %3 ==0){
            System.out.println("Pride of 3");
        }else if(angka %5==0){
            System.out.println("Pride of 5");
        }
        else{
            System.out.println("Bukan kelipatan 3 dan 5");
        }
    }
}
