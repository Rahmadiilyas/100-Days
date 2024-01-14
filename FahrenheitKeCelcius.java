
package day.pkg100;
import java.util.Scanner;
public class FahrenheitKeCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam fahrenheit : ");
        double fahrenheit = input.nextDouble();
        
        double celcius = (fahrenheit - 32)*5/9;
        
        System.out.println(fahrenheit+" Derajat fahrenheit sama dengan "+celcius+" Derajat celcius");
    }
}
