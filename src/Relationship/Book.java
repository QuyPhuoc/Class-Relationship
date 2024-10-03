/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */ 
public class Book {
    private String tensach;
    private Author tacgia;
    private int gia;
    private int soluong;

    public Book(String tensach, Author tacgia, int gia, int soluong) {
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.gia = gia;
        this.soluong = soluong;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public Author getTacgia() {
        return tacgia;
    }

    public void setTacgia(Author tacgia) {
        this.tacgia = tacgia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return  "Book Details : \n"
                + tensach + "\n"
                + gia + "\n"
                + soluong + "\n"
                + tacgia + "\n";
    }
    
}
