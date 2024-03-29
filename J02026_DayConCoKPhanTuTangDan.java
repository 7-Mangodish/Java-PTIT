/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J02026_DayConCoKPhanTuTangDan {
    public static int n,k;
    public static LinkedList <Integer> l = new LinkedList<>();
    public static int a[];
    public static void Try(int ind){
        for(int i=ind+1; i<=n; i++){
            l.addLast(a[i]);
            if(l.size()<k)
                Try(i);
            if(l.size() == k){
                for(int x:l)
                    System.out.print(x+" ");
                System.out.println("");
            }
            l.removeLast();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int[n+1];
            for(int i=1; i<=n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a,1, n+1);
            Try(0);
        }
    }
}
