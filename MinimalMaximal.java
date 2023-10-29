package day.pkg100;
import java.util.Scanner;
public class MinimalMaximal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml,angka=0,max=0,min=100;
        
        System.out.print("Jumlah angka : ");
        jml = input.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=1; i <= jml; i++){
            System.out.print("Angka Ke- "+i+" = " );
            angka = input.nextInt();
            
        if (angka > max){
            max = angka;
            
        }if (angka < min ){
            min = angka;
        }
        
        }
        System.out.println("Nilai Minimal : "+min);
        System.out.println("Nilai Maximal : "+max);
        
    }
}
    
