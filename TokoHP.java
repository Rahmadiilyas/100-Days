package day.pkg100;
import java.util.Scanner;

public class TokoHP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga = 0;
        
        System.out.println("Pilih merek HP : ");
        System.out.println("1. Realme\n2. Oppo\n3. Vivo");
        System.out.print("Merk HP : ");
        int pilihan = input.nextInt();

        if (pilihan == 1){
            System.out.println("1. Realme C11(3.000.000)\n2. Realme C12(5.100.000) ");
            System.out.print("Type HP : ");
            int type = input.nextInt();
            
            if (type == 1){
                harga = 3000000;
            } else if (type == 2){
                harga = 5100000;
            } else {
                System.out.println("Tidak valid");
            }
        } else if (pilihan == 2){
            System.out.println("1. Oppo A12 (Rp 2.000.000)\n2. Oppo A11K (5.000.000)");
            System.out.print("Type HP : ");
            int type1 = input.nextInt();
            
            if (type1 == 1){
                harga = 2000000;
            } else if (type1 == 2){
                harga = 5000000;
            } else {
                System.out.println("Tidak valid");
            }   
        } else if (pilihan == 3){
            System.out.println("1. Vivo V9 (Rp 3.500.000)\n2. Vivo 12 (6.000.000)");
            System.out.print("Type HP : ");
            int type2 = input.nextInt();
            
            if (type2 == 1){
                harga = 3500000;
            } else if (type2 == 2){
                harga = 6000000;
            } else {
                System.out.println("Tidak Valid");
            }
        }else {
            System.out.println("Tidak valid");
            return;
        }
        System.out.print("Kartu member/tidak?: ");
        input.nextLine(); 
        String member = input.nextLine();
        
        double diskon = 0;
        
        if (member.equalsIgnoreCase("kartu member")) {
            System.out.println("Mendapatkan diskon 5%");
            System.out.print("Kode diskon : "); 
            String kodeDiskon = input.nextLine();
            
            if (kodeDiskon.equalsIgnoreCase("Rahmadi123")){
                diskon = harga * 0.05;
            }else {
                System.out.println("Kode diskon Salah! Total Harga tidak muncul");
                return;
            }
        }else if (member.equalsIgnoreCase("tidak")){
            diskon = 0;
        }else {
            System.out.println("Tidak valid/pilihan salah");
            return;
        }
     
        double totalHarga = harga - diskon;

        System.out.println("Total Harga: Rp " + totalHarga);

        input.close();
    }
}


    




