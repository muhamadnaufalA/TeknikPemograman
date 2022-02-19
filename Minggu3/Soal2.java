package soal2;
import java.util.Scanner;
/**
 *
 * @author GHANI
 * Program ini bertujuan untuk menampilkan nama bahasa programming
 * dan juga menampilkan sebuah angka yang jika dua digit maka depannya
 * ditambah 0, jika tidak maka tidak usah
 */
public class Soal2 {

    public static void main(String[] args) {
        // inisialisasi //
        Scanner keyboard = new Scanner(System.in);
        String bahasa; // bahasa programming nya
        int nomor; 
        int i; // increment for
        int digit=0;
        int tempNomor; // menyimpan nomor sebelum nanti di bagi 10 nomornya
        
        // algoritma //
        for (i=0; i<32; i++){
            System.out.print("=");
        }
        System.out.println("");
        for (i=0;i<3;i++){
            bahasa = keyboard.next();
            nomor = keyboard.nextInt();
            tempNomor = nomor;
            while (nomor > 0){
                nomor=nomor/10;
                digit++;
            }
            // tampil bahasa dan nomor //
            if (digit<=2){
                switch (bahasa.length()){
                    case 1 :System.out.println(bahasa+"    "+"0"+tempNomor);break;
                    case 2 :System.out.println(bahasa+"   "+"0"+tempNomor);break;
                    case 3 :System.out.println(bahasa+"  "+"0"+tempNomor);break;
                    case 4 :System.out.println(bahasa+" "+"0"+tempNomor);break;
                }
            }else {
                switch (bahasa.length()){
                    case 1 :System.out.println(bahasa+"    "+tempNomor);break;
                    case 2 :System.out.println(bahasa+"   "+tempNomor);break;
                    case 3 :System.out.println(bahasa+"  "+tempNomor);break;
                    case 4 :System.out.println(bahasa+" "+tempNomor);break;
                }
            }
            digit=0;
        }
         for (i=0; i<32; i++){
            System.out.print("=");
        }
         System.out.println("");
    } 
}

// Lesson Learn //

/* Lesson learn yang saya dapatkan dalam mengerjakan soal ini adalah
 * saya jadi lebih paham dan tau bagaimana cara menggunakan switch case
 * pada bahasa java
 */ 
