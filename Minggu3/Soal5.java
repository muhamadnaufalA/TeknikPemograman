package soal5;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author GHANI
 */
public class Soal5 {

    public static void main(String[] args) {
       // Data Fields //
       Scanner keyboard = new Scanner (System.in);
       String plat1;
       String plat2;
       String plat3;
       String plat4;
       String gabungan;
       BigInteger angka; 
       BigInteger pengurangan;
       BigInteger pembagian;
       BigInteger modulo;
       BigInteger NOL = new BigInteger ("0");
       
       // Behavior //
       plat1 = keyboard.next();
       plat2 = keyboard.next();
       plat3 = keyboard.next();
       plat4 = keyboard.next();
       gabungan = plat1.concat(plat2).concat(plat3).concat(plat4);
       angka = new BigInteger (gabungan);
       pengurangan = new BigInteger ("999999");
       pembagian = new BigInteger ("5");
       modulo = new BigInteger ("5");
       angka = angka.subtract(pengurangan);
       angka = angka.divide(pembagian);
       angka = angka.remainder(modulo);
       if (angka.compareTo(NOL) == 0){
           System.out.println ("jalan");
       }else {
           System.out.println ("berhenti");
       }
    }
    
}
