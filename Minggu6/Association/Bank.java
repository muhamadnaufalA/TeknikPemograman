package Association;

/**
 *
 * @author GHANI
 */
public class Bank {
    // state //
    private String name;
    
    // constructor //
    public Bank (String name){
        this.name = name;
    }
    
    // getter //
    public String getBankName(){
        return this.name;
    }
}
