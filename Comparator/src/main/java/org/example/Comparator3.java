package org.example;
import java.util.*;

public class Comparator3 {
        public static int Ngto(int n){
            int sum = 0;
            while(n != 0){
                int r = n % 10;
                if(r == 2 || r == 3 || r == 5 || r == 7){
                    sum++;
                }
                n /= 10;
            }
            return sum;
        }
        public static void main(String[] args) throws Exception{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer>[] list = new ArrayList[n];
            for(int i = 0; i < n; i++){
                list[i] = new ArrayList<>();
                list[i].add(sc.nextInt());
                list[i].add(sc.nextInt());
            }

            Arrays.sort(list, new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> x, ArrayList<Integer> y) {
                    int k1 = x.get(0) * x.get(0) + x.get(1) * x.get(1);
                    int k2 = y.get(0) * y.get(0) + y.get(1) * y.get(1);
                    if(k1 != k2){
                        return k1 - k2;
                    }
                    if(x.get(0) != y.get(0)){
                        return x.get(0) - y.get(0);
                    }
                    return x.get(1) - y.get(1);
                }
            });
            for(ArrayList<Integer> x : list){
                System.out.println(x.get(0) + " " + x.get(1));
            }
        }
}
