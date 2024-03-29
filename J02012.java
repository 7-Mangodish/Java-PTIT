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
public class J02012 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int a[]= new int[n];
        for(int i=0; i<n; i++)
            a[i]= sc.nextInt();
        for(int i=0; i<n; i++){
            int pos=i-1, tmp=a[i];
            while( pos >=0 && a[pos] >tmp){
                a[pos+1]=a[pos];
                --pos;
            }
            a[pos+1]= tmp;
            System.out.print("Buoc "+ i +":");
            for(int j=0; j<=i; j++)
                System.out.print(" "+a[j]);
            System.out.println("");
        }
    }
}
