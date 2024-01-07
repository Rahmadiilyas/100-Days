
package day.pkg100;

public class latihanBreak_continue_return {
    public static void main(String[] args) {
        int a =0;
        while(true){
            a++;
            
            if (a==10){
                break;//berhenti/memaksa keluar dari loop
            }else if (a==5){
                continue;
                //memaksa memulai dari awal
            }else if (a==7){
                return; //berhenti
            }
            System.out.println("looping ke - " + a);
        }
        System.out.println("akhir dari looping ");
    }
}
