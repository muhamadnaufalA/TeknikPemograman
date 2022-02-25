/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus2;

/**
 *Program ini bertujuan untuk mengubah output menjadi kata Ipin.
 * Lalu program ini juga bertujuan untuk memahami lebih lanjut
 * mengenai materi variabel private, dan costructor.
 * @author GHANI
 */
public class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        System.out.println(this.name = new Item().name); // isi variabel this.new dengan string name pada constructor private Item()
    }
}
