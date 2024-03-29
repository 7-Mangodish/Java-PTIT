/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.*;

/**
 *
 * @author DELL
 */
public class J02021 {
    static int n,k, cnt=0;
    static int a[]= new int[15];
    static Scanner sc= new Scanner(System.in);
    
    static void out(){
        for(int i=1;i <=k; i++)
            System.out.print(a[i]);
        System.out.print(" ");
    }
    static void Try(int i, int ind){
        for(int j=i+1; j<=n; j++){
            a[ind]=j;
            if(ind==k){
                 out();
                 ++cnt;
            }

            else
                Try(j, ind+1);
        }
    }
    public static void main(String[] args) {
        n= sc.nextInt();
        k= sc.nextInt();
        Try(0,1);
        System.out.println("\nTong cong co "+cnt+ " to hop");
    }
}
