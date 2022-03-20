package dependence;

/**
 *
 * @author GHANI
 */
public class Rating {
    private IRatingPemainSepakBola rating;
    
    public void setRating (IRatingPemainSepakBola rating){
        this.rating = rating;
    }
    
    public void giveRating(){
        this.rating.giveRating();
    }
}
