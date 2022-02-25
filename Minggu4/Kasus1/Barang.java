/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus1;

/**
 * Program ini bertujuan untuk menampilkan nama, kode dan jumlah stok barang.
 * Lalu program ini juga bertujuan sebagai studi kasus tentang penggunaan 
 * enkapsulasi pada sebuah variabel.
 * @author GHANI
 */
public class Barang {

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok += stok; // diubah menjadi +=, karena yang diminta hanya operasi tambah
    }
    // data fields
    String kode_barang;
    String nama_barang;
    private int stok; // jadikan variabel stok menjadi private
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
