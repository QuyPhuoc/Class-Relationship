/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author DELL
 */
public class MovableCircle extends MovablePoint1 implements Movable{
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    
    public void moveDown(){
        super.MoveDown();
    }
    
    public void moveUp(){
        super.MoveUp();
    }
    
    public void moveRight(){
        super.MoveRight();
    }
    
    public void moveLeft(){
        super.MoveRight();
    }
    @Override
    public String toString(){
        return super.toString() + " " + radius;
    }
    public String supertoString(){
        return super.toString();
    }
}
