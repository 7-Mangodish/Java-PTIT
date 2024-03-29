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
public class J03008 {
    static boolean checkTN(String s){
        int l=0, r= s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            --r;
            ++l;
        }
        return true;
    }
    static boolean isPrime(int x){
        if(x<2)
            return false;
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
    static boolean check(String s){
        char c[]= s.toCharArray();
        for(char x:c){
            if(isPrime(x-'0')== false)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            if(checkTN(s) && check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
}
