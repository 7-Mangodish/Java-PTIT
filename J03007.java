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
public class J03007 {
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
    
    static boolean check(String s){
        if(s.endsWith("8")== false)
            return false;
        char c[]= s.toCharArray();
        int sum=0;
        for(char x:c){
            sum+=(x-'0');
        }
        if(sum%10 !=0)
             return false;
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
