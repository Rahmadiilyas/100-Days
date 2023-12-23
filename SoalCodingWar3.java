package day.pkg100;
import java.util.Scanner;
public class SoalCodingWar3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Soal 1");
        System.out.println("~~~~~~~");
        char kelas = 'A';
        char predikat = 'A';
        char Jeniskelamin = 'L';
        System.out.println("Kelas : "+kelas);
        System.out.println("Predikat : "+predikat);
        System.out.println("Jenis Kelamin : "+Jeniskelamin);
  
       
        System.out.println("Soal 2");
        System.out.println("~~~~~~");
        System.out.print("Masukkan angka : ");
       int angka = input.nextInt();
       
       if (angka %2==0){
           System.out.println("Angka genap");
       }else if(angka %1==0){
           System.out.println("Bukan angka genap");
       }
        System.out.println("Soal 3");
        System.out.println("~~~~~~~");
        int a = 12;
        int b = 14;
        int c = 15;
        System.out.println("Sebelum pertukaran ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        
        a=b;
        b=c;
        c=a;
        System.out.println("Setelah pertukaran ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        
        System.out.println("Soal 4");
        System.out.println("~~~~~~~");
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
        
        System.out.println("Soal 5");
        System.out.println("~~~~~~~");
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        
        if (nilai >50&&nilai <=100){
            System.out.println("Tuntas");
        }else if (nilai < 50){
            System.out.println("Error");
        }else{
            System.out.println("Tidak valid");
        }
    }
}
