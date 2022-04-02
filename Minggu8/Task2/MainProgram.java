package task2;

/**
 *
 * @author GHANI
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square b1 = new Square(2.0);
        Rectangle b2 = new Rectangle ("hitam", true, 2.0, 4.0);
        Circle b3 = new Circle ("Orange", false,  3.0);
        System.out.println(b1);
        System.out.println("Luas persegi = " +b1.getArea() +" dan Keliling persegi = "+ b1.getPerimeter());
        System.out.println(b2);
        System.out.println("Luas persegi Panjang = " +b2.getArea() +" dan Keliling persegi Panjang = "+ b2.getPerimeter());
        System.out.println(b3);
        System.out.println("Luas lingkaran = " +b3.getArea() +" dan Keliling lingkaran = "+ b3.getPerimeter());
        
    }
    
}
