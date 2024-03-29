/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author DELL
 */
public class J01006 {
    public static long[] ar= new long[93];
    private static  void fb(){
        ar[1]=1;
        ar[2]=1;
        for(int i=2; i<=92; i++){
            ar[i] =ar[i-1] + ar[i-2];
        }
    }
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        fb();
        while(t-- >0){
            int n= sc.nextInt();
            System.out.println(ar[n]);
        }
    }
}
