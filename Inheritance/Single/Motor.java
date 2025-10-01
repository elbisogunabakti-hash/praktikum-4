package Inheritance.Single;
class Kendaraan {
    String merk;

    void jalan() {
        System.out.println(merk + " sedang berjalan.");
    }
}
class Mobil extends Kendaraan {
    void klakson() {
        System.out.println(merk + " membunyikan klakson: Tiiin Tiiin!");
    }
}
class Motor extends Kendaraan {
    void ngebut() {
        System.out.println(merk + " melaju dengan cepat!");
    }
}
