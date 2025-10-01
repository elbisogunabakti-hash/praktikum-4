package Inheritance.Single;

public class Main {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        mbl.merk = "Toyota";
        mbl.jalan();
        mbl.klakson();

        System.out.println();

        Motor mtr = new Motor();
        mtr.merk = "Honda";
        mtr.jalan();
        mtr.ngebut();
    }
}
