package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini turunan dari class Vehicle, dimana Skateboard memiliki properti khusus.
 * 
 */
public class Skateboard extends Vehicle {
    private double myBoardLength;

    public Skateboard() {
        System.out.println("Skateboard");
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
}
