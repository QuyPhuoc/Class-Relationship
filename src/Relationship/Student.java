/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;
import java.util.*;
/**
 *
 * @author DELL
 */
public class Student {
    private String ma, ten, lop;
    private ArrayList<Monhoc> ds;

    public Student(String ma, String ten, String lop,  ArrayList<Monhoc> ds) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ds = ds;   
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public ArrayList<Monhoc> getDs() {
        return ds;
    }

    public void setDs(ArrayList<Monhoc> ds) {
        this.ds = ds;
    }

    public double tinhGPA() {
        double diemtichluy = 0;
        int tongtc = 0;
        for(int i = 0; i < this.ds.size(); i++){
            diemtichluy += (this.ds.get(i).getTinchi() * this.ds.get(i).getGpa());
            tongtc += this.ds.get(i).getTinchi();
        }
        double sum = diemtichluy / tongtc;
        return sum;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + String.format("%.2f", this.tinhGPA()) + "\n------------------------";
    }

    
}
