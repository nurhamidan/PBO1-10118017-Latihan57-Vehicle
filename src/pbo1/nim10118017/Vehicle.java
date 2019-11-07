package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini merupakan class parent yang memiliki atribut umum vehicle.
 * 
 */
public class Vehicle {
    private String myBrand;
    private String myModel;

    public Vehicle() {
        
    }

    public String getBrand() {
        return myBrand;
    }

    public void setBrand(String brand) {
        this.myBrand = brand;
    }

    public String getModel() {
        return myModel;
    }

    public void setModel(String model) {
        this.myModel = model;
    }
}
