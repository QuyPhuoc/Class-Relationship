package org.example;

import  java.util.*;
public class Comparator9 {
    public static int lastPos(int a[], int l, int r, int x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] <= x){
                res = mid; //ghi tam
                l = mid + 1;
            }else if(a[mid] > x){
                r = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int pos = lastPos(a, 0, n - 1, x);
        if(pos == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println(a[pos]);
        }
    }
}
