/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try{
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);
            String s = sc.nextLine();
            int n = sc.nextInt();
            System.out.println(s + " " +n);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
