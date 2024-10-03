package org.example;

import java.util.*;
public class Comparator2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), X = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                if (Math.abs(x - X) != Math.abs(y - X)) {
                    return Math.abs(x - X) - Math.abs(y - X);
                }
                return x - y;
            }
        });
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        Arrays.sort(a, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                int r1 = x % 2, r2 = y % 2;
                if (r1 == 0 && r2 == 0) {
                    return x - y;
                } else if (r1 == 1 && r2 == 1) {
                    return y - x;
                } else if (r1 == 0 && r2 == 1) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
