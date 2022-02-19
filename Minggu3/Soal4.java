package soal4;

import java.util.Scanner;
/**
 *
 * @author GHANI
 * Program ini bertujuan untuk menghitung gaji agent perbulan berdasarkan jumlah penjualan yang telah ia berhasil lakukan
 */
public class Soal4 {

    public static void main(String[] args) {
        // data fields //
        Scanner keyboard = new Scanner(System.in);
        int gaji=500000; // inisialisasi gaji pokok perbulan
        int bonus; // bonus yang diterima
        int nPenjualan; // banyak penjualan yang berhasil di jual
        int banyakMinusPenjualan; // jumlah produl yang tidak berhasil sesuai targer perbulan
        int pemotongan; // jumlah pemotongan gaji
        
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

// Lesson Learn //
/* Lesson learn yang saya dapatkan dalam mengerjakan soal ini adalah
 * saya jadi tau bahwa angka integer tidak bisa dioperasikan dengan angka decimal
 * /
