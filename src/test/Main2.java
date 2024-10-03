/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
///**
// *
// * @author DELL
// */
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Shape> list = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            String type = sc.next();
//            Shape sh = null;
//            if(type.equals("C")){
//                sh = new Circle(sc.nextDouble());
//            }
//            if(type.equals("R")){
//                sh = new Rectangle(sc.nextDouble(), sc.nextDouble());
//            }
//            list.add(sh);
//        }
//        System.out.println("Circle : ");
//        for(Shape x : list){
//            if(x instanceof Circle){
//                System.out.print(x);
//            }
//        }
//        System.out.println("Rectangle : ");
//        for(Shape x : list){
//            if(x instanceof Rectangle){
//                System.out.print(x);
//            }
//        }
//    }
//}
