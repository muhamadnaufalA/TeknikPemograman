package soal6;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        // Kamus Data //
        String A = in.next();
        String B = in.next();
        String sub_A;
        String sub_B;
        
        // Algoritma //
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }else if (A.compareTo(B)<0){
            System.out.println("No");
        }else if (A.compareTo(B)==0){
            System.out.println("No");
        }
        sub_A = A.substring(0,1).toUpperCase()+A.substring(1,A.length());
        sub_B = B.substring(0,1).toUpperCase()+B.substring(1,B.length());
        System.out.println(sub_A + " " + sub_B);
    }  
}
