/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;


public class J03021_DienThoaiCucGach {
    
    public static char sol(char s){
        if('A'<= s && s<= 'C')
            return '2';
        if('D'<=s && s<='F')
            return '3';
        if('G'<=s && s<='I')
            return '4';
        if('J'<=s && s<='L')
            return '5';
        if('M'<=s && s<='O')
            return '6';
        if('P'<=s && s<='S')
            return '7';
        if('T'<=s && s<='V')
            return '8';
        return '9';        
    }
    public static boolean check(String s){
        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
           String s= sc.nextLine();
           s= s.toUpperCase();
           String res="";
           for(int i=0; i<s.length(); i++){
               res+=sol(s.charAt(i));
           }
           if(check(res))
                System.out.println("YES");
           else
                System.out.println("NO");
        }
    }
}
/*
2
BOHIMA
IamACoder
*/
