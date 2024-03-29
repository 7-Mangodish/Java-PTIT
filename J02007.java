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
public class J02007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int t= sc.nextInt();
        for(int k=1; k<=t; k++){
            System.out.println("Test "+k+":");
            int n= sc.nextInt();
            int a[]= new int[100005];
            int ts[]= new int[100005];
            
            for(int i=0; i<n; i++){
                a[i]= sc.nextInt();
                ts[a[i]]++;
            }
            for(int i=0; i<n; i++){
                if(ts[a[i]]!=0){
                    System.out.println(a[i]+ " xuat hien "+ ts[a[i]]+ " lan");
                    ts[a[i]]=0;
                }
            }
        }
    }
}
