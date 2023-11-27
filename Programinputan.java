
package day.pkg100;
import java.util.Scanner;
public class Programinputan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan sebuah bilangan: ");
        bilangan = input.nextInt();

        do{
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan genap, program berhenti.");
            break;
        } else {
            if (bilangan %1 ==0){
            System.out.println("Bilangan ganjil, masukkan bilangan lagi.");
                System.out.print("Masukkan sebuah bilangan : ");
            bilangan = input.nextInt();
        }
        }
        }while (true);

        
    }
        }
    

