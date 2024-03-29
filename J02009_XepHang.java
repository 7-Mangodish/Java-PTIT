/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author DELL
 */
class Pair{
    public int in, out;

    public Pair(int in, int out) {
        this.in = in;
        this.out = out;
    }
    
}
public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Pair a[] = new Pair[t];
        for(int i=0; i<t; i++){
            a[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        int sum =0;
        Arrays.sort(a, new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.in < o2.in)
                    return -1;
                if(o1.in == o2.in)
                    return o1.out - o2.out;
                return 1;
            }
            
        });
        for(Pair x: a){
            if(x.in > sum)
                sum = x.in + x.out;
            else
                sum += x.out;
        }
        System.out.println(sum);
    }
}
/*
5
2 1
2 4
2 3
8 3
5 7
*/