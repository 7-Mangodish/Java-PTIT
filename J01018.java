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
public class J01018 {
    static boolean check(String s){
        int sum=0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            sum +=(c-'0');
        }
        if(sum %10 !=0)
            return false;
        for(int i=0; i<s.length()-1; i++){
            char c1= s.charAt(i);
            char c2= s.charAt(i+1);
            if(Math.abs(c1-c2) != 2)
                return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s = sc.nextLine();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
            t-=1;
        }
    }
}
/*
3
1353
246864
123435
*/