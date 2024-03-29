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
public class J02022 {
    static boolean used[]= new boolean[15];
    static int ar[]= new int[15];
    static int n;
    
    static boolean check(){
        for(int i=1; i<n; i++){
            if(Math.abs(ar[i]-ar[i+1])==1)
                return false;
        }
        return true;
    }
    
    static void Try(int i){
        for(int j=1; j<=n; j++){
            if(used[j]){
                ar[i]=j;
                used[j]=false;
                if(i<n)
                    Try(i+1);
                if(i==n && check() ){
                    for(int k=1; k<=n; k++)
                        System.out.print(ar[k]);
                    System.out.println("");
                }
                used[j]=true;
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            for(int i=1; i<=10; i++)
                used[i]=true;
            
            n= sc.nextInt();
            Try(1);
        }
    }
}
