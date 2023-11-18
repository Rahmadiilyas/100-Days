package day.pkg100;
import java.util.Scanner;
public class SearchingArrayJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cari, count=0;
        int [] a = {2,3,4,5,6,7,8,9};
        System.out.print("Data : ");
        
        for (int i = 0; i < a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println(" ");
        System.out.print("Cari : ");
        cari = input.nextInt();
        System.out.println("Hasil Cari : ");
        for (int i = 0; i < a.length; i++){
            if (cari==a[i]){
            System.out.println("indexs- "+ i);
            count++;
        }
            
            }
        if (count == 0){
                System.out.println("Tidak ada data ");
    }
 
}
}
