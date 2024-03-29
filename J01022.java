/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class J01022 {
    static long[] f= new long[93];
    static void fibo(){
        f[1]= 1;
        f[2]= 1;
        for(int i=2; i<=92; i++){
            f[i]= f[i-1]+f[i-2];
        }
    }
    
    static int sol(int n, long k){
        if(n==1) return 0;
        if(n==2) return 1;
        
        if(k >f[n-2])
            return sol(n-1, k -f[n-2]);
        return sol(n-2, k);
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        fibo();
        while( t-- >0){
            int n= sc.nextInt();
            long k= sc.nextLong();
            System.out.println(sol(n,k));
        }
    }
}
