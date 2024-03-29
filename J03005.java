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

public class J03005 {
    static void sol(String s){
        s= s.trim().toLowerCase();
        String w[]= s.split("\\s+");
        w[0]=w[0].toUpperCase();
        for(int i =1; i<w.length; i++){
            w[i]=w[i].substring(0,1).toUpperCase()
                    + w[i].substring(1, w[i].length());
            if (i != (w.length-1))
                System.out.print(w[i]+" ");
            else
                System.out.print(w[i]+",");           
        }
        System.out.println(" "+ w[0]);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            sol(s);
        }
    }
}
