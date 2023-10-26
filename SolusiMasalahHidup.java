package day.pkg100;
import java.util.Scanner;
public class SolusiMasalahHidup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int pilihan;
      String masalah = null,solusi = null;
        System.out.println("solusi Masalah Hidup ");
        System.out.println("Apa masalah anda saat ini ? ");
        System.out.println("1. Tidak dihargai\n2. Dikecewain\n3. Terlalu Khawatir dengan masa depan\n4. lainnya");
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();
        
        if (pilihan ==1){
            masalah = "Tidak Dihargai";
            solusi = "~~~~~~~~~~~~~~\n"+
                    "jika anda merasa tidak dihargai oleh seseorang"
                    + "\nanda harus bersikap bodo amat tak perlu untuk"
                    + "\nmenghabiskan terlalu banyak waktu  dan  energi"
                    + "\nuntuk orang yang tak  menghargai kita.   fokus "
                    + "\nsaja melakukan hal hal  terbaik  yang bisa"
                    + "\ndiupayakan demi cinta dan kasih sayang yang "
                    + "\nmasih ada dari orang orang terdekat kita. ";
        }else if (pilihan ==2){
            masalah = "Dikecewain";
            solusi = "~~~~~~~~~~~~\n"+
                    "1. Identifikasi keadaan dan perilakumu yang kamu anggap sumber kekecewaan\n" +
                     "2. Menerima rasa kecewa yang muncul dalam diri\n" +
                     "3. Cari tahu siapa orang-orang yang dapat mendukungmu\n" +
                     "4. Kelola ekspektasimu\n" +
                     "5. Cobalah untuk mengikhlaskan segala rasa tidak nyaman di hatimu";
        }else if (pilihan ==3){
            masalah = "Terlalu mengkhawatirkan masa depan";
            solusi = "~~~~~~~~~~~~~\n"+
                    "1.  Jangan Terlalu Banyak Berpikir\n"+
                    "2.  Jangan Membuat Diri Anda di Masa Depan Menanggung Beban Tindakan Saat Ini\n"+
                    "3.  Andalkan Orang-Orang yang Dapat Dipercaya\n"+
                    "4.  Berhenti Membuang Waktu";
        }else if (pilihan ==4){
            masalah = "Lainnya";
            solusi = "Intinya toh kalau ada masalahmu selesaikan i \n"
                    + "jangan tunda tunda dan\n"
                    + "haruski juga Bersifat bodo amat ketika\n"
                    + "itu menyangkut masalah mental\n";
                    
        }
        System.out.println("Pilihan anda : "+masalah);
        System.out.println("Solusi : "+solusi);
    }
}
    