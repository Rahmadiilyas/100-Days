
package day.pkg100;
class mahasiswa{
    String nama;
    String nim;
    double ipk;
    int umur;
}
public class class_object {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nama = "Rahmadi";
        mahasiswa1.nim = "D0223309";
        mahasiswa1.ipk = 3.98;
        mahasiswa1.umur = 18;
        System.out.println("Nama : "+mahasiswa1.nama);
        System.out.println("Nim  : " +mahasiswa1.nim);
        System.out.println("Ipk  : " +mahasiswa1.ipk);
        System.out.println("Umur : "+mahasiswa1.umur);
        System.out.println("");
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nama = "Intan Asyura";
        mahasiswa2.nim = "D0223305";
        mahasiswa2.ipk = 3.81;
        mahasiswa2.umur = 18;
        System.out.println("Nama : "+mahasiswa2.nama);
        System.out.println("Nim  : " +mahasiswa2.nim);
        System.out.println("Ipk  : " +mahasiswa2.ipk);
        System.out.println("Umur : "+mahasiswa2.umur);
        
    }
}
