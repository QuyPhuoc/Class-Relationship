/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class Author {
    private String ten, email, gioiTinh;

    public Author(String ten, String email, String gioiTinh) {
        this.ten = ten;
        this.email = email;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public String getEmail() {
        return email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
  
    @Override
    public String toString(){
        return "Author Information : \n"
                + ten + "\n"
                + email + "\n"
                + gioiTinh + "\n"
                + "--------------------";
    }

}
