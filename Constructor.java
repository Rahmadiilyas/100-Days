
package day.pkg100;
class mahasiswa{
    String nama;
    String nim;
    String jurusan;
    mahasiswa(String inpunama,String inputnim,String inputjurusan){
      nama = inpunama;
      nim = inputnim;
      jurusan = inputjurusan;
      
        System.out.println("Nama\t: "+nama);
        System.out.println("Nim\t: " +nim);
        System.out.println("Jurusan\t: "+jurusan);
    }
}



public class Constructor {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Rahmadi","D0223309","Teknik informatika");
        mahasiswa mahasiswa2 = new mahasiswa("Intan","D0223210","Pertanian");
    }
}
