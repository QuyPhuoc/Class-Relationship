/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package test;
//
///**
// *
// * @author DELL
// */
//public class Rectangle implements Shape {
//    private double dai;
//    private double rong;
//
//    public Rectangle(double dai, double rong) {
//        this.dai = Math.min(dai, rong);
//        this.rong = Math.max(dai, rong);
//    }
//
//    
//
//    @Override
//    public String toString() {
//        return  "-----------------------\n" +  
//                "Width : " + String.format("%.2f", rong) + "\n" +
//                "Length : " + String.format("%.2f", dai) + "\n" +
//                "Perimeter : " + String.format("%.2f", getPerimeter()) + "\n" +
//                "Area : " +  String.format("%.2f", getArea()) + "\n" +
//                "-----------------------\n";
//    }
//
//    public double getArea() {
//        return (dai * rong);
//    }
//
//    public double getPerimeter() {
//        return 2 * (dai + rong);
//    }
//  
//}