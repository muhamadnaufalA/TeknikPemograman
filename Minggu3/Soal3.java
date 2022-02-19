package soal3;
import java.util.Scanner;

/**
 *
 * @author GHANI
 * Program ini bertujuan untuk menampilkan sebuah angka sesuai dengan input angka dan operasi yang diinputkan
 */
public class Soal3 {

    public static void main(String[] args) {
        // kamus data //
        Scanner keyboard = new Scanner(System.in);
        int angka1,angka2; // angka yang akan diinput dan dioperasikan
        char operator; // operator yang akan diinputkan
        
        // algoritma //
        angka1 = keyboard.nextInt();
        operator = keyboard.next().charAt(0); // input operator
        angka2 = keyboard.nextInt();
        if ((angka1>=1 && angka1<=1000) && (angka2>=1 && angka2<=1000)){
            switch (operator){
                case '+' : System.out.println(angka1+angka2);break;
                case '-' : System.out.println(angka1-angka2);break;
                case '*' : System.out.println(angka1*angka2);break;
                case '/' : System.out.println(angka1/angka2);break;
                case '%' : System.out.println(angka1%angka2);break;
            }   
        }
    }
    
}

// Lesson Learn //

/* Lesson learn yang saya dapatkan dalam mengerjakan soal ini adalah
 * saya jadi tau bagaimana cara menginput sebuah karakter pada bahasa java
 * karena pada bahasa java tidak ada perintah nextChar, maka perintah tersebut
 * diubah menjadi next().charAt(0).
 */
