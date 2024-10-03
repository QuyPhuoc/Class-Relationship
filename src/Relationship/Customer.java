/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class Customer {
    private String id, ten;
    private int discount;

    public Customer(String id, String ten, int discount) {
        this.id = id;
        this.ten = ten;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
    
    
    @Override
    public String toString(){
        return "Customer ID : "
                + id + "\n"
                + "Full Name : "
                + ten;
                
    }
}
