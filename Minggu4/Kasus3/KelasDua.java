/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasus3;

/**
 * Program ini bertujuan untuk memahami lebih lanjut mengenai perbedaan
 * constructor yang sama nama nya tetapi berbeda pada parameternya.
 * @author GHANI
 */
public class KelasDua {
    {
        System.out.println(5);
    }
    public static void main(String[] args) {
        System.out.println(6); // angka ini akan ditampilka di baris pertama 
        KelasSatu satu = new KelasSatu(); // panggil constructor kelas satu tanpa parameter
        KelasSatu dua = new KelasSatu (10); // panggil constructor kelas satu dengan parameter
    }
    
}

// Lesson Learn //
/* Lesson learn yang saya dapatkan ketika mengerjakan soal ini adalah
 * saya jadi lebih paham bagaimana cara menggunakan constructor yang
 * berbeda, lalu jadi tau fungsi dari keyword "static" pada bahasa java
 */



