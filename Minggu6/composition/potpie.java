package composition;

/**
 *
 * @author GHANI
 */
public class potpie {
    private int month;
    private int day;
    private int year;
    
    public potpie(int d, int m, int y){
        month = m;
        day = d;
        year = y;
        
    }
   
    @Override
    public String toString(){
        return String.format("%d/%d/%d", day,month,year);
    }
}
