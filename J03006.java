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
public class J03006 {
    static boolean check(String s){
        char c[]= s.toCharArray();
        for(char x:c){
            if((x-'0') %2!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
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
