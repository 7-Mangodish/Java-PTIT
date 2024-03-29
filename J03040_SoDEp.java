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
public class J03040_SoDEp {
    public static boolean checkIncrease(String s){
        for(int i=0; i<s.length()-1;i++ ){
            if(s.charAt(i) >= s.charAt(i+1))
                return false;
        }
        return true;
    }
    public static boolean checkChr(String s){
        for(int i=0 ;i<2; i++){
            if(s.charAt(i) != s.charAt(i+1))
                return false;
        }
        if(s.charAt(3) != s.charAt(4))
            return false;
        return true;
    }
    public static boolean checkLP(String s){
        for(int i=0 ;i<s.length(); i++){
            if(s.charAt(i)!='8' && s.charAt(i) != '6')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1= sc.nextLine();
            String s2= new String(s1);
            String res= s1.substring(5, 8) + s2.substring(9);
            if(checkIncrease(res) || checkLP(res) || checkChr(res))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
/*
7
29T1–123.45
29T1–555.55
29T1–222.33
29T1–686.88
29T1–123.33
29T1–555.54
29T1–606.88
*/