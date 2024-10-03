package org.example;
import java.util.*;

public class Comparator4 {
        public static int sapXep(int n){
            int res = 0;
            while(n != 0){
                int r = n % 10;
                if(r == 0 || r == 6 || r == 8){
                    res++;
                }
                n /= 10;
            }
            return res;
        }
        public static void main(String[] args) throws Exception{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list, new Comparator<Integer>() {
                public int compare(Integer x, Integer y) {
                    if(sapXep(x) != sapXep(y)){
                        return sapXep(y) - sapXep(x);
                    }
                    return x - y;
                }
            });
            for(Integer x : list){
                System.out.print(x + " ");
            }
        }
}

