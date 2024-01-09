
package day.pkg100;

public class mahasiswa {
    String nama;
   
    
    void makan(){
        System.out.println(nama+" Sedang makan");
    }void olahraga(){
            System.out.println(nama +" Sedang olahraga");
    }
    public static void main(String[] args) {
        mahasiswa rahmadi = new mahasiswa();
        rahmadi.nama = "Rahmadi";
        rahmadi.makan();
        rahmadi.olahraga();
    }
}
    
    

