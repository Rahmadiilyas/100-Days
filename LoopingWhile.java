package day.pkg100;
import java.util.Scanner;
public class LoopingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal,akhir,split = 0;
        System.out.println("Bilangan Genap");
        System.out.print("Awal : ");
        awal = input.nextInt();
        System.out.print("Akhir : ");
        akhir = input.nextInt();
        
        while (awal <= akhir){
            int hasil = awal%2;
            if (hasil==0){
                System.out.print(awal+" ");
                if (split == 5){
                    System.out.println("");
                    split = 0;
                }
                split++;
            }
            awal++;
        }
        System.out.println("");
    }
    
    }
