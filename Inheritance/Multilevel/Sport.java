package Inheritance.Multilevel;
class Sport {
    String merk;

    void jalan() {
        System.out.println(merk + " sedang berjalan di jalan raya.");
    }
}
class Mobil extends Sport {
    void klakson() {
        System.out.println(merk + " membunyikan klakson: Tiiin Tiiin!");
    }
}
class MobilSport extends Mobil {
    void turbo() {
        System.out.println(merk + " mengaktifkan turbo dan melaju kencang!");
    }
}
