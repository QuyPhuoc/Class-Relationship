package org.example;

import java.util.*;
public class Comparator1 {
        public static int soLe(int n){
            int le = 0;
            while(n != 0){
                if(n % 2 == 1){
                    le++;
                }
                n /= 10;
            }
            return le;
        }
        public static int soChan(int n){
            int chan = 0;
            while(n != 0){
                if(n % 2 == 0){
                    chan++;
                }
                n /= 10;
            }
            return chan;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer> list1 = new ArrayList<>(list);
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                if(soChan(x) != soChan(y)){
                    return soChan(x) - soChan(y);
                }
                return x - y;
            }
        });
        for(Integer x : list){
            System.out.print(x + " ");
        }
        System.out.println();
        Collections.sort(list1, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                return soLe(x) - soLe(y);
            }
        });
        for(Integer x : list1){
            System.out.print(x + " ");
        }
    }
}
