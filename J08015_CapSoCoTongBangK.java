/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J08015_CapSoCoTongBangK {
    static public int first(long a[], int l, int r, long x){
        int pos=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){
                pos = m;
                r=m-1;
            }
            else if(a[m]<x)
                l=m+1;
            else
                r=m-1;
        }
        return pos;
    }
    static public int last(long a[], int l, int r, long x){
        int pos=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){
                pos = m;
                l=m+1;
            }
            else if(a[m]<x)
                l=m+1;
            else
                r=m-1;
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n, k;
            n =sc.nextInt();
            k = sc.nextInt();
            long a[] = new long[n];
            for(int i=0; i<n; i++)
                a[i]= sc.nextLong();
            Arrays.sort(a);
            long ans=0;
            for(int i=0; i<n-1; i++){
                int l = first(a, i+1, n-1, k-a[i]);
                int r = last(a, i+1, n-1, k-a[i]);
//                System.out.println(a[i] +" "+(k-a[i]) +" "+ l +" "+r);
                if(l!=-1 && r!=-1)
                    ans+= r-l+1;
            }
            System.out.println(ans);
        }
        
    }
}
