
package day.pkg100;
class player{
    String nama;
    public int exp;
    private int health;
    
    player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health=health;
        
    }
    void display(){
        tambahexp();
        System.out.println("Nama\t : "+this.nama);
        System.out.println("Exp\t : "+this.exp);
        System.out.println("Health\t : "+this.health);
    }
    public void ubahnama(String namabaru){
        this.nama = namabaru;
    }
    private void tambahexp(){
        exp+=100;
    }
    
}
public class PublicDanPrivateKeyword {
    public static void main(String[] args) {
        player player1 = new player("Rahmadi",0,100);
        System.out.println(player1.nama);
        player1.nama ="Budi";
        System.out.println(player1.nama);
        
        //public
        System.out.println(player1.exp);
        player1.exp =100;
        System.out.println(player1.exp);
        
        player1.display();
        player1.ubahnama("Tejo");
        player1.display();
    }
}
