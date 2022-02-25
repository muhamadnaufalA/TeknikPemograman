/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus3;

/**
 *
 * @author GHANI
 */
public class KelasSatu {
    {
        System.out.println(11); // angka ini akan ditampilkan terus setiap KelasSatu dipanggil
    }
    
    static
    {
        System.out.println(2); // angka ini akan ditampilkan di awal ketika constructor Kelas Satu  
                               // tanpa parameter dipanggil
    }
    
    public KelasSatu(int i) // constructor dengan parameter
    {
        System.out.println(3); // angka ini akan ditampilkan ketika constuctor dengan parameter dipanggil
    }
    public KelasSatu() // constructor tanpa parameter
    {
        System.out.println(4); // angka ini akan ditampilkan ketika constuctor tanpa parameter dipanggil
    }
}
