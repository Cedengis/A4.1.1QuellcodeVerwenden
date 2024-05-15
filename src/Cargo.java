import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cargo {
    // Parameter
    String name;
    int count;

    // Konstruktor
    Cargo(String name, int count){
        this.name = name;
        this.count = count;
    }
    Cargo(){
    }

    // Methoden
    public void defineCargo(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Define the name of the Cargo:");
        this.setName(keyboard.nextLine());
        while(true){
            try {
                System.out.print("Define the amount of the Cargo:");
                this.setCount(keyboard.nextInt());
                keyboard.close();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input, try again!");
            }
        }
    }

    // Getter und Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
