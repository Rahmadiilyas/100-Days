package day.pkg100;
import java.math.BigInteger;
public class BigInteger {
    public static void main(String[] args) {
        BigInteger angka,angka1,tambah,kurang,kali,bagi;
        angka = new BigInteger("20000000");
        angka1= new BigInteger("30000000");
        tambah = angka.add(angka1);
        kurang = angka.subtract(angka1);
        kali = angka.multiply(angka1);
        bagi = angka.divide(angka1);
        
        System.out.println(tambah+"\n"+kurang+"\n"+kali+"\n"+bagi);
        
        
    }
    
}
