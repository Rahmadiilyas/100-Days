
package day.pkg100;
import java.util.Scanner;
public class SoalCodingWar2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();
        int hasil = 0;
        for(int i =1;i<=batas;i++){
            hasil +=i;
            
            System.out.print(i);
            if(i<batas){
            System.out.print("+");
            
        }if (i>=batas){
            System.out.println("=");
        }
            
    }
        System.out.println(hasil);
}
}