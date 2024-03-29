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
public class J01011 {
    static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    static long lcm(long a, long b){
        long tmp=a*b;
        return tmp/gcd(a,b);
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long a= sc.nextLong();
            long b= sc.nextLong(); 
            System.out.println(lcm(a,b) +" "+gcd(a,b));
        }

    }
}
