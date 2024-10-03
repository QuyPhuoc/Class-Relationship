/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author DELL
 */
public class MovablePoint extends Point {
    private double xSpeed;
    private double ySpeed;
    private int move;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed, int move) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.move = move;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }
    
    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    public void Move(){
        x += xSpeed * move;
        y += ySpeed * move;
    }
    @Override
    public String toString() {
        return String.format("X : %.2f \nY : %.2f \nX Speed : %.2f\nY Speed : %.2f", x, y, xSpeed, ySpeed);
       
    }
    
    
}
