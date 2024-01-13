
package day.pkg100;
class kucing{
    String nama;
    String jenis;
    String warna;
    int umur;
    
    
    kucing(String nama, String jenis, String warna, int umur){
    this.nama=nama;
    this.jenis=jenis;
    this.warna=warna;
    this.umur=umur;
    
    
}
    void show(){
        System.out.println("Nama\t: "+nama);
        System.out.println("Jenis\t: "+jenis);
        System.out.println("Warna\t: "+warna);
        System.out.println("Umur\t: "+umur);
        System.out.println("");
}
    void Set(String nama, String jenis, String warna, int umur){
        this.nama=nama;
    this.jenis=jenis;
    this.warna=warna;
    this.umur=umur;
    
    }
}
public class classobjecctkucing {
    public static void main(String[] args) {
        kucing kucing1=new kucing("Doraemon","Angora","Putih",4);
        kucing1.show();
        
        kucing1.Set("Nabita","Afrika","Biru",5);
        kucing1.show();
    }
}
