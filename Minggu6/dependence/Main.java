package dependence;

/**
 *
 * @author GHANI
 */
public class Main {

    public static void main(String[] args) {
       // states //
        Messi messi = new Messi();
        Ronaldo ronaldo = new Ronaldo();
        Rating rating = new Rating();
        
        // giveRating //
        rating.setRating(messi);
        rating.giveRating();
        
        rating.setRating(ronaldo);
        rating.giveRating();
    }
    
}
