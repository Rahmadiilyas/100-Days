
package day.pkg100;
import java.util.Scanner;
public class loginfacebook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Masukkan Username : ");
       String user = input.nextLine();
       System.out.print("Masukkan Password : ");
       int pw = input.nextInt();
       do{ 
       if (user.equals("Admin") && pw == 12345){
            System.out.println("Login Berhasil");
       }else {
            System.out.println("Login Gagal ");
            System.out.print("Masukkan Password : ");
      pw = input.nextInt();
    }
       }while(true);
}
    
}