package org.example;
import java.util.*;
public class Comparator5 {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer>[] list = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                list[i] = new ArrayList<>();
                list[i].add(sc.nextInt());
                list[i].add(sc.nextInt());
            }
            Arrays.sort(list, new Comparator<ArrayList<Integer>>() {
                public int compare(ArrayList<Integer> x, ArrayList<Integer> y) {
                    if (x.get(1) != y.get(1)) {
                        return x.get(1) - y.get(1);
                    }
                    return y.get(0) - x.get(0);
                }
            });
            for (ArrayList<Integer> x : list) {
                System.out.println(x.get(0) + " " + x.get(1));
            }
        }
}
