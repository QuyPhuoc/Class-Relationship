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
public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> list = new ArrayList();
        for(int i = 0; i < n; i++){
            String daugach = sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            ArrayList<Monhoc> list1 = new ArrayList<>();
            int somon = sc.nextInt();
            sc.nextLine();
            while(somon != 0){
                String mon = sc.nextLine();
                String sotcvadiem = sc.nextLine();
                String arr[] = sotcvadiem.split("\\s+");
                int sotc = Integer.parseInt(arr[0]);
                double diem = Double.parseDouble(arr[1]);
                Monhoc mh = new Monhoc(mon, sotc, diem);
                list1.add(mh);
                --somon;
            }
            Student st = new Student(ma,ten,lop, list1);
            list.add(st);
        }
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.tinhGPA() != o2.tinhGPA()){
                    return Double.compare(o2.tinhGPA(), o1.tinhGPA());
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(Student x : list){
            System.out.println(x.toString());
        }
    }
}
