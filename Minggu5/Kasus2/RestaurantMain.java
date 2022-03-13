package kasus2;

/*
 *
 * @author GHANI3
 * Program ini bertujuan untuk sebagai bahan pelajaran 
 * contoh class yang baik pada bahasa java
 */
public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();   
        menu.pesanMakanan();
        menu.tampilMenuMakanan();  
    }
    
}
