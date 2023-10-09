package biodata;
import java.util.Scanner;
public class BIODATA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tBIODATA");
        System.out.println("========================================");
        System.out.print("Nama\t\t : ");
        String nama = input.nextLine();
        System.out.print("TTL\t\t : ");
        String ttl = input.nextLine();
        System.out.print("Alamat\t\t : ");
        String alamat = input.nextLine();
        System.out.print("Hobi\t\t : ");
        String hobi = input.nextLine();
        System.out.print("Asal sekolah\t : ");
        String sekolah = input.nextLine();
        System.out.print("cita Cita\t : ");
        String cita = input.nextLine();
        
        System.out.println("Nama\t\t : " + nama);
        System.out.println("TTL \t\t  : " + ttl);
        System.out.println("Alamat\t\t : " + alamat);
        System.out.println("Hobi\t\t : " + hobi);
        System.out.println("Asal sekolah\t : " + sekolah);
        System.out.println("Cita cita\t : " + cita);
        
    }
    
}
