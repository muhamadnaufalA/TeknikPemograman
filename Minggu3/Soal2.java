package soal2;
import java.util.Scanner;
/**
 *
 * @author GHANI
 */
public class Soal2 {

    public static void main(String[] args) {
        // inisialisasi //
        Scanner keyboard = new Scanner(System.in);
        String bahasa;
        int nomor;
        int i;
        int digit=0;
        int tempNomor;
        
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
