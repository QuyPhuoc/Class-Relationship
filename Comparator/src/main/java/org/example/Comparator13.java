package org.example;

import java.util.*;
public class Comparator13 {
    public static int firstPos(int a[],int l, int r, int x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] >= x){
                res = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return res;
    }
    public static int lastPos(int a[], int l, int r, int x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] <= x){
                res = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int query = sc.nextInt();
        for(int i = 0; i < query; i++){
            int l = sc.nextInt(), r = sc.nextInt();
            int first = firstPos(a, 0, n - 1, l);
            int last = lastPos(a, 0, n - 1, r);
            if(first == -1){
                System.out.println(0 + " ");
            }else{
                System.out.println(last - first + 1 + " ");
            }
        }
    }
}
