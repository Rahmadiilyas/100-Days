
package day.pkg100;
class mahasiswa{
    String nama;
    String nim;
    mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    // metdhod tanpa return dan tanpa parameter
    
void show(){
            System.out.println("nama : "+this.nama);
            System.out.println("nim : "+this.nim);
}
// method tanpa return dengan parameter
void ubahnama(String nama){
    this.nama = nama;
   
}

}
public class Methods {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Rahmadi","D0223309");
        // method
        mahasiswa1.show();
        mahasiswa1.ubahnama("Intan");
        mahasiswa1.show();
        
        
    }
}
