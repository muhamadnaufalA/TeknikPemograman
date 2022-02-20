package soal5;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author GHANI
 * Program ini bertujuan untuk menentukan apakah keempat mobil tersebut harus berhenti atau jalan berdasarkan plat nomornya 
 */
public class Soal5 {

    public static void main(String[] args) {
       // Data Fields //
       Scanner keyboard = new Scanner (System.in);
       String plat1; // plat nomor mobil 1
       String plat2; // plat nomor mobil 2
       String plat3; // plat nomor mobil 3
       String plat4; // plat nomor mobil 4
       String gabungan; // gabungan dari keempat plat nomor tersebut
       BigInteger angka;  // konversi dari String gabungan plat nomor menjadi BigInteger
       BigInteger pengurangan; // pengurangan big integer yaitu angka 999999
       BigInteger pembagian; // pembagian big integer yaitu angka 5
       BigInteger modulo; // modulo big integer yaitu angak 5
       BigInteger NOL = new BigInteger ("0"); // Inisialisasi angka 0 dengan tipe BigInteger untuk keperluan kondisi apakah mobil-mobil tersebut jalan atau berhenti
       
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
           System.out.println ("berhenti");
       }else {
           System.out.println ("jalan");
       }
    }
    
}

// Lesson Learn //

/* lesson learn yang saya dapatkan dalam mengerjakan soal ini adalah
 * saya jadi lebih paham dan tau bagaimana cara menggunakan class BigInteger
 * di bahasa java ini
 */
