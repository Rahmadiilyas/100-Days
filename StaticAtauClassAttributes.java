
package day.pkg100;

class display{
    static String type = "Display";
    private String name;
    
    display(String nama){
        this.name = nama;
    }
    void settype(String typeinput){
        display.type = typeinput;
    }
    void show(){
        System.out.println("Display = "+this.name);
}
}
public class StaticAtauClassAttributes {
    public static void main(String[] args) {
        display display1 = new display("Monitor");
        display1.show();
        display display2 = new display("Smartphone");
        display2.show();
        
        display1.settype("Android");
        System.out.println("\nMenampilkan static variabel ");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(display.type);
    }
}
