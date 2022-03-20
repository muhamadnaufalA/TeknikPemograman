package composition;

/**
 *
 * @author GHANI
 */
public class People {
    private String name;
    private potpie birthday;
    
    public People(String theName, potpie theDate){
        name = theName;
        birthday = theDate;
    }
    
    public String toString(){
        return String.format ("My name is %s, my birthday is %s", name, birthday);
    }
}
