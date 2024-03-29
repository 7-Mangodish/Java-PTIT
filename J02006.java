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
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int ar[]= new int[1005];
        for(int i=0; i<n; i++){
            int tmp;
            tmp= sc.nextInt();
            ar[tmp]++;
        }
        for(int i=0; i<m; i++){
            int tmp= sc.nextInt();
            ar[tmp]++;
        }
        for(int i=0; i<1000; i++){
            if(ar[i]!=0)
                System.out.print(i+" ");
        }
    }
}
