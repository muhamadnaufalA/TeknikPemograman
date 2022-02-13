/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;
/**
 *
 * @author GHANI
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka;
        int i;
        
        for (i=0;i<6;i++){
            angka = input.nextDouble();
            System.out.println(+ angka +" can be filled in :");       
            if (angka >= -128 && angka <= 127) {
                System.out.println("*byte");
            }
            if (angka >= -32768 && angka <= 32767){
                System.out.println("*short");
            }
            if (angka >= -2147483648 && angka <= 2147483647){
                System.out.println("*integer");
            }
            if(angka >=-9223372036854775807L && angka <=9223372036854775806L) {
                System.out.println("*long");
            }
            else {
                 System.out.println("can't be fitted anywhere.");
            }
        }
    }
}
