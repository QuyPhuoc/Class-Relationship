/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MainTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(":");
        MyTime time = new MyTime(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        System.out.println(time.nextSecond());
        System.out.println(time.nextMinute());
        System.out.println(time.nextHour());
        System.out.println(time.prevSecond());
        System.out.println(time.prevMinute());
        System.out.println(time.prevHour());
    }
}
