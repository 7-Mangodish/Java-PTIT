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
public class J01005 {
    public static void main(String srg[]){
        Scanner sc = new Scanner(System.in);
        int t;
        t= sc.nextInt();
        while(t-- >0){
            int n =sc.nextInt();
            int h =sc.nextInt();
            for(int i=1; i<n; i++){
                double tmp= (double)h*Math.sqrt((double)i/n);
                System.out.printf("%.6f ", tmp);
            }
            System.out.print('\n');
        }
    }
}
