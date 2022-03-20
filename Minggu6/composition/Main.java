package composition;

/**
 *
 * @author GHANI
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        potpie potObject = new potpie (26,5,2003);
        People peopleObject = new People ("Alghani", potObject);
        
        System.out.println (peopleObject);
    }
    
}
