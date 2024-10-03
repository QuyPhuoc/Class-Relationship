/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;


import java.util.*;

/**
 *
 * @author DELL
 */
public class MainGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
           String s1=sc.nextLine();
           int power=Integer.parseInt(s1.substring(s1.indexOf(":")+2));
                String s2=sc.nextLine();
            int blood =Integer.parseInt(s2.substring(s2.indexOf(":")+2));
            GameJava s =new GameJava(power,blood,sc.nextLine());
            int q=sc.nextInt();
            sc.nextLine();
            while(q-->0) {
                if (s.getStatus().equals("ALIVE")) {
                    String monster = sc.next();
                    if (monster.charAt(0) == 'w') {
                        int monspow = sc.nextInt();
                        sc.nextLine();
                        if (monspow >= s.getPower()) {
                            s.setBlood(0);
                            s.setPower(0);
                            s.setStatus("DEAD");
                        } else {
                            s.setPower(s.getPower() + 5);
                        }

                    } else if (monster.charAt(0) == 'm') {

                        s.setPower(s.getPower() - 2);
                        s.setBlood(s.getBlood() - 15);


                    } else if (monster.charAt(0) == 'p') {
                        s.setPower(s.getPower() + 2);
                        s.setBlood(s.getBlood() + 10);
                    } else {
                        int monpow = sc.nextInt();
                        sc.nextLine();
                        if (monpow >= s.getPower()) {
                            s.setBlood(0);
                            s.setPower(0);
                            s.setStatus("DEAD");
                        } else {
                            s.setPower(s.getPower() + 7);
                            s.setBlood(s.getBlood() + 5);
                        }
                    }
                    System.out.print(s);
                }
                else{
                    System.out.print(s);
                }
            }
    }
}
    