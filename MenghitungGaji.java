package menghitunggaji;
import java.util.Scanner;
public class MenghitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gaji_bersih = 5000000;
        System.out.print("masukkan gaji anda = Rp " );
        
        double penghasilan = input.nextDouble();
        
        if (penghasilan < 5000000 ){
            gaji_bersih = penghasilan;
            System.out.println("dapat diskon 0%");
        }else if (penghasilan >= 5000000 && penghasilan <7000000){
            gaji_bersih = penghasilan-(penghasilan*0.2);
            System.out.println("diskon 20%");
        }else if (penghasilan >= 7000000 && penghasilan <=8000000 ){
            gaji_bersih = penghasilan -(penghasilan*0.05);
            System.out.println("diskon 5%");
        }
        System.out.print("Total gaji = Rp "+ gaji_bersih );
    }
    
}
