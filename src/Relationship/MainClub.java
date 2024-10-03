/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
/**
 *
 * @author DELL
 */
public class MainClub {
    public static int getIndex(SundayLeague[] list, String s){
        for(int i = 0; i < list.length; i++){
            if(list[i].getTen().equals(s)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList<SundayLeague> list = new ArrayList<>();
        SundayLeague[] list = new SundayLeague[20];
        
        for(int i = 0; i < 20; i++){
            sc.nextLine();
            SundayLeague sl = new SundayLeague(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            list[i] = sl;
            sc.nextLine();
            sc.nextLine();
        }
        for(int i = 0; i < 10; i++){
            String s = sc.nextLine();
            String[] arr = s.split("-");
            String[] arr1 = arr[0].trim().split("\\s+");
            String[] arr2 = arr[1].trim().split("\\s+");
            String X = "", Y = "";
            for(int j = 0; j < arr1.length - 1; j++){
                X += arr1[j] + " ";
            }
            for(int j = 1; j < arr2.length; j++){
                Y += arr2[j] + " ";
            }
            int x = Integer.parseInt(arr1[arr1.length- 1]);
            int y = Integer.parseInt(arr2[0]);
            int idx1 = getIndex(list, X.trim());
            int idx2 = getIndex(list, Y.trim());
            list[idx1].setSotran(list[idx1].getSotran() + 1);
            list[idx2].setSotran(list[idx2].getSotran() + 1);
            if(x > y){
                list[idx1].setDiemso(list[idx1].getDiemso() + 3);
                list[idx1].setHieuso(list[idx1].getHieuso() + x - y);
                list[idx2].setHieuso(list[idx2].getHieuso() - (x - y));
            }else if(x < y){
                list[idx2].setDiemso(list[idx2].getDiemso() + 3);
                list[idx2].setHieuso(list[idx2].getHieuso() + y - x);
                list[idx1].setHieuso(list[idx1].getHieuso() - (y - x));
            }else{
                list[idx1].setDiemso(list[idx1].getDiemso() + 1);
                list[idx2].setDiemso(list[idx2].getDiemso() + 1);
            }
        }
        Arrays.sort(list, new Comparator<SundayLeague>(){
            @Override
            public int compare(SundayLeague x, SundayLeague y){
                if(x.getDiemso() != y.getDiemso()){
                    return y.getDiemso() - x.getDiemso();
                }
                if(x.getDiemso() != y.getHieuso()){
                    return y.getHieuso() - x.getHieuso();
                }
                return x.getMa().compareTo(y.getMa());
            }
        });
        for(int i = 0; i < 20; i++){
            System.out.println("#" + (i + 1) + " " + list[i]);
            System.out.println("------------------");
        }
    }
}
