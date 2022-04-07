package lat7.pkg2;

/**
 *
 * @author GHANI
 */
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Overload obj = new Overload();
        double result;
        obj.demo(10);
        obj.demo(10, 20);
        result = obj.demo(5.5);
        System.out.println("O/P : "+result);
    }
    
}
