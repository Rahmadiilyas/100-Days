
package day.pkg100;
import java.util.ArrayList;
class player{
    private static int numberofplayer;
    private static ArrayList<String> nameList = new ArrayList<String>();
    private String nama;
    
    player(String nama){
        this.nama = nama;
        player.numberofplayer++;
        player.nameList.add(this.nama);
    }
    static void shownumberofplayer(){
        System.out.println("Number of Player : "+player.numberofplayer);
    }
    static ArrayList<String>getname(){
        return player.nameList;
    }
}
public class StaticAtauClassMethods {
    public static void main(String[] args) {
        player player1 = new player("Rahmadi");
        player player2 = new player("Shabir");
        player player3 = new player("SMirna");
    
        player.shownumberofplayer();
        
        System.out.println("names : "+player.getname());
    }
}
