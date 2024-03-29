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
public class J02004 {
    static int[] ar= new int[105];
    
    static boolean check(int n){
        int l=0, r=n-1;
        while( l<r){
            if(ar[l] != ar[r])
                return false;
            ++l;
            --r;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n= sc.nextInt();
            for(int i=0; i<n; i++)
                ar[i]= sc.nextInt();
            if(check(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
