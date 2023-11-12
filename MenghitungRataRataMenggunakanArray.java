
package day.pkg100;
import java.util.Scanner;
public class MenghitungRataRataMenggunakanArray {
    public static void main(String[] args) {
      int  [] a = {1,2,3,4,5};
      int total = 0;
      double rata;
      int jml_index = a.length;
        System.out.println("deret angka : ");
        for (int i = 0; i < jml_index; i++){
            System.out.print(a[i]+ " ");
            total += a[1];
            
        }
        System.out.println(" ");
        System.out.println("total : "+total);
        rata = total/jml_index;
        System.out.println("Rata rata : "+ rata);
    }
}
