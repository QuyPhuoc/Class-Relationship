/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class Invoice {
    private int id;
    private Customer khachhang;
    private double amount;

    public Invoice(int id, Customer khachhang, double amount) {
        this.id = id;
        this.khachhang = khachhang;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }
    
    
    public Customer getKhachhang() {
        return khachhang;
    }

    public double getAmount() {
        return amount * (100 - khachhang.getDiscount()) / 100;
    }

    @Override
    public String toString() {
        return khachhang + "\n" 
               +"Amount : " + String.format("%.2f", amount * (100 - khachhang.getDiscount()) / 100)+ " $";
    }
    
    
}
