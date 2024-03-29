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
public class J02014 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n= sc.nextInt();
            int a[]= new int[n+1];
            int sumr=0, suml=0;
            for(int i=1; i<=n; i++){
                a[i]= sc.nextInt();
                sumr +=a[i];
            }
            int ans=-1;
            for(int i=1; i<=n; i++){
                sumr-=a[i];
                suml+=a[i-1];
                if(sumr == suml){
                    ans =i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
