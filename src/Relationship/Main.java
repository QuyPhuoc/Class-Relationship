/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Account> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Account ac = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(ac);

        }
        int Q = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < Q; i++){
            String ten = sc.nextLine();
            String mk = sc.nextLine();
            boolean ok = false;
            for(Account ac : list){
                if(ac.getTen().equals(ten) && ac.getMk().equals(mk)){
                    System.out.println("Login Successful");
                    ok = true;
                    break;
                }
            }
            if(!ok){
                System.out.println("Login Failed");
            }
        }
        
    }
}
