package Animal;

import Animal.Animal;

/**
 *
 * @author GHANI
 */
public class Horse extends Animal{

    /**
     * @param args the command line arguments
     */
    @Override
    public void sound(){
        System.out.println ("Neigh");
    }

    public static void main(String[] args) {
        Animal obj = new Horse();
        obj.sound();
    }
    
}
