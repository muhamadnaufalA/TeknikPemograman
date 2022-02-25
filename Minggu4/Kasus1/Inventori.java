/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasus1;

/**
 *
 * @author GHANI
 */
public class Inventori {
    Barang[] barangs;
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); // tampilkan variabel yang private stok menggunakan getStok
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    void pengadaan () {
        initBarang();
        
        barangs [0].setStok(20); // inputkan isi dari variabel private stok dengan method setStok()
        barangs [0].setStok(30);
        barangs [0].setStok(30);
        showBarang();
    }
    
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
    
}

// Lesson Learn //
/* Lesson learn yang saya dapatkan dari mengerjakan kasus ini adalah
 * saya jadi lebih paham mengenai bagaimana cara mengenkapsulasi suatu variabel,
 * lalu saya jadi tau bagaimana cara menginputkan dan menampilkan nilai dari
 * suatu variabel yang private.
 */
