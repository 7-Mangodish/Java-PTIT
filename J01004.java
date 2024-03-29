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
public class J01004 {
    
    public static boolean IsPrime(long a){
        if(a <2)
            return false;
        for(int i=2; i<= Math.sqrt(a); i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int t;
        t =sc.nextInt();
        while(t-- >0){
            long n;
            n= sc.nextLong();
            if(IsPrime(n)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
