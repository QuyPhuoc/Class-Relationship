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
public class MainCustomer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String id1 = s1.substring(s1.indexOf(":") + 2);
        String s2 = sc.nextLine();
        String ten = s2.substring(s2.indexOf(":") + 2);
        String s3 = sc.nextLine();
        String gender = s3.substring(s3.indexOf(":") + 2);
        String s4 = sc.nextLine();
        String ID = s4.substring(s4.indexOf(":") + 2);
        String s5 = sc.nextLine();
        double balance = Double.parseDouble(s5.substring(s5.indexOf(":") + 2, s5.indexOf("$") - 1));
        Customer1 khachhang = new Customer1(id1, ten, gender);
        Account1 acc = new Account1(ID, khachhang, balance);
        sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            if(s.charAt(0) == 'w'){
                acc.withdraw(Double.parseDouble(s.substring(s.indexOf(" ") + 1)));               
            }else{
                acc.deposit(Double.parseDouble(s.substring(s.indexOf(" ") + 1)));
            }
        }
        System.out.println("-------------------");
        System.out.println(acc);
    }
}
