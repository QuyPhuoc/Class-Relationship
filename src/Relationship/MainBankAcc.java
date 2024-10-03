    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author DELL
 */
public class MainBankAcc {
    static HashMap<String, BankAccount> map = new HashMap<>();
    
    private static void Transfer(String s, String s1, int s2){
        BankAccount fromacc = map.get(s);
        BankAccount toacc = map.get(s1);
        if(fromacc != null && toacc != null && fromacc.getBalance() - s2 >= 50000){
            fromacc.setBalance(fromacc.getBalance() - s2);
            toacc.setBalance(toacc.getBalance() + s2);
        }
    }
    
    private static void Withdraw(String number, int amount){
        BankAccount acc = map.get(number);
        if(acc != null && acc.getBalance() - amount >= 50000){
            acc.setBalance(acc.getBalance() - amount);
        }
    }
    
    private static void Deposit(String accNum, int amount){
        BankAccount acc = map.get(accNum);
        if(acc != null){
            acc.setBalance(acc.getBalance() + amount);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<BankAccount> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            BankAccount ba = new BankAccount(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            list.add(ba);
            map.put(ba.getSoTK(), ba);
        }
        int Q = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < Q; i++){
            String GG = sc.nextLine();
            String[] a = sc.nextLine().split("\\s+");
            if(GG.equals("transfer")){
                Transfer(a[0], a[1], Integer.parseInt(a[2]));
            }
            if(GG.equals("withdraw")){
                Withdraw(a[0], Integer.parseInt(a[1]));
            }
            if(GG.equals("deposit")){
                Deposit(a[0], Integer.parseInt(a[1]));
            }
        }
        for(BankAccount x : list){
            System.out.print(x);
        }
    }
}
