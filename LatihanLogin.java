package latihanlogin;
import java.util.Scanner;
public class LatihanLogin {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan Username : ");
       String user = input.nextLine();
       System.out.print("Masukkan Password : ");
       int pw = input.nextInt();
        
       if (user.equals("Admin") && pw == 12345){
            System.out.println("Login Berhasil");
       }else 
            System.out.println("Login Gagal ");
    }
}
    
