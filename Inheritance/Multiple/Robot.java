package Inheritance.Multiple;
interface BisaBerjalan {
    void jalan();
}
interface BisaBerbicara {
    void bicara();
}
class Robot implements BisaBerjalan, BisaBerbicara {
    String nama;

    public void jalan() {
        System.out.println(nama + " sedang berjalan dengan roda.");
    }

    public void bicara() {
        System.out.println(nama + " berkata: Halo, saya robot cerdas!");
    }
}
