/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author DELL
 */
public class J01014 {
    static long sol(long n){
        long ans=0;
        for(int i=2; i<= Math.sqrt(n); i++){
            while(n%i ==0){
                ans=Math.max(ans,  i);
                n/=i;
            }
        }
        if(n!=1){
            ans= Math.max(ans, n);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            long n= sc.nextLong();
            System.out.println(sol(n));
            t-=1;
        }
        
    }
}
