/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MainBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Book> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten;
            int giaban, soluong;
            ten = sc.nextLine();
            giaban = sc.nextInt();
            soluong = sc.nextInt();
            sc.nextLine();
            Author tacgia = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine());
            Book b = new Book(ten, tacgia, giaban, soluong);
            list.add(b);
        }
        Collections.sort(list, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.getGia() != o2.getGia()){
                    return (int) (o2.getGia() - o1.getGia());
                }
                return o1.getTensach().compareTo(o2.getTensach());
            }
        });
        
        for(Book x : list){
            System.out.print(x);
        }
    }
}
