/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            MovablePoint1 mb = new MovableCircle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            int query = sc.nextInt();
            sc.nextLine();
            for(int j = 0; j < query; j++){
                String s = sc.next();
                if(s.equals("Down")){
                    mb.MoveDown();
                }else if(s.equals("Up")){
                    mb.MoveUp();
                }else if(s.equals("Right")){
                    mb.MoveRight();
                }else{
                    mb.MoveLeft();
                }
            }        
            System.out.println(((MovableCircle)mb).supertoString());
        }

    }
}
