package Relationship;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class GameJava {
    private int power, blood;
    private String status;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GameJava(int power, int blood, String status) {
        this.power = power;
        this.blood = blood;
        this.status = status;
    }

    
    
    
    @Override
    public String toString(){
        return "POWER : "
               + power + "\n" 
               + "BLOOD : "
               + blood + "\n"
               + status + "\n"
               +"--------------------\n";
    }
}
