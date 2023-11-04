package day.pkg100;
import java.util.Scanner;
public class NilaiAkademik {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Nilai akademik berawal dari 1.0");
        System.out.println("dan berakhir pada 4.0");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan nilai anda : ");
        double nilai = input.nextDouble ();

        if (nilai <=1.7 && nilai >1.0){
            System.out.println("predikat kamu : D");
            System.out.println("kamu tidak lulus");
        }else if (nilai >=1.8 && nilai <=2.5){
            System.out.println("predikat kamu : C");
            System.out.println("kamu lulus");

        }else if (nilai >=2.6 && nilai <= 3.5){
            System.out.println("predikat kamu : B");
            System.out.println("kamu lulus");    
        }else if (nilai >3.5 && nilai <=4.0 ){
            System.out.println("predikat kamu : A");
            System.out.println("kamu lulus");  
        }else if (nilai >4.0){
            System.out.println("ERROR !!!");
            System.out.println("NILAI MELEWATI BATAS MAKSIMUM!");

        }else {
            System.out.println("KYS!!!");
            
        }
    }
}
    
 
