/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class Account {
    private String ID, cusID, ten, mk;

    public Account(String ID, String cusID, String ten, String mk) {
        this.ID = ID;
        this.cusID = cusID;
        this.ten = ten;
        this.mk = mk;
    }

    public String getID() {
        return ID;
    }

    public String getCusID() {
        return cusID;
    }

    public String getTen() {
        return ten;
    }

    public String getMk() {
        return mk;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
    
}
