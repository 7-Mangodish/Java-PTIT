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
public class J02027_KhoangCachNhoHonK {
    public static int bi_search(int a[], int l, int r, int x){
        int pos =-1;
        while(l<=r){
            int m =(l+r)/2;
            if(a[m]<x){
                pos = m;
                l=m+1;
            }
            else
                r = m-1;
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            long ans =0;
            for(int i=0; i<n; i++){
                int pos = bi_search(a, i+1, n-1, k+a[i]);
                if(pos !=-1)
                    ans+= (pos-i);
            }
            System.out.println(ans);
        }
                
    }
}
