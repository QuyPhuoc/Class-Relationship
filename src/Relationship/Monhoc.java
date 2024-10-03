/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class Monhoc {
    private String name;
    private int tinchi;
    private double gpa;

    public Monhoc(String name, int tinchi, double gpa) {
        this.name = name;
        this.tinchi = tinchi;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTinchi() {
        return tinchi;
    }

    public void setTinchi(int tinchi) {
        this.tinchi = tinchi;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
    @Override
    public String toString() {
        return this.name;
    }
   
}
