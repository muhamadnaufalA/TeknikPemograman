package soal1;

import java.util.Scanner;

/**
 *
 * @author GHANI
 */
public class Soal1 {

    public static void main(String[] args) {
       // Kamus Data//
       String kata;
       int [] posisiPemisahKata = new int[100];
       int i;
       int j=0; // indeks array posisiPemisahKata
       char huruf;
       int jumlahkata=0;
    
        // Algoritma //
        Scanner keyboard = new Scanner(System.in);
        kata = keyboard.nextLine(); // input kata
        // hitung kata //
        for (i=0; i<kata.length();i++){
            huruf = kata.charAt(i);
            if (huruf==' ' || huruf==39 || huruf=='?' || huruf=='!' || huruf=='.'){
                 jumlahkata++;
                 posisiPemisahKata[j]=i;
                 j++;
            }
        }
        if (kata.length()==0){
            jumlahkata=0;
        }else{
           jumlahkata++; 
        }
        System.out.println(jumlahkata);
        for (i=0;i<jumlahkata;i++){
            if (i==0){
                System.out.println(kata.substring(0,posisiPemisahKata[i]));
            }else if (i==jumlahkata-1){
                System.out.println(kata.substring(posisiPemisahKata[i-1]+1,kata.length()));
            }
            else{
                System.out.println(kata.substring(posisiPemisahKata[i-1]+1,posisiPemisahKata[i]));
            }
        }
    }
    
}
