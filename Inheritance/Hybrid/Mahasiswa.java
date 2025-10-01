package Inheritance.Hybrid;
class Mahasiswa extends Manusia implements Pekerja, Pelajar {
    String jurusan;

    public void bekerja() {
        System.out.println(nama + " bekerja sambilan sebagai freelancer.");
    }
    public void belajar() {
        System.out.println(nama + " belajar di jurusan " + jurusan);
    }
}
