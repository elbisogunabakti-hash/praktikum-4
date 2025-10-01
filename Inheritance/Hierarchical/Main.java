package Inheritance.Hierarchical;

public class Main {
    public static void main(String[] args) {
    
        Burung elang = new Burung();
        elang.nama = "Elang";
        elang.makan();    
        elang.terbang();  

        System.out.println();

        Ikan nemo = new Ikan();
        nemo.nama = "Nemo";
        nemo.makan();     
        nemo.berenang();  
    }
}
