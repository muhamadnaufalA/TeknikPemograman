package soal6;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author GHANI
 */
public class Soal6 {

    public static void main(String[] args) {
        // Data Fields //
        Scanner keyboard = new Scanner(System.in);
        String angka1;
        String angka2;
        BigInteger operan1;
        BigInteger operan2;
        
        // Behavior //
        angka1 = keyboard.nextLine();
        angka2 = keyboard.nextLine();
        operan1 = new BigInteger (angka1);
        operan2 = new BigInteger (angka2);
        System.out.println(operan1.add(operan2));
        System.out.println(operan1.multiply(operan2));
    }
    
}
