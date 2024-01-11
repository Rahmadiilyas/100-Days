package day.pkg100;
class data{
    public int intpublic;
    private int intprivate;
    private double doubleprivate;
    
    public data(){
        this.intpublic=0;
        this.intprivate=10;
        
    }
    void display(){
        System.out.println(this.intpublic);
        System.out.println(this.intprivate);
        System.out.println(this.doubleprivate);
    }
    public int getintprivate(){
       return this.intprivate;
    }
    public void doubleprivate(double value){
        this.doubleprivate=value;
    }
    
}
class lingkaran{
    private double diameter;
    
    lingkaran(double diameter){
        this.diameter= diameter;
    }
    public void setjari2(double jari){
        this.diameter = jari*2;
    }
    public double getjari(){
        return this.diameter/2;
    }
    public double getluas(){
        return 3.14*diameter*diameter/4;
    }
}
public class encapsulasi {
    public static void main(String[] args) {
        data object = new data();
        //membaca dan menulis 
        object.intpublic=5;
        System.out.println(object.intpublic);
        
        //membaca saja
        int angka = object.getintprivate();
        System.out.println(angka);
        
        //menulis saja
        object.doubleprivate(0.01);
        
        object.display();
        
        //gabungan read only dan write 
        lingkaran object2 = new lingkaran(5);
        System.out.println("jari jari : "+object2.getjari());
        object2.setjari2(14);
        System.out.println("jari jari : "+object2.getjari());
        
        System.out.println("Diameter : "+object2.getluas());
    }
}
