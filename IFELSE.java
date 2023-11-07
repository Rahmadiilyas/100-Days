
package day.pkg100;

public class IFELSE {
    public static void main(String[] args) {
        double total = 100000;
    System.out.println("Belanja = Rp. "+total);
    if(total >= 100000) {
    System.out.println("Dapat diskon 10%");
    double diskon = 10 * total / 100;
    total -= diskon;
}
    System.out.println("Bayaran Akhir = Rp. "+total);
}
}
    
