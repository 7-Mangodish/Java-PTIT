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
public class J02008 {
    static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    static long lcm(long a, long b){
        long tmp=a*b;
        return tmp/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n= sc.nextInt();
            long ans=1;
            for(int i=2; i<=n; i++){
                ans =lcm(ans, i);
            }
            System.out.println(ans);
        }
    }
}
