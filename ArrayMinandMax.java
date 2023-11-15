
package day.pkg100;
import java.util.Arrays;
import java.util.Collections;
public class ArrayMinandMax {
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,5,6,7,8};
        int maks = Collections.max(Arrays.asList(a));
        int min = Collections.min(Arrays.asList(a));
        
        System.out.print("Deret angka : ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
            
        }
        System.out.println(" ");
        System.out.println("Maximal : "+maks);
        System.out.println("Minimal : "+min);
    }
 
}
