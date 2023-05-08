import Locations.*;
import Tourists.*;



public class App {
    public static void main(String[] args) throws Exception {

        Locations Bacolod = new Bacolod();
        Locations Bataan = new Bataan();
        Locations Boracay = new Boracay();
        Locations Palawan = new Palawan();
        Locations Pampanga = new Pampanga();
        Locations Bicol = new Bicol();

        Tourist Delosreyes = new Delosreyes();

        Bacolod.accept(Delosreyes);
        Bataan.accept(Delosreyes);
        Boracay.accept(Delosreyes);
        Palawan.accept(Delosreyes);
        Pampanga.accept(Delosreyes);
        Bicol.accept(Delosreyes);

    }
}