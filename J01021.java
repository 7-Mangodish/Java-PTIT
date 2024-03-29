/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.Scanner;


public class J01021 {
    static long mod= 1000000007;
    static long bi_pow(long a, long b){
        long res=1;
        while(b!=0){
            if(b%2 ==1){
                res*=a;
                res %=mod;
            }
            a*=a;
            a%=mod;
            b/=2;
        }
        return res;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        long a,b;
        boolean ok= true;
        while( ok){
             a = sc.nextLong();
             b = sc.nextLong();        
             if(a ==0 && b==0)
                 break;
             System.out.println(bi_pow(a,b));
        }
    }
}
