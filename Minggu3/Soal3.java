package soal3;
import java.util.Scanner;

/**
 *
 * @author GHANI
 */
public class Soal3 {

    public static void main(String[] args) {
        // kamus data //
        Scanner keyboard = new Scanner(System.in);
        int angka1,angka2;
        char operator;
        
        // algoritma //
        angka1 = keyboard.nextInt();
        operator = keyboard.next().charAt(0);
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
