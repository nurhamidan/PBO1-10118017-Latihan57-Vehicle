package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main, dimana class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);
        tampilPropertiVehicle(bicycle);
        System.out.println("Jumlah Gear : " + bicycle.getGearCount() + "\n");
        
        Skateboard skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setBoardLength(54.5);
        tampilPropertiVehicle(skateboard);
        System.out.println("Panjangnya Board : " + skateboard.getBoardLength());
    }
    
    public static void tampilPropertiVehicle(Vehicle vehicle) {
        System.out.println("Brand : " + vehicle.getBrand());
        System.out.println("Model : " + vehicle.getModel());
    }
    
}
