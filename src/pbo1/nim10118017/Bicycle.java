package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini turunan dari class Vehicle, dimana Bicycle memiliki properti khusus.
 * 
 */
public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle() {
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}
