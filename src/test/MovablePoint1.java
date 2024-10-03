/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author DELL
 */
public class MovablePoint1 implements Movable{

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint1(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public void MoveUp() {
        y -= ySpeed;
    }

    @Override
    public void MoveDown() {
        y += ySpeed;
    }

    @Override
    public void MoveLeft() {
        x -= xSpeed;
    }

    /**
     *
     */
    @Override
    public void MoveRight() {
        x += xSpeed;
    }
    @Override
    public String toString(){
        return x + " " + y;
    }
}
