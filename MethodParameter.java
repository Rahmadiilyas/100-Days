package day.pkg100;
import java.util.Scanner;
public class MethodParameter {
    public static void siswa(String nama, int umur){
        System.out.println(nama+" Berumur "+umur+" tahun");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nm = input.nextLine();
        System.out.print("Umur : ");
        int umr = input.nextInt();
        siswa(nm,umr);
    }
}
