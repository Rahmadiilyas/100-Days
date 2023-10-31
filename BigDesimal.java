
package day.pkg100;
import java.math.BigDecimal;
public class BigDesimal {
    public static void main(String[] args) {
        BigDecimal a,b,c,d,e,f,g,h;
        a = new BigDecimal("10.1");
        b = new BigDecimal("11.1");
        c = new BigDecimal("22.1");
        d = new BigDecimal("33.1");
        
        e = a.add(a);//penjumlahan
        f = b.multiply(d);//perkalian
        g = c.subtract(d);//pengurangan 
        h = d.divide(d);//pembagian
        
        System.out.println(e+"\n"+f+"\n"+g+"\n"+h);
    }
}
