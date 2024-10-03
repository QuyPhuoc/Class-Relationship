/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class SundayLeague {
    private String ma, ten;
    private int sotran, diemso, hieuso;

    public SundayLeague() {
    }

    
    public SundayLeague(String ma, String ten, int sotran, int hieuso, int diemso) {
        this.ma = ma;
        this.ten = ten;
        this.sotran = sotran;
        this.diemso = diemso;
        this.hieuso = hieuso;
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

    public int getSotran() {
        return sotran;
    }

    public void setSotran(int sotran) {
        this.sotran = sotran;
    }

    public int getDiemso() {
        return diemso;
    }

    public void setDiemso(int diemso) {
        this.diemso = diemso;
    }

    public int getHieuso() {
        return hieuso;
    }

    public void setHieuso(int hieuso) {
        this.hieuso = hieuso;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + sotran + " " + hieuso + " " + diemso; 
    }
    
}
