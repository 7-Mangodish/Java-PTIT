/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03016_ChiaHetCho11 {
    public static boolean check(String s){
        int sum1 =0, sum2 =0;
        for(int i=0; i<s.length(); i++){
            if(i%2==0)
                sum1 += s.charAt(i) - '0';
            else
                sum2 += s.charAt(i) - '0';
        }
        if(Math.abs(sum2-sum1) % 11 ==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check(s))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
