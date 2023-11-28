package day.pkg100;
import java.util.Scanner;
public class MerokokMembunuhmu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Aturan merokok ");
        System.out.print("Masukkan Umur anda : ");
        byte umur = input.nextByte();
        
        do{
        if (umur<18&&umur>0){
            System.out.println("Usia Anda masih sangat anak anak\nbelum pantas untuk merokok");
            System.out.println("Ingat Merokok membunuhmu!");
            break;
        }else if (umur>18&&umur<40){
            System.out.println("Jangan merokok, kalaupun ingin merokok tetap harus patuhi aturan :"
                    + "seperti : hindari merokok didekat anak anak ibu hamil dan menyusui");
            break;
        }else if (umur>=40&&umur < 150){
            System.out.println("Ingat Umur Pak! Merokok membunuhmu!");
            break;
        }else {
            System.out.println("Tidak Valid, mohon masukkkan ulang umur anda");
            System.out.print("Masukkan umur : ");
            umur = input.nextByte();
            
    }
        }while (true);
    }
}
