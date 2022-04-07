package Animal;

import Animal.Animal;

/**
 *
 * @author GHANI
 */
public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String[] args) {
        Animal obj;
        obj = new Cat();
        obj.sound();
    }
    
}
