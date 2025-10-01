package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

       
        mobil1.setMerk("Toyota");
        mobil1.setWarna("Hitam");
        mobil1.setTahun(2022);

      
        System.out.println("Merk   : " + mobil1.getMerk());
        System.out.println("Warna  : " + mobil1.getWarna());
        System.out.println("Tahun  : " + mobil1.getTahun());

        
        System.out.println("Jenis  : " + Mobil.jenisKendaraan); 
        System.out.println("Asal   : " + mobil1.negaraAsal);    
    }
}
