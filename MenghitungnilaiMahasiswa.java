package menghitungnilaimahasiswa;
import java.util.Scanner;
public class MenghitungnilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matematika,ddp,fisika,psti,rata,kkm,jml;
        System.out.println("\tNILAI MAHASISWA");
        System.out.println("     UNIVERSITAS SULAWESI BARAT");
        System.out.println("=================================");
        System.out.print("DDP\t\t : ");
        ddp = input.nextDouble();
        System.out.print("PSTI\t\t : ");
        psti = input.nextDouble();
        System.out.print("MATEMATIKA\t : ");
        matematika = input.nextDouble();
        System.out.print("FISIKA\t\t : ");
        fisika = input.nextDouble();
        jml = matematika + ddp + psti + fisika;
        rata = jml/4;
        
        System.out.print("RATA RATA\t : " + rata);
        kkm = 80;
        System.out.println("\n===========================");
        
        if (rata >= kkm){
            System.out.println("\nLULUS ");
        }else {
            System.out.println("\nTIDAK LULUS");
        }
    }
    
}
