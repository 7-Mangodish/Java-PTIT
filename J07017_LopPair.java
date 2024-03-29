/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author DELL
 */
class Pair<T1,T2>{
    T1 a;
    T2 b;
    
    public Pair(T1 a,T2 b){
        this.a= a;
        this.b= b;
    }
    
    public boolean isPrime_1(T1 n){
        int s = Integer.parseInt(String.valueOf(n));
        if(s<2)
            return false;
        for(int i=2; i<= Math.sqrt(s); i++){
            if(s % i==0)
                return false;
        }
        return true;
    }
    public boolean isPrime_2(T2 n){
        int s = Integer.parseInt(String.valueOf(n));
        if(s<2)
            return false;
        for(int i=2; i<= Math.sqrt(s); i++){
            if(s % i==0)
                return false;
        }
        return true;
    }
    public boolean isPrime() {
        if(isPrime_1(a) && isPrime_2(b))
            return true;
        return false;
    }   
    
    @Override
    public String toString(){
        return String.format("%d %d", this.a, this. b);
    }
}
public class J07017_LopPair {
    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(new File("DATA.in"));
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
