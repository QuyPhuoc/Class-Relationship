/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author DELL
 */
public class Customer1 {
    private String id, name, gender;

    public Customer1(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Customer1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer ID : "
               + id + "\n"
               + "Full Name : "
               + name + "\n"
               +"Gender : "
               + gender;
    }
    
    
}
