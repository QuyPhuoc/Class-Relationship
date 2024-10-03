/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MovablePoint> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            double X = sc.nextDouble();
            double Y = sc.nextDouble();
            double xSpeed = sc.nextDouble();
            double ySpeed = sc.nextDouble();
            int move = sc.nextInt();
            MovablePoint point = new MovablePoint(X, Y, xSpeed, ySpeed, move);
            list.add(point);
        }
        for(MovablePoint x : list){
            x.Move();
            System.out.println(x);
            System.out.println("-------------------");
        }
        
    }
}
