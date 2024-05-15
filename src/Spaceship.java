import java.util.ArrayList;
import java.util.Scanner;

public class Spaceship {
    // Parameter
    String name;
    int torpedoCount;
    int energyPercent;
    int shieldPercent;
    int hullPercent;
    int healthinessPercent;
    int androidCount;
    ArrayList<Cargo> cargos;

    // Konstruktor
    public Spaceship(String name, int torpedoCount, int androidCount, int energyPercent, int hullPercent, int healthinessPercent, int shieldPercent) {
        this.name = name;
        this.torpedoCount = torpedoCount;
        this.androidCount = androidCount;
        this.energyPercent = energyPercent;
        this.shieldPercent = shieldPercent;
        this.hullPercent = hullPercent;
        this.healthinessPercent = healthinessPercent;
        this.cargos = new ArrayList<>();
    }
    public Spaceship() {
    }

    // Methoden
    public void addCargo(Cargo cargo){
        cargos.add(cargo);
    }

    public void removeCargo(Cargo cargo){
        cargos.remove(cargo);
    }

    public void sayCargo(){
        System.out.println("Cargo from " + this.getName() + ":");
        for(Cargo cargo : this.getCargos()){
            System.out.print(cargo.getName() + " - ");
            System.out.println(cargo.getCount());
        }
    }

    public void defineSpaceship(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Define a Name for the spaceship:");
        setName(keyboard.nextLine());
    }

    // Getter und Setter
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTorpedoCount() {
        return torpedoCount;
    }
    public void setTorpedoCount(int torpedoCount) {
        this.torpedoCount = torpedoCount;
    }
    public int getEnergyPercent() {
        return energyPercent;
    }
    public void setEnergyPercent(int energyPercent) {
        this.energyPercent = energyPercent;
    }
    public int getShieldPercent() {
        return shieldPercent;
    }
    public void setShieldPercent(int shieldPercent) {
        this.shieldPercent = shieldPercent;
    }
    public int getHullPercent() {
        return hullPercent;
    }
    public void setHullPercent(int hullPercent) {
        this.hullPercent = hullPercent;
    }
    public int getHealthinessPercent() {
        return healthinessPercent;
    }
    public void setHealthinessPercent(int healthinessPercent) {
        this.healthinessPercent = healthinessPercent;
    }
    public int getAndroidCount() {
        return androidCount;
    }
    public void setAndroidCount(int androidCount) {
        this.androidCount = androidCount;
    }
    public ArrayList<Cargo> getCargos(){
        return cargos;
    }
    public void setCargos(ArrayList<Cargo> cargos) {
        this.cargos = cargos;
    }
}