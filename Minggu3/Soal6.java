package soal6;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author GHANI
 * Program ini bertujuan untuk menampilkan pertambahan dan perkalian menggunakan class BigInteger
 */
public class Soal6 {

    public static void main(String[] args) {
        // Data Fields //
        Scanner keyboard = new Scanner(System.in);
        String angka1; // input String angka ke satu
        String angka2; // input String angka ke dua
        BigInteger operan1; // hasil konversi dari string angka ke satu menjadi tipe Biginteger
        BigInteger operan2; // hasil konversi dari string angka ke dua menjadi tipe BigInteger
        
        // Behavior //
        angka1 = keyboard.nextLine(); // input String angka 1
        angka2 = keyboard.nextLine(); // input string angka 2
        operan1 = new BigInteger (angka1); // konversi string angka 1
        operan2 = new BigInteger (angka2); // konver string angka 2
        // tampilkan //
        System.out.println(operan1.add(operan2));
        System.out.println(operan1.multiply(operan2));
    }
    
}

// Lesson Learn //

/* Lesson learn yang saya dapatkan dalam mengerjakan soal ini adalah
 * saya jadi lebih tau bagaimana cara melakukan operasi pertambahan dan
 * perkalian pada tipe BigInteger
 */
