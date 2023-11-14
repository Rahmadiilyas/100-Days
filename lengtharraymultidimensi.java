
package day.pkg100;

public class lengtharraymultidimensi {
    public static void main(String[] args) {
        String [][] kontak = {
            {"Rahmadi", "(082190728175)"},
            {"Budi", "(09988766555)"},
            {"Buda", "(655722627225)"},
    
            
            
        };
        for(int i = 0; i < kontak.length; i++){
            for(int j =0; j<kontak[i].length;j++){
                System.out.print(kontak[i][j]);
           
            }
            System.out.println(" ");
    }
}
}