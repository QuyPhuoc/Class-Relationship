package org.example;
import java.util.*;

public class Comparator12 {
    public static int lastPos(int a[], int l, int r, int x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] >= x){
                res = mid; //ghi tam
                r = mid - 1;
            }else if(a[mid] < x){
                l = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b); //O(NlogN);
        for(int x : a){
            int pos = lastPos(b, 0, m - 1, x);
            if(pos == -1){
                System.out.print("0 ");
            }else{
                System.out.print(m - pos + " ");
            }
        }
    }
}
