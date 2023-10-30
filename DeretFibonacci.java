package day.pkg100;
import java.util.Scanner;
public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f1 = 0,f2=1,fn,n;
        System.out.print("Jumlah Angka : ");
        n = input.nextInt();
        
        System.out.println("Deret Fibonacci");
        System.out.print(f1+", ");
        System.out.print(f2);
        for (int a =1; a<n; a++){
            fn = f2+f1;
            System.out.print(", "+fn);
            f1 = f2;
            f2 = fn;
        }
        System.out.println(" ");
    }
    
}
