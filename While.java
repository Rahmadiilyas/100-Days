
package day.pkg100;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner im = new Scanner (System.in);
        System.out.println("masukkan i "
                + "; ");
        int i = im.nextInt();
        while(true){
            if (i%2 == 0 && i < 10){
                System.out.print(i);
            }else if (i == 5){
                break;
            }
            i++;
        }
        
    }
    
}
   
