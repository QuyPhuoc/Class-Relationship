/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author DELL
 */
public class MainCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Invoice> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            String id1 = s1.substring(s1.indexOf(":") + 2);
            String s2 = sc.nextLine();
            String name = s2.substring(s2.indexOf(":") + 2);
            String s3 = sc.nextLine();
            int discount = Integer.parseInt(s3.substring(s3.indexOf(":") + 2));
            String s4 = sc.nextLine();
            int id2 = Integer.parseInt(s4.substring(s4.indexOf(":") + 2));
            String s5 = sc.nextLine();
            double amount = Double.parseDouble(s5.substring(s5.indexOf(":") + 2, s5.indexOf("$") - 1));
            Customer kh = new Customer(id1, name, discount);
            Invoice hd = new Invoice(id2, kh, amount);
            list.add(hd);
        }
        Collections.sort(list, new Comparator<Invoice>(){
            @Override
            public int compare(Invoice x, Invoice y){
                if(x.getAmount() != y.getAmount()){
                    return Double.compare(y.getAmount(), x.getAmount());
                }
                return x.getKhachhang().getId().compareTo(y.getKhachhang().getId());
            }
        });
        for(Invoice x : list){
            System.out.println(x);
            System.out.println("--------------------");
        }
    }
}
