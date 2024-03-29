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
public class J02020 {
    static int a[]= new int[15];
    static int n,k, cnt=0;
    
    static void out(){
        for(int i=0; i<k; i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
    
    static void Try(int i, int ind){
        for(int j=i+1; j<=n; j++){
            a[ind]=j;
            if(ind==k-1){
                out();
                cnt++;                
            }

            else
                Try(j, ind+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        k= sc.nextInt();
        Try(0,0);
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
