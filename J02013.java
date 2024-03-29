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
public class J02013 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[] =new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        for(int i=0 ;i<n; i++){
            boolean ok= false;
            for(int j=0; j< n-i-1; j++){
                if(a[j] > a[j+1]){
                    ok= true;
                    int tmp= a[j];
                    a[j]= a[j+1];
                    a[j+1]=tmp;
                }
            }
            if(ok){
                System.out.print("Buoc " + (i+1) + ":");
                for(int x:a)
                    System.out.print(" "+x);
                System.out.println("");
            }
        }
    }
}
