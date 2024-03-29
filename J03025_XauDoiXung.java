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
public class J03025_XauDoiXung {
    public static boolean check(String s){
        int l=0, r= s.length()-1;
        int cnt=0;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
                cnt++;
            l++;
            r--;
        }
        if(s.length() %2==0){
            if(cnt==1)
                return true;
        }
        else{
            if(cnt <=1 )
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
/*
3
abccaa
abbcca
abcda
*/