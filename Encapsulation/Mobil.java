package Encapsulation;
public class Mobil {
  
    private String merk;
    private String warna;
    private int tahun;

    public static String jenisKendaraan = "Mobil";  
    public final String negaraAsal = "Jepang";      

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getTahun() {
        return tahun;
    }
}
