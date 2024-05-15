public class Main {
    public static void main(String[] args) {
        Spaceship klingonen = new Spaceship("IKS Hegh'ta", 1, 2, 100, 100, 100, 100);
        Spaceship romulaner = new Spaceship("IRW Khazara", 2, 2, 100,100,100,100);
        Spaceship vulkanier = new Spaceship("Ni'Var", 0,5,80,80,50,100);

        Cargo c1 = new Cargo("Ferengi Schneckensaft", 200);
        Cargo c2 = new Cargo("Bet'leth Klingonen Schwert", 200);
        Cargo c3 = new Cargo("Borg-Schrott", 5);
        Cargo c4 = new Cargo("Rote Materie", 2);
        Cargo c5 = new Cargo("Plasma-Waffe", 50);
        Cargo c6 = new Cargo("Forschungssonde", 35);
        Cargo c7 = new Cargo("Photonentorpedo", 3);

        klingonen.addCargo(c1);
        klingonen.addCargo(c2);
        klingonen.sayCargo();

        romulaner.addCargo(c3);
        romulaner.addCargo(c4);
        romulaner.addCargo(c5);
        romulaner.sayCargo();

        vulkanier.addCargo(c6);
        vulkanier.addCargo(c7);
        vulkanier.sayCargo();

        Cargo uniqueCargo = new Cargo();
        uniqueCargo.defineCargo();


    }
}
