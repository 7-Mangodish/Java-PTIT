/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;

class Pair <T1, T2>{
    private T1 x;
    private T2 y;

    public Pair(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }
    public boolean check(int n){
        int tmp = n;
        if(tmp <2)
            return false;
        for(int i=2; i<=Math.sqrt(tmp); i++){
            if(tmp % i ==0)
                return false;
        }
        return true;
    }
    
    public  boolean isPrime(){
        if(check((Integer)x) && check((Integer)y))
            return true;
        return false;
    } 
    @Override
    public String toString(){
        return x + " " + y;
    }
}
public class J04020_LopPair {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                boolean check = false;
                for(int i = 2; i <= 2*Math.sqrt(n); i++){
                    Pair<Integer, Integer> p = new Pair<>(i, n-i);
                    if(p.isPrime()){
                        System.out.println(p);
                        check = true;
                        break; 
                    }
                }
                if(!check) System.out.println(-1);
            }
    }
}
