package soal4;

import java.util.Scanner;
/**
 *
 * @author GHANI
 */
public class Soal4 {

    public static void main(String[] args) {
        // data fields //
        Scanner keyboard = new Scanner(System.in);
        int gaji=500000;
        int bonus;
        int nPenjualan;
        int banyakMinusPenjualan;
        int pemotongan;
        
        // behavior //
        nPenjualan = keyboard.nextInt();
        if (nPenjualan >= 40 && nPenjualan <= 80){
            gaji = gaji + ((gaji * 25)/100);
        }else if (nPenjualan > 80){
            gaji = gaji + ((gaji * 35)/100);
        }else if (nPenjualan < 15){
            banyakMinusPenjualan = 15 - nPenjualan;
            pemotongan = ((50000 * banyakMinusPenjualan)*15/100);
            gaji = gaji - pemotongan;
        }else {
            bonus = ((50000 * 10)/100) * nPenjualan;
            gaji = gaji + bonus;
        }
        System.out.println (gaji);
    }
    
}
