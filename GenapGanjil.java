package day.pkg100;
import java.util.Scanner;
public class GenapGanjil {
    public static void main(String[] args) {
        System.out.print("Masukkan angka : ");
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        
        if (angka %2 == 0){
            for (int i = 0; i<angka; i+=2){
                System.out.print(i+" ");
            }
        }else if (angka %1 == 0){
                    for (int i = 1;i<angka; i+=2 ){
                        System.out.print(i+" ");
                    }
        }
            
        }
    }

