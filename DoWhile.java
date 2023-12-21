
package day.pkg100;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        do{
        if(angka%2==0&&angka%4==0){
            System.out.println("Mantap");
            break;
        }else if(angka %2==0){
            System.out.println("Luar biasa");
            break;
        }else if(angka %4==0){
            System.out.println("Amazing");
            break;
        }else{
            System.out.print("Tidak valid, Masukkan lagi : ");
            angka = input.nextInt();
        }
        }while(true);
    }
}
