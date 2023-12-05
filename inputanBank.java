
package day.pkg100;
import java.util.Scanner;
public class inputanBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namanasabah,alamat,nohp,tanggallahir;
        double beratbadan;
        byte umur;
        
        
        System.out.println("Masukkan nama nasabah : ");
        namanasabah = input.nextLine();
        System.out.println("alamat : ");
        alamat = input.nextLine();
        System.out.println("no hp : ");
        nohp = input.nextLine();
        System.out.println("Tanggal lahir : ");
        tanggallahir = input.nextLine();
        System.out.println("Berat badan : ");
        beratbadan = input.nextDouble();
        System.out.println("Umur : ");
        umur = input.nextByte();
        
        System.out.println(namanasabah);
        System.out.println(alamat);
        System.out.println(nohp);
        System.out.println(tanggallahir);
        System.out.println(beratbadan);
        System.out.println(umur);
    }
}
