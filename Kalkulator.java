package day.pkg100;
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,hasil1=0,hasil2=0,hasil3=0,hasil4=0,hasil5=0,pilihan;
        String opsi;
        System.out.println("Kalkulator By Rahmadi");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Modulus");
        System.out.print("Masukkan Pilihan    : ");
        pilihan = input.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan Bilangan a : ");
        a = input.nextInt();
        System.out.print("Masukkan Bilangan b : ");
        b = input.nextInt();
        
        if(pilihan == 1){
            opsi = "Penjumlahan";
            hasil1 = a+b;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Hasil Dari "+a+"+"+b+" adalah " + hasil1);
        }else if (pilihan == 2){
            opsi = "Pengurangan";
            hasil2 = a-b;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Hasil Dari "+a+"-"+b+" adalah " + hasil2);
        }else if (pilihan == 3){
            opsi = "Perkalian";
            hasil3 = a*b;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Hasil Dari "+a+"x"+b+" adalah " + hasil3);
        }else if (pilihan == 4){
            opsi = "Pembagian";
            hasil4 = a/b;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Hasil Dari "+a+"/"+b+" adalah " + hasil4);
        }else if (pilihan == 5){
            opsi = "Modulus";
            hasil5 = a%b;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Hasil Dari "+a+"%"+b+" adalah " + hasil5);
        }
        
                    
    }
}

