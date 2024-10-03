/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class BankAccount {
    private String ID, cusID, soTK, PIN;
    private int Balance;

    public BankAccount(String ID, String cusID, String soTK, String PIN, int Balance) {
        this.ID = ID;
        this.cusID = cusID;
        this.soTK = soTK;
        this.PIN = PIN;
        this.Balance = Balance;
    }

    public String getSoTK() {
        return soTK;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    
    @Override
    public String toString() {
        return "ID : " + ID + "\n"
                + "CusID : " + cusID +"\n"
                + "Number : " + soTK +"\n"
                + "PIN : " + PIN +"\n"
                + "Balance : " + Balance + "VND" + "\n"
                + "-------------------\n";
    }
    
}
