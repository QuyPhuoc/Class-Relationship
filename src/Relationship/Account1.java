/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class Account1 {
    private String id;
    private Customer1 khachhang;
    private double balance;

    public Account1(String id, Customer1 khachhang, double balance) {
        this.id = id;
        this.khachhang = khachhang;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer1 getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Customer1 khachhang) {
        this.khachhang = khachhang;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double m){
        balance += m;
        System.out.println("transaction successful");
    }
    public void withdraw(double m){
        if(balance >= m){
            balance -= m;
            System.out.println("transaction successful");
        }else{
            System.out.println("amount withdrawn exceeds the current balance!");
        }
    }
    @Override
    public String toString() {
        return khachhang +"\n"
                + "Account ID : " + id + "\n"
                + "Balance : "
                +String.format("%.2f", balance) + " $";
                
    }
    
    
}
